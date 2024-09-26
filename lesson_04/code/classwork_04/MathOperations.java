package classwork_04;

import java.sql.SQLOutput;

public class MathOperations {

    public static void main(String[] args) {

        // перевод долларов в евро
        double money = 500;        // dollars
        double euro = exchangeDollarsToEuro(money);
        System.out.println("Euro: " + euro);

        // количество съеденных каллорий
        double weight = 200; // gramm
        double calorage = 50;  // calorie on 100 gramm

        double energy = calculateCalorie(weight, calorage);
        System.out.println("Полученные каллории: " + energy);

        // расход топлива и стоимости на поездку
        double fuelConsumption = 11;              // Средний расход топлива в литрах на 100 километров
        double distance = 211;                    // Дистанция в киллометрах
        double fuelPrice  = 1.8;                  // Цена топлива за один литр в евро
        double fuelAmount = fuelAmountMethod(fuelConsumption, distance);  // Количество израсходованного топлива в литрах
        double fuelCost = fuelCostMethod(fuelPrice, fuelAmount);       // Общая стоимость потраченного топлива в евро
        System.out.println("При пройденном пути в " + distance + " км" +
                " будет всего израсходовано " + fuelAmount + " л топлива " +
                " общей стоимостью " + fuelCost + " евро " +
                " при среднем расходе топлива равном " + fuelConsumption + " литрам на каждые 100 км");
    } //end of main

    // перевод долларов в евро
    private static double exchangeDollarsToEuro(double money ){
        double rate = 0.9;
        return money * rate;
    }

    // количество съеденных каллорий
    private static double calculateCalorie(double weight, double calorage){
        return weight * calorage / 100;
    }

    // расход топлива на поездку
    private static double fuelAmountMethod(double fuelConsumption, double distance){
        return (fuelConsumption / 100) * distance;
    }
    // расход cтоимости на поездку
    private static double fuelCostMethod(double fuelPrice, double fuelAmount){
        return fuelPrice * fuelAmount;
    }

} // end of class
