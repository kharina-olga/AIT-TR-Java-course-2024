// code by Olga Kharina
// Calculate the purchase of discounted items. Product A (socks) costs X (20) euros and has a D% (3) discount,
// and product B (pantyhose) costs Y (25) euros and has a (10) C% discount.
// The client took N (10) goods A (socks) and M (5) goods B (pantyhose).
// If the purchase amount exceeds 100 euro,
// then an additional 5% discount is granted. Calculate the total cost of the purchase and the amount of the discount received.

package homework_05;

public class Basket {
    public static void main(String[] args) {
     double price1 = 20;
     double price2 = 50;
     int discount1 = 6;
     int discount2 = 10;
     int discountOver100 = 5;
     int amount1 = 20;
     int amount2 = 6;

        // calling a method
        double costOfPurchases = costOfPurchaseMethod(price1,price2, amount1, amount2); // total cost without any discounts
        double sumOfDiscount = sumOfDiscountMethod(price1, price2, amount1, amount2,discount1, discount2); // standart product discounts sum
        double sumOfDiscount100 = sumOfDiscount100(costOfPurchases, sumOfDiscount); // discount sum for purchases with total cost over 100 euros
        double totalCostOfPurshases = totalCostOfPurshasesMethod(costOfPurchases, sumOfDiscount, sumOfDiscount100);

        // тут будет два принта, при сумме покупок свыше 100 евро и при сумме покупок ниже 100 евро

        if(costOfPurchases > 100){
            System.out.println("Congradulations! Your total cost of purshase is over 100 euro and you get additional discount 5%! \n" +
                    "Full cost of your purshases: " + costOfPurchases + " euro." + "\n" +
                    "Sum of standart discounts: " + sumOfDiscount + " euro. " + "\n" +
                    "Sum of additional 5% discounts: " + sumOfDiscount100 + " euro." + "\n" +
                    "Total cost of your purshases: " + totalCostOfPurshases + " euro.");
        } else {
            System.out.println("Full cost of your purshases: " + costOfPurchases + " euro." + "\n" +
                    "Sum of standart discounts: " + sumOfDiscount + "\n" +
                    "Total cost of your purshases: " + totalCostOfPurshases + " euro.");
            System.out.println( "\n" + "Olga" + "\n" );
        }

        //****************************
        System.out.println( "\n" + "Olha" + "\n" );

        double priceA = 20; //цена товара
        int quantityA = 10;//количество товара
        double discountA = 6;// скидка на товар


        double totalPriceA = priceA * quantityA;
        double discountCoastForA = priceA * quantityA *(1- discountA / 100);


        double priceB = 50;//цена товара
        int quantityB = 6;//количество товара
        double discountB = 10;//скидка на товар

        double totalPriceB = priceB * quantityB;
        double discountCoastForB = priceB * quantityB * (1- discountB / 100);

        double totalPrice = totalPriceA + totalPriceB;
        double сoastWithDiscount = discountCoastForA + discountCoastForB;
        double discount = totalPrice - сoastWithDiscount;

        System.out.println("Total price without discont is: " + totalPrice+ " Euro");
        System.out.println("Total price with discont is: " + сoastWithDiscount+ " Eeuro");
        System.out.println("Total discont is: " + discount+ " Euro");


        if (сoastWithDiscount >= 100) {
            double res = сoastWithDiscount * 0.95;
            System.out.println("Total price with double discont is: "+res);
        }



        //*****************************
        System.out.println( "\n" + "Artem" + "\n" );
        double a = 20; //the cost of product A, euro
        double b = 50; //the cost of product B, euro
        double c = 0.06; //the discount on product B
        double d = 0.1; //the discount on product A
        double x = 0.05; //the amount of extra discount
        int n = 10; //the amount of product A
        int m = 6; //the amount of product B

        double totalCostFormula = n*a*(1-d) + m*b*(1-c); //the formula for total cost of purchase
        double totalCost = 0; //total cost of the purchase
        double extraDiscount = 0; //the amount of extra discount
        double totalDiscount = n*a*d + m*b*c + extraDiscount; //the total amount of discount

        if(totalCostFormula > 100){
            totalCost = (totalCostFormula) * (1-x);
            extraDiscount = (totalCostFormula) * x;
        } else{
            totalCost = totalCostFormula;
        }

        System.out.println("The total cost of the products is: " + totalCost + " euro.\nThe amount of extra discount is: " + extraDiscount + " euro.\nThe total amount of discount is: " + totalDiscount + " euro.");
//*********************************

    } // end of main

    // calculating total cost without any discounts
    public static double costOfPurchaseMethod(double price1, double price2, int amount1, int amount2) {
        return (price1 * amount1) + (price2 * amount2);
    }
    // calculating standart product discounts
    public static double sumOfDiscountMethod(double price1, double price2 , int discount1, int discount2,
                                             int amount1, int amount2){
        return (price1 * discount1/100 * amount1 + price2 * discount2/100 * amount2);
    }
    // calculating discount sum for purchases with total cost over 100 euros
    private static double sumOfDiscount100(double costOfPurchase,double sumOfDiscount ){
        return (costOfPurchase - sumOfDiscount ) * 5/100;
    }
    // calculating total cost to pay
    public static double totalCostOfPurshasesMethod(double costOfPurchases, double sumOfDiscount, double sumOfDiscount100){
        if( costOfPurchases >= 100 ){
            return costOfPurchases - sumOfDiscount - sumOfDiscount100;
        } else {
            return costOfPurchases - sumOfDiscount;
        }
    }

} // end of class
