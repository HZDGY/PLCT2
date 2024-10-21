package com.PLCT.Utils;

import com.PLCT.pojo.FunctionE;

import java.util.HashMap;

public class set {
    public static HashMap<String,String> setVariables(HashMap<String,String> stringStringHashMap, FunctionE functionE){
        if(functionE.a != null) {
            String[] parts = functionE.a.split("=");
            stringStringHashMap.put(parts[0], parts[1]);
        }
        if(functionE.b != null) {
            String[] parts1 = functionE.b.split("=");
            stringStringHashMap.put(parts1[0], parts1[1]);
        }
        if(functionE.c != null) {
            String[] parts2 = functionE.c.split("=");
            stringStringHashMap.put(parts2[0], parts2[1]);
        }
        if(functionE.d != null) {
            String[] parts3 = functionE.d.split("=");
            stringStringHashMap.put(parts3[0], parts3[1]);
        }
        if(functionE.e != null) {
            String[] parts4 = functionE.e.split("=");
            stringStringHashMap.put(parts4[0], parts4[1]);
        }
        return stringStringHashMap;
    }
}
