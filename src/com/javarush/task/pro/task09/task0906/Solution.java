package com.javarush.task.pro.task09.task0906;

import java.util.regex.Pattern;

/* 
Двоичный конвертер
*/

public class Solution {
    public static void main(String[] args) {
        int decimalNumber = Integer.MAX_VALUE;
        System.out.println("Десятичное число " + decimalNumber + " равно двоичному числу " + toBinary(decimalNumber));
        String binaryNumber = "1111111111111111111111111111111";
        System.out.println("Двоичное число " + binaryNumber + " равно десятичному числу " + toDecimal(binaryNumber));
    }

    public static String toBinary(int decimalNumber) {
        String binary = new String();
        if (decimalNumber > 0){
            while (decimalNumber != 0){
                binary = decimalNumber % 2 + binary;
                decimalNumber = decimalNumber/2;
            }
        }
        return binary;
    }

    public static int toDecimal(String binaryNumber) {
        int decimal = 0;
        if (!(binaryNumber == null || binaryNumber.isEmpty())) {
            for (int i = 0; i < binaryNumber.length(); i++) {
                int index = binaryNumber.length() - 1 - i;
                int value = Character.getNumericValue(binaryNumber.charAt(index));
                decimal = (int)(decimal + value * Math.pow(2, i));
            }
        }
        return decimal;
    }
}
