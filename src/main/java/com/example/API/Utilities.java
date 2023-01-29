package com.example.API;

import java.util.HashMap;

import org.json.JSONObject;

public class Utilities {
    public static String HashmapToJSON(HashMap<String,Object> rowContents){
        JSONObject json = new JSONObject(rowContents);
        return json.toString();
    }
}
