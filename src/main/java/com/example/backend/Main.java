package com.example.backend;

import com.example.backend.Database.Database;
import com.example.backend.storage.BQLStorageBlock;
import com.example.backend.storage.Serialisation;

public class Main {
    public static void main(String[] args){
        BQLStorageBlock storage = new BQLStorageBlock("/Users/ben/TEST_DIRECTORY");
        Database database = new Database(storage, "test_database");

        Serialisation.saveObjectToDisk(database, storage.storagePath);
        Database db = Serialisation.loadDatabaseFromDisk("/Users/ben/TEST_DIRECTORY/test_database.bql");

        System.out.println(db.databaseName);
    }
}
