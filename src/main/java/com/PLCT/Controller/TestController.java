package com.PLCT.Controller;

import java.net.URL;
import java.util.*;

import com.PLCT.Start.StartProgrammeIntialize;
import com.PLCT.Utils.Utils;
import com.PLCT.pojo.Controls;
import com.PLCT.pojo.FunctionE;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class TestController {
    private FunctionE functione;
    @FXML
    private Button RESETALL;
    @FXML
    private Button SaveElements;
    @FXML
    private Button RESETELMENTS;
    @FXML
    private TextField txt_function,element_1,element_2,element_3,element_4,element_5;
    @FXML
    private Label element_label1,element_label2,element_label3,element_label4,element_label5,
            element_label2_1,element_label2_2,element_label2_3,element_label2_4,element_label2_5,
            element_label3_1,element_label3_2,element_label3_3,element_label3_4,element_label3_5,
            element_label4_1,element_label4_2,element_label4_3,element_label4_4,element_label4_5,
            element_label5_1,element_label5_2,element_label5_3,element_label5_4,element_label5_5;
    @FXML
    private TextField data_1_1,data_1_2,data_1_3,data_1_4,data_1_5
            ,data_2_1,data_2_2,data_2_3,data_2_4,data_2_5
            ,data_3_1,data_3_2,data_3_3,data_3_4,data_3_5
            ,data_4_1,data_4_2,data_4_3,data_4_4,data_4_5
            ,data_5_1,data_5_2,data_5_3,data_5_4,data_5_5;
    @FXML
    private TextField resoult,resoult1,resoult2,resoult3,resoult4,resoult5;
    @FXML
    private TextField promot;



    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    void initialize() {
        functione = new FunctionE();
        Controls controls = new Controls(promot);
        StartProgrammeIntialize.start(controls);
    }



    @FXML
    void onClicked() {
        txt_function.setText("");
        element_5.setText("");
        element_1.setText("");
        element_2.setText("");
        element_3.setText("");
        element_4.setText("");
        data_1_1.setText("");
        data_1_2.setText("");
        data_1_3.setText("");
        data_1_4.setText("");
        data_1_5.setText("");
        data_2_1.setText("");
        data_2_2.setText("");
        data_2_3.setText("");
        data_2_4.setText("");
        data_2_5.setText("");
        data_3_1.setText("");
        data_3_2.setText("");
        data_3_3.setText("");
        data_3_4.setText("");
        data_3_5.setText("");
        data_4_1.setText("");
        data_4_2.setText("");
        data_4_3.setText("");
        data_4_4.setText("");
        data_4_5.setText("");
        data_5_1.setText("");
        data_5_2.setText("");
        data_5_3.setText("");
        data_5_4.setText("");
        data_5_5.setText("");
        element_label1.setText("");
        element_label2.setText("");
        element_label3.setText("");
        element_label4.setText("");
        element_label5.setText("");
        element_label2_1.setText("");
        element_label2_2.setText("");
        element_label2_3.setText("");
        element_label2_4.setText("");
        element_label2_5.setText("");
        element_label3_1.setText("");
        element_label3_2.setText("");
        element_label3_3.setText("");
        element_label3_4.setText("");
        element_label3_5.setText("");
        element_label4_1.setText("");
        element_label4_2.setText("");
        element_label4_3.setText("");
        element_label4_4.setText("");
        element_label4_5.setText("");
        element_label5_1.setText("");
        element_label5_2.setText("");
        element_label5_3.setText("");
        element_label5_4.setText("");
        element_label5_5.setText("");
        resoult.setText("");
        resoult1.setText("");
        resoult2.setText("");
        resoult3.setText("");
        resoult4.setText("");
    }
    @FXML
    void onClicked2() {
        element_label1.setText(element_1.getText());
        element_label2.setText(element_2.getText());
        element_label3.setText(element_3.getText());
        element_label4.setText(element_4.getText());
        element_label5.setText(element_5.getText());
        element_label2_1.setText(element_1.getText());
        element_label2_2.setText(element_2.getText());
        element_label2_3.setText(element_3.getText());
        element_label2_4.setText(element_4.getText());
        element_label2_5.setText(element_5.getText());
        element_label3_1.setText(element_1.getText());
        element_label3_2.setText(element_2.getText());
        element_label3_3.setText(element_3.getText());
        element_label3_4.setText(element_4.getText());
        element_label3_5.setText(element_5.getText());
        element_label4_1.setText(element_1.getText());
        element_label4_2.setText(element_2.getText());
        element_label4_3.setText(element_3.getText());
        element_label4_4.setText(element_4.getText());
        element_label4_5.setText(element_5.getText());
        element_label5_1.setText(element_1.getText());
        element_label5_2.setText(element_2.getText());
        element_label5_3.setText(element_3.getText());
        element_label5_4.setText(element_4.getText());
        element_label5_5.setText(element_5.getText());
    }

    @FXML
    void onClickedC() {
        caculate(functione,txt_function,element_label1,element_label2,element_label3,element_label4,element_label5
        ,data_1_1,data_1_2,data_1_3,data_1_4,data_1_5,resoult);
        caculate(functione,txt_function,element_label2_1,element_label2_2,element_label2_3,element_label2_4,element_label2_5
        ,data_2_1,data_2_2,data_2_3,data_2_4,data_2_5,resoult1);
        caculate(functione,txt_function,element_label3_1,element_label3_2,element_label3_3,element_label3_4,element_label3_5
        ,data_3_1,data_3_2,data_3_3,data_3_4,data_3_5,resoult2);
        caculate(functione,txt_function,element_label4_1,element_label4_2,element_label4_3,element_label4_4,element_label4_5
        ,data_4_1,data_4_2,data_4_3,data_4_4,data_4_5,resoult3);
        caculate(functione,txt_function,element_label5_1,element_label5_2,element_label5_3,element_label5_4,element_label5_5
        ,data_5_1,data_5_2,data_5_3,data_5_4,data_5_5,resoult4);
    }

    private void caculate(FunctionE functione,TextField txt_function,Label element_label1
    ,Label element_label2,Label element_label3,Label element_label4,Label element_label5
    ,TextField data_1_1,TextField data_1_2,TextField data_1_3,TextField data_1_4,TextField data_1_5
    ,TextField resoult) {
        if(txt_function.getText().isEmpty()){
            promot.setText("函数不能为空!");
            return;
        }
        functione.funcion = txt_function.getText();
        if(!element_label1.getText().isEmpty()) {
            functione.a = element_label1.getText() + "=" + data_1_1.getText();
        }
        if(!element_label2.getText().isEmpty()) {
            functione.b = element_label2.getText() + "=" + data_1_2.getText();
        }
        if(!element_label3.getText().isEmpty()) {
            functione.c = element_label3.getText() + "=" + data_1_3.getText();
        }
        if(!element_label4.getText().isEmpty()) {
            functione.d = element_label4.getText() + "=" + data_1_4.getText();
        }
        if(!element_label5.getText().isEmpty()) {
            functione.e = element_label5.getText() + "=" + data_1_5.getText();
        }
        double calculate = 0;
        try {
            calculate = Utils.calculate(functione);
        } catch(Exception ignored){

        }
        resoult.setText(calculate + "");
    }

    @FXML
    void setEmptyFunction() {
        if (!promot.getText().isEmpty()){
            promot.setText("");
        }
        ifAlreadyHas();
    }

    @FXML
    void ifAlreadyHas(){
        List<TextField> textFields = new ArrayList<>();
        textFields.add(element_1);
        textFields.add(element_2);
        textFields.add(element_3);
        textFields.add(element_4);
        textFields.add(element_5);
        boolean set = set(textFields);
        if(!set){
            promot.setText("");
        }
    }

    private boolean set(List<TextField> textFields) {
        for (int i = 0; i < 5; i++){
            for (int j = i+1; j < 5; j++) {
                if(textFields.get(i).getText().equals(textFields.get(j).getText()) && !textFields.get(i).getText().isEmpty()){
                    promot.setText("参数重复!!");
                    return true;
                };
            }
        }
        return false;
    }

}
