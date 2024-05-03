package com.javarush.task.pro.task10.task1012;

import java.util.Arrays;
import java.util.Objects;

/* 
Дефрагментация памяти
*/

public class Memory {

    public static void main(String[] args) {
        String[] memory = {"object15", null, null, "object2", null, null, null, "object32", null, "object4"};
        executeDefragmentation(memory);
        System.out.println(Arrays.toString(memory));
    }

    public static void executeDefragmentation(String[] array) {
        int firstNullPosition = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null && firstNullPosition == -1)
                firstNullPosition = i;
            else if (array[i] != null && firstNullPosition != -1){
                String temp = array[i];
                array[i] = array[firstNullPosition];
                array[firstNullPosition] = temp;
                i = firstNullPosition;
                firstNullPosition = -1;
            }
            else
                continue;
        }
    }
}
