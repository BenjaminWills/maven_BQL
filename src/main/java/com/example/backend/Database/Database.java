package com.example.backend.Database;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.example.backend.Schema.Schema;
import com.example.backend.storage.BQLStorageBlock;

public class Database implements Serializable{
    // Schemas hold tables

    public List < Schema > schemas;
    BQLStorageBlock storageBlock;
    public String databaseName;

    public Database(BQLStorageBlock storageBlock, String databaseName){
        this.schemas = initialiseSchemas();
        this.storageBlock = storageBlock;
        this.databaseName = databaseName;
    }

    private ArrayList < Schema > initialiseSchemas(){
        return new ArrayList < Schema > ();
    }

    public void addSchema(Schema schema){
        this.schemas.add(schema);
    }
}
