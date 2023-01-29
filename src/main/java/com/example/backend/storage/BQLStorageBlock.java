package com.example.backend.storage;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.example.backend.Database.Database;

public class BQLStorageBlock implements Serializable{

    List < Database > databases;
    public String storagePath;
    
    public BQLStorageBlock(String storagePath){
        makeStorageDirectory(storagePath);
        this.databases = intialiseDatabases();
        this.storagePath = storagePath;
    }

    private ArrayList<Database> intialiseDatabases(){
        return new ArrayList<Database>();
    }

    private void makeStorageDirectory(String storagePath){
        File theDir = new File(storagePath);
        if (!theDir.exists()){
            theDir.mkdirs();
            }
    }

    public void addDatabase(Database database){
        this.databases.add(database);
        saveDatabaseToDisk(database);  
    }

    public Database getDatabase(String databaseStoragePath){
        return Serialisation.loadDatabaseFromDisk(databaseStoragePath);
    }

    private void saveDatabaseToDisk(Database database){
        Serialisation.saveObjectToDisk(database, this.storagePath);
    }
}
