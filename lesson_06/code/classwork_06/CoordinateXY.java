package classwork_06;

// **Задание 1.**
//  Задайте в программе две переменные и их значения, которые отвечают за координаты точки на плоскости.
//  Определите в какую четверть попадает точка с этими координатами.

public class CoordinateXY {

    public static void main(String[] args) {

        int x = 1;
        int y = 0;

        if(x >= 0 & y >= 0) {
            System.out.println("Point is in 1st quarter");
        }
        if(x <= 0 & y >= 0) {
            System.out.println("Point is in 2nd quarter");
        }
        if(x <= 0 & y <= 0) {
            System.out.println("Point is in 3rd quarter");
        }
        if(x >= 0 & y <= 0) {
            System.out.println("Point is in 4th quarter");
        }


    } // end of main

} // end of class
