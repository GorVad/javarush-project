package com.javarush.task.pro.task10.task1017;

/* 
Создание материков
*/

public class Earth {
    public static void main(String[] args) {
        Eurasia eurasia = new Eurasia(54);
        Africa africa = new Africa(30);
        NorthAmerica northAmerica = new NorthAmerica(24);
        SouthAmerica southAmerica = new SouthAmerica(17);
        Antarctica antarctica = new Antarctica(14);
        Australia australia = new Australia(7);
    }
}
