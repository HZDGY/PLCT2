package com.PLCT.pojo;

import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

import java.util.List;

public class ZITI {
    static List<String> fontFamilies = Font.getFamilies();
    static List<String> fontNames    = Font.getFontNames();
    public static void fontfamilies(){
        for(String fontFamily : fontFamilies){
            System.out.println(fontFamily);
        }
        System.out.println("------------");
        for(String fontName : fontNames){
            System.out.println(fontName);
        }
    }
}
