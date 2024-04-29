package com.javarush.task.pro.task05.task0505;

import java.util.Scanner;

/* 
Reverse
*/

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int N = console.nextInt();
        int[] array = new int[N];

        if (N > 0){
            for (int i = 0; i < array.length; i++) {
                array[i] = console.nextInt();
            }
        }

        if (N % 2 != 0){
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }
        }
        else {
            for (int i = array.length-1; i >= 0 ; i--) {
                System.out.println(array[i]);
            }
        }
    }
}
