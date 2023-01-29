package com.example.backend.table;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.example.backend.Schema.Schema;
import com.example.backend.user.User;

public class Table implements Serializable{

    public List< Row > rows;
    public String tableName;
    public String[] structure;
    public List < User > users;
    public Schema schema;

    public Table(String name, String[] structure, Schema schema){
        this.schema = schema;
        this.rows = initialiseRows(); // A list of hashmaps that represent rows.
        this.users = initialiseUsers(); // A list of users that are permitted to access the table
        this.tableName = name; // Name of the table.
        this.structure = structure; // schema of the table 
    }

    /**
     * Returns an empty arraylist of type Row
     */
    private ArrayList< Row > initialiseRows(){
        return new ArrayList< Row >();
    }

    /**
     * Returns an empty arraylist of type User
     */
    private ArrayList< User > initialiseUsers(){
        return new ArrayList< User >();
    }

    /**
     * @param newName is the new name given to the table
     */
    public void updateTableName(String newName){
        String oldName = this.tableName;
        this.tableName = newName;
        System.out.println("The table with the name " + oldName + " has been changed to: " + newName);
    }


    /**
     * @param row a row to insert into the table
     */
    public void insertRow(Row row){
        try{
            this.rows.add(row);
        }catch (Exception tableException) {
            System.out.println(tableException);
        }
    }

    public void deleteRow(Object field, Object criteria){
        for (int i = 0; i < this.rows.size(); i++){
            Row row = rows.get(i);
            if(row.hashedRow.get(field).equals(criteria)){
                rows.remove(row);
            }
        }
    }

    public Boolean accessTable(){
        return true;
    }

    public static void main(String[] args){
    }
}
