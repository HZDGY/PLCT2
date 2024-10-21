package com.PLCT;

import com.PLCT.Utils.Utils;
import com.PLCT.pojo.FunctionE;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.util.Objects;

// 继承Application抽象类，重新start方法
public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        FunctionE functionE = new FunctionE("y=x^2", "x=3", "a=5", "b=2");
        double result = Utils.calculate(functionE);
        System.out.println("Result: " + result);

        // 加载 FXML 文件并获取根节点
        FXMLLoader loader = new FXMLLoader(Objects.requireNonNull(getClass().getClassLoader().getResource("Test.fxml")));
        Parent root = loader.load();

        // 获取加载的控制器（如果需要）
        // Controller controller = loader.getController();

        // 设置舞台标题和场景
        primaryStage.setTitle("PLCT(简单计算器)");
        primaryStage.setScene(new Scene(root, 1300, 1000));
        primaryStage.show();
        primaryStage.getIcons().add(new javafx.scene.image.Image(getClass().getResource("/icon.png").toString()));

        // 查找 TextArea 控件并设置文本
        TextArea textArea = (TextArea) root.lookup("#textArea");
        if (textArea != null) {
            textArea.setText("这是一段字符看看什么情况");
        } else {
            System.out.println("TextArea not found!");
        }
    }
}
