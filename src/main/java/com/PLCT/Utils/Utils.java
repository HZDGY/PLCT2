package com.PLCT.Utils;

import com.PLCT.pojo.FunctionE;

import java.util.HashMap;
import java.util.Stack;

public class Utils {

    //[2+(2+3)]

        public static double calculate(FunctionE functionE) throws Exception {
            String funcion = functionE.getFuncion();
            HashMap<String, String> stringStringHashMap = new HashMap<>();

            // 添加变量到 HashMap
            stringStringHashMap = set.setVariables(stringStringHashMap,functionE);


            // 移除 "y=" 和空格
            funcion = funcion.replaceAll("y=", "").replaceAll("\\s+", "");

            Stack<Double> values = new Stack<>();
            Stack<Character> operators = new Stack<>();

            for (int i = 0; i < funcion.length(); i++) {
                char c = funcion.charAt(i);
                if(!Character.isDigit(funcion.charAt(i)) && !isSymbol(Character.toString(funcion.charAt(i)))) {
                    StringBuilder number1 = new StringBuilder();
                    while (i < funcion.length()&&!Character.isDigit(funcion.charAt(i)) && !isSymbol(Character.toString(funcion.charAt(i)))) {
                        number1.append(funcion.charAt(i));
                        i++;
                    }
                    i--;
                    String variable = null;
                    variable = isVariable(number1.toString(), stringStringHashMap);
                    if (!variable.isEmpty()) {
                        values.push(Double.parseDouble(variable));
                        continue; // 继续下一个字符
                    }
                    continue;
                }






                // 处理数字
                if (Character.isDigit(c) || c == '.') {
                    StringBuilder number = new StringBuilder();
                    while (i < funcion.length() && (Character.isDigit(funcion.charAt(i)) || funcion.charAt(i) == '.')) {
                        number.append(funcion.charAt(i));
                        i++;
                    }
                    values.push(Double.parseDouble(number.toString()));
                    i--; // 调整索引
                } else if (c == '(' || c == '[' || c == '{') {
                    operators.push(c);
                } else if (c == ')' || c == ']' || c == '}') {
                    while (operators.peek() != '(' && operators.peek() != '[' && operators.peek() != '{') {
                        if (values.size() < 2) {
                            throw new Exception("Unbalanced parentheses.");
                        }
                        double b = values.pop();
                        double a = values.pop();
                        values.push(applyOperation(operators.pop(), b, a));
                    }
                    operators.pop(); // 弹出左括号
                } else if (isOperator(c)) {    //[  +
                    while (!operators.isEmpty() && precedence(operators.peek()) >= precedence(c)) {
                        if (values.size() < 2) {
                            throw new Exception("Unbalanced parentheses.");
                        }
                        double b = values.pop();
                        double a = values.pop();
                        values.push(applyOperation(operators.pop(), b, a));
                    }
                    operators.push(c);
                }
            }

            // 处理剩余的运算符
            while (!operators.isEmpty()) {
                if (values.size() < 2) {
                    if (values.size() == 1) {
                        return values.pop(); // 如果栈中只剩下一个元素，那么直接返回这个元素
                    } else {
                        throw new Exception("Unbalanced parentheses.");
                    }
                }
                double b = values.pop();
                double a = values.pop();
                values.push(applyOperation(operators.pop(), b, a));
            }

            return values.pop(); // 返回结果
        }

        public static String isVariable(String str, HashMap<String, String> stringStringHashMap) {
            return stringStringHashMap.get(str) != null ? stringStringHashMap.get(str) : "";
        }

        private static boolean isOperator(char c) {
            return c == '+' || c == '-' || c == '*' || c == '/' || c == '^';
        }

        private static int precedence(char operator) {
            return switch (operator) {
                case '+', '-' -> 1;
                case '*', '/' -> 2;
                case '^' -> 3; // 幂运算的优先级最高
                default -> -1;
            };
        }

        private static double applyOperation(char operator, double b, double a) throws Exception {
            return switch (operator) {
                case '+' -> a + b;
                case '-' -> a - b;
                case '*' -> a * b;
                case '/' -> {
                    if (b == 0) throw new Exception("Unbalanced parentheses.");
                    yield a / b;
                }
                case '^' -> Math.pow(a, b);
                default -> // 使用 Math.pow 进行幂运算
                        0;
            };
        }
        //判断是不是符号
        public static boolean isSymbol(String a)
        {
            return a.equals("+")||a.equals("-")||a.equals("*")||a.equals("/")||a.equals("^")||a.equals("(")||a.equals(")")||a.equals("[")
            ||a.equals("]")||a.equals("{")||a.equals("}");
        }
}
