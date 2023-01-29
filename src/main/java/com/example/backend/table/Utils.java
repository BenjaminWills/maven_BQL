package com.example.backend.table;

import java.util.*;

public class Utils {
    // This class is just used for utilities in the table directory.

    public static boolean equalArrayOrderIndependent(String[] array1, String[] array2){
        Arrays.sort(array1);
        Arrays.sort(array2);
        return Arrays.equals(array1, array2);
    }
}
