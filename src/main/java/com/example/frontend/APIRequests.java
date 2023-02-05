package com.example.frontend;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONObject;

public class APIRequests {

    public static String getResponseAsString(String requestURL) throws IOException{
        URL url = new URL(requestURL);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        connection.setRequestMethod("GET");
        connection.setRequestProperty("Content-Type","application/json");
        connection.setRequestProperty("Accept","application/json");

        InputStream ip = connection.getInputStream();
 
        BufferedReader streamReader = new BufferedReader(new InputStreamReader(ip));

        StringBuilder response = new StringBuilder();
        String responseSingle = null;
 
        while ((responseSingle = streamReader.readLine()) != null) {
            response.append(responseSingle);
        }
        String responseString = response.toString();
        return responseString;
    }

    public static JSONObject getResponseAsJSONObject(String requestURL) throws IOException{
        JSONObject JSONResponse = new JSONObject(
            getResponseAsString(requestURL)
        );
        return JSONResponse;
    }
    public static void main(String[] args) throws IOException{
        System.out.println(
            getResponseAsJSONObject("http://127.0.0.1:4567/database/testDatabaseTwo.bql"));
}
}
    

