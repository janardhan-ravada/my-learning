package com.codeeval.solutions;

import java.util.HashMap;

public class ExcelColumn {

    public static final HashMap<Integer, String> alphabets = new HashMap<Integer, String>();

    static {
        alphabets.put(1, "A");
        alphabets.put(2, "B");
        alphabets.put(3, "C");
        alphabets.put(4, "D");
        alphabets.put(5, "E");
        alphabets.put(6, "F");
        alphabets.put(7, "G");
        alphabets.put(8, "H");
        alphabets.put(9, "I");
        alphabets.put(10, "J");
        alphabets.put(11, "K");
        alphabets.put(12, "L");
        alphabets.put(13, "M");
        alphabets.put(14, "N");
        alphabets.put(15, "O");
        alphabets.put(16, "P");
        alphabets.put(17, "Q");
        alphabets.put(18, "R");
        alphabets.put(19, "S");
        alphabets.put(20, "T");
        alphabets.put(21, "U");
        alphabets.put(22, "V");
        alphabets.put(23, "W");
        alphabets.put(24, "X");
        alphabets.put(25, "Y");
        alphabets.put(0, "Z");

    }

    public static String getColumnName(long number) {
        String columnName = "";
        while (number > 0) {
            long remainder = number % 26;
            number = number / 26;
            columnName = columnName + alphabets.get((int) remainder);
        }
        return columnName;
    }

    public static void main(String args[]) {
        System.out.println(getColumnName(1));
        System.out.println(getColumnName(26));
        System.out.println(getColumnName(52));
        System.out.println(getColumnName(53));
    }
}
