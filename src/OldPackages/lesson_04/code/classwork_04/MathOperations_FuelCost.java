package OldPackages.lesson_04.code.classwork_04;

public class MathOperations_FuelCost {

        public static void main(String[] args) {

            // расход топлива и стоимости на поездку
            double fuelConsumption = 11;              // Средний расход топлива в литрах на 100 километров
            double distance = 211;                    // Дистанция в киллометрах
            double fuelPrice  = 1.8;                  // Цена топлива за один литр в евро
            double fuelAmount = fuelAmountMethod(fuelConsumption, distance);  // Количество израсходованного топлива в литрах
            double fuelCost = fuelCostMethod(fuelPrice, fuelAmount);       // Общая стоимость потраченного топлива в евро
            System.out.println("При пройденном пути в " + distance + " км" +
                    " всего израсходовано " + fuelAmount + " л топлива " +
                    " общей стоимостью " + fuelCost + " евро " +
                    " при среднем расходе топлива равном " + fuelConsumption + " л на каждые 100 км" +
                    " при стоимости топлива " + fuelPrice + " евро за один литр.");

        } // end of main

        // расход израсходанного топлива на поездку
        private static double fuelAmountMethod(double fuelConsumption, double distance){
            return (fuelConsumption / 100) * distance;
        }
        // расход общей cтоимости топлива на поездку
        private static double fuelCostMethod(double fuelPrice, double fuelAmount){
            return fuelPrice * fuelAmount;
        }

    } // end of class
