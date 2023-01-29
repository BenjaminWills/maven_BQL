package com.example.backend.Schema;

import java.util.ArrayList;
import java.util.List;

import com.example.backend.Database.Database;
import com.example.backend.table.Table;

public class Schema {
    // Schemas hold tables

    List < Table > tables;
    Database database;
    String schemaName;

    public Schema(Database database, String schemaName){
        this.database = database;
        this.schemaName = schemaName;
        this.tables = initialiseTables();
    }

    private ArrayList < Table > initialiseTables(){
        return new ArrayList < Table > ();
    }

    public void addTable(Table table){
        this.tables.add(table);
    }
}
