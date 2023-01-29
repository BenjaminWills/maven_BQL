package com.example.backend.table;

import java.io.Serializable;
import java.util.HashMap;

public class Row implements Serializable {
    Table parentTable;
    String[] keys,correctStructure;
    Object[] values;
    String table;
    HashMap<String,Object> hashedRow;

    public Row(String[] keys, Object[] values, Table parentTable){
        // specify the order of entering keys and values, with a 1 2 1 relationship
        this.keys = keys;
        this.values = values;
        this.table = parentTable.tableName;
        this.correctStructure = parentTable.structure;
        this.hashedRow = getHashedRow();
    }

    /**
     Converts a two lists into a hashmap of keys and values.
     */
    public HashMap<String,Object> getHashedRow(){

        Integer numOfKeys = this.keys.length;
        Integer numOfValues = this.values.length;

        if(numOfKeys != numOfValues){
            throw new IllegalArgumentException(
                "The number of keys doesn't match the number of values.");
        }

        if(!Utils.equalArrayOrderIndependent(this.keys,this.correctStructure)){
            throw new IllegalArgumentException(
                "The schema does not match that of the parent table.");
        }

        if(numOfKeys != this.correctStructure.length){
            throw new IllegalArgumentException(
                "The the number of keys is different to that of the schema.");
        }

        HashMap<String,Object> hashRow =  new HashMap<>();
        for (int i = 0; i < numOfKeys; i ++){
            String key = this.keys[i];
            Object values = this.values[i];
            hashRow.put(key,values);
        }
        return hashRow;
    }
}
