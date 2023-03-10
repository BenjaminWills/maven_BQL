package com.example.backend.Schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.example.backend.Database.Database;
import com.example.backend.table.Table;

public class Schema implements Serializable{
    // Schemas hold tables

    public List < Table > tables;
    public Database database;
    public String schemaName;

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
