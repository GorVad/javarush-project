package com.javarush.task.pro.task08.task0803;

import java.util.Scanner;

/* 
Минимальный элемент массива
*/

public class Solution {

    public static void main(String[] args) {
        int[] intArray = getArrayOfTenElements();
        System.out.println(min(intArray));
    }

    public static int min(int[] ints) {
        int minValue = Integer.MAX_VALUE;
        for (int i = 0; i < ints.length; i++) {
            minValue = Math.min(ints[i], minValue);
        }
        return minValue;
    }

    public static int[] getArrayOfTenElements() {
        Scanner console = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = console.nextInt();
        }

        return array;
    }
}
