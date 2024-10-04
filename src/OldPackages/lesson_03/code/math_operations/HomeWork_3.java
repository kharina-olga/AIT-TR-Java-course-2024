// code by Olga kharina
package OldPackages.lesson_03.code.math_operations;

public class HomeWork_3 {

    public static void main(String[]args){

        double r = 200;
        double circleAreaOnRadius = circleAreaOnRadiusMethod(r);
        System.out.println("The area of a circle with radius " + r + " is " + circleAreaOnRadius);

        double side = 500;
        double squareAreaOnSide = squareAreaOnSideMethod(side);
        System.out.println("The area of a square with a side of "+ side + " is " + squareAreaOnSide);

        double side1 = 1000;
        double side2 = 2000;
        double rectanglePerimeterOnTwoSides = rectanglePerimeterOnTwoSidesMethod(side1,side2);
        System.out.println("The perimeter of a rectangle with sides of "+ side1 + " and " + side2 + " is " + rectanglePerimeterOnTwoSides);

    } // end of main

    // A method for calculating the area of a square based on its side;
    private static double squareAreaOnSideMethod(double side){
        return side * side;
    }

    // A method for calculating the area of a circle based on its radius;
    private static double circleAreaOnRadiusMethod(double r) {
        return r * r * Math.PI;
    }

    // A method for calculating the perimeter of a rectangle based on two sides;
    private static double rectanglePerimeterOnTwoSidesMethod(double side1, double side2){
        return 2 * (side1 + side2);
    }

}// end of class HomeWork_3


