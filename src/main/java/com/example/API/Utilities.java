package com.example.API;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.json.JSONObject;

import com.example.backend.Database.Database;
import com.example.backend.storage.BQLStorageBlock;

public class Utilities {

    public static JSONObject HashmapToJSON(HashMap<String,Object> rowContents){
        JSONObject json;
        json = new JSONObject(rowContents);
        return json;
    }

    public static List<Database> getDatabases(BQLStorageBlock storageBlock){
        List<Database> databases;
        databases = storageBlock.databases;
        return databases;
    }

    public static ArrayList<String> listDatabaseNames(BQLStorageBlock storageBlock){
        ArrayList<String> databaseNameList;
        
        databaseNameList = new ArrayList<String>();

        for (Database db : getDatabases(storageBlock)){
            databaseNameList.add(db.databaseName);
        }
        return databaseNameList;
    }
}
