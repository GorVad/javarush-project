package com.javarush.task.pro.task10.task1016;

/* 
Прогноз погоды
*/

public class Solution {

    public static void showWeather(City city) {
        String textCityTemp = "В городе %s сегодня температура воздуха %s";
        String filledTextCityTemp = String.format(textCityTemp, city.getName(), city.getTemperature());
        System.out.println(filledTextCityTemp);
    }

    public static void main(String[] args) {
        String cityName = "Дубай";
        int cityTemp = 40;
        City city = new City(cityName, cityTemp);
        showWeather(city);
    }
}
