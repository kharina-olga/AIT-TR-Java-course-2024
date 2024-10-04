// code by Olga Kharina

package OldPackages.lesson_04.code.homework_04;
// Write methods for currency conversion:
// Euros to US dollars
// Euro to British Pounds
// Euro to Chinese Yuan and test their operation by calling them in main.

public class HW_4_MathMethods_Currency {
    public static void main(String[]args){

        // Euros to US dollars
        double moneyEuroToDollar = 500;
        double moneyDollarOut = exchangeEuroToDollars(moneyEuroToDollar);
        System.out.println(moneyEuroToDollar + " euro" + " is " + moneyDollarOut + " dollars");

        // Euro to British Pounds
        double moneyEuroToPound = 1000;
        double moneyPoundOut = exchangeEuroToPounds(moneyEuroToPound);
        System.out.println(moneyEuroToPound + " euro" + " is "+ moneyPoundOut + " pounds");

        // Euro to Chinese Yuan
        double moneyEuroToYuan = 1000;
        double moneyYuanOut = exchangeEuroToYuan(moneyEuroToYuan);
        System.out.println(moneyEuroToYuan + " euro" + " is "+ moneyYuanOut + " yuan");

    } // end of main

    // consumption euro to US dollars
    private static double exchangeEuroToDollars(double moneyAmountIn){
        double rate = 0.9;
        return moneyAmountIn * rate;
    }
    // consumption euro to British Pounds

    private static double exchangeEuroToPounds(double moneyAmountIn){
        double rate = 0.84;
        return moneyAmountIn * rate;
    }
    // consumption euro to Chinese Yuan
    private static double exchangeEuroToYuan(double moneyAmountIn){
        double rate = 7.86;
        return moneyAmountIn * rate;
    }


} // end of class
