package com.example.backend;

import com.example.backend.Database.Database;
import com.example.backend.Schema.Schema;
import com.example.backend.storage.BQLStorageBlock;
import com.example.backend.storage.Serialisation;
import com.example.backend.table.Row;
import com.example.backend.table.Table;

public class Main {
    public static void main(String[] args){
        BQLStorageBlock storage = new BQLStorageBlock("/Users/ben/TEST_DIRECTORY");
        Database database = new Database(storage, "testDatabaseTwo");

        Schema schema = new Schema(database,"schema");
        database.addSchema(schema);

        String[] structure = {"testColumnOne"};
        Table table = new Table("table",structure,schema);
        schema.addTable(table);

        String[] rowContents = {"testRowOne"};
        Row row = new Row(structure,rowContents, table);
        table.insertRow(row);

        Serialisation.saveObjectToDisk(database, storage.storagePath);
        Database db = Serialisation.loadDatabaseFromDisk("/Users/ben/TEST_DIRECTORY/test_database.bql");

        System.out.println(db.schemas.table.tableName);
    }
}
