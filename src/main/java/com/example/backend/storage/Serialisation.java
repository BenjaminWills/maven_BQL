package com.example.backend.storage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.example.backend.Database.Database;

public class Serialisation {
    public static void saveObjectToDisk(Database database, String dirPath){
        try {
            FileOutputStream f = new FileOutputStream(new File(dirPath + "/" + database.databaseName + ".bql"));
            ObjectOutputStream o = new ObjectOutputStream(f);

            // Write objects to file
            o.writeObject(database);

            o.close();
            f.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Error initializing stream");
            e.printStackTrace();
        }
    }

    public static Database loadDatabaseFromDisk(String dirPath){
        try{
            FileInputStream fi = new FileInputStream(new File(dirPath));
            ObjectInputStream oi = new ObjectInputStream(fi);

            Database database = (Database) oi.readObject();
            oi.close();
            fi.close();
            return database;
        }catch (FileNotFoundException e) {
            System.out.println("File not found");
        }catch (IOException e) {
            System.out.println("Error initializing stream");
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
