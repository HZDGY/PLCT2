package com.PLCT.pojo;

import java.util.Objects;

public class FunctionE {
    public  String funcion;
    public  String a;
    public  String b;
    public  String c;
    public  String d;
    public  String e;

    public FunctionE() {
    }

    public FunctionE(String funcion, String a, String b, String c, String d, String e) {
        this.funcion = funcion;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }

    public FunctionE(String funcion, String a, String b, String c, String d) {
        this.funcion = funcion;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public FunctionE(String funcion, String a, String b, String c) {
        this.funcion = funcion;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public FunctionE(String funcion, String a, String b) {
        this.funcion = funcion;
        this.a = a;
        this.b = b;
    }

    public FunctionE(String funcion, String a) {
        this.funcion = funcion;
        this.a = a;
    }

    public String getFuncion() {
        return funcion;
    }

    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FunctionE functionE = (FunctionE) o;
        return Objects.equals(funcion, functionE.funcion) && Objects.equals(a, functionE.a) && Objects.equals(b, functionE.b) && Objects.equals(c, functionE.c) && Objects.equals(d, functionE.d);
    }

    @Override
    public int hashCode() {
        return Objects.hash(funcion, a, b, c, d);
    }
}
