package com.example.frontend;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class APIRequests {

    public static void getRequest(String requestURL) throws IOException{
        URL url = new URL(requestURL);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        connection.setRequestMethod("GET");
        connection.setRequestProperty("Content-Type","application/json");
        connection.setRequestProperty("Accept","application/json");

        HttpURLConnection.setFollowRedirects(true);

        connection.setInstanceFollowRedirects(false);

        InputStream ip = connection.getInputStream();
 
        BufferedReader streamReader = new BufferedReader(new InputStreamReader(ip));

        StringBuilder response = new StringBuilder();
        String responseSingle = null;
 
        while ((responseSingle = streamReader.readLine()) != null) {
            response.append(responseSingle);
        }
        String xx = response.toString();
        System.out.println(xx);
    }
    public static void main(String[] args) throws IOException{

        URL url = new URL("http://127.0.0.1:4567/database/testDatabaseFour.bql");

        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        connection.setRequestMethod("GET");
        connection.setRequestProperty("Content-Type","application/json");
        connection.setRequestProperty("Accept","application/json");

        HttpURLConnection.setFollowRedirects(true);

        connection.setInstanceFollowRedirects(false);

        InputStream ip = connection.getInputStream();
 
        BufferedReader br1 = new BufferedReader(new InputStreamReader(ip));

        StringBuilder response
                    = new StringBuilder();
                String responseSingle = null;
 
                while ((responseSingle = br1.readLine())
                       != null) {
                    response.append(responseSingle);
                }
                String xx = response.toString();
                System.out.println(xx);
            }

}
    

