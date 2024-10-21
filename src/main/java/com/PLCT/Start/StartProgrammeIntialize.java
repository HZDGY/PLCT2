package com.PLCT.Start;

import com.PLCT.pojo.Controls;
import javafx.scene.control.TextField;

public class StartProgrammeIntialize {
    public static void start(Controls controls) {
        TextField promot = controls.getPromot();
        promot.setStyle("-fx-background-color: transparent; -fx-border-color: transparent; -fx-text-fill: red; -fx-font-size:30 ");
        promot.setEditable(false);
    }

}
