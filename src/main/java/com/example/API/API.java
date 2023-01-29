package com.example.API;

import static spark.Spark.*;

import com.example.backend.Database.Database;
import com.example.backend.storage.Serialisation;

public class API {

    public static void baseEndPoint(){
        get("/", (request, response) -> {
            return "Welcome to the BQL API!";
        });
        
    }

    public static void testEndpoint(){
        get("/test/:test", (request, response) -> {
            String test = request.params(":test");
            return test;
        });
    }

    public static void getDatabase(){
        get("/database/:databaseName", (request, response) -> {
            String databaseName = request.params(":databaseName");
            Database db = Serialisation.loadDatabaseFromDisk(
                "/Users/ben/TEST_DIRECTORY/"+databaseName
            );
            return Utilities.HashmapToJSON(db.schemas.get(0).tables.get(0).rows.get(0).getHashedRow());
        });
    }
    public static void main(String[] args) {
        baseEndPoint();
        testEndpoint();
        getDatabase();
    }
}