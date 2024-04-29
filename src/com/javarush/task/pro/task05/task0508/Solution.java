package com.javarush.task.pro.task05.task0508;

import java.util.Scanner;

/* 
Удаляем одинаковые строки
*/

public class Solution {
    public static String[] strings;

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        strings = new String[6];
        String currentWord = "";
        boolean isRepeat = false;

        for (int i = 0; i < 6; i++) {
            strings[i] = console.nextLine();
        }

        for (int i = 0; i < strings.length; i++) {
            currentWord = strings[i];
            isRepeat = false;
            for (int j = 0; j < strings.length; j++) {
                if (j == i)
                    continue;
                if (strings[j] != null){
                    if (strings[j].equals(currentWord)) {
                        isRepeat = true;
                        strings[j] = null;
                    }
                }
            }
            if (isRepeat)
                strings[i] = null;
        }

        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }
    }
}
