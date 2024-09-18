/* 
 * Modul 3
 * Circle.java
 * Emil Åkerman
 * 2024-09-18
 * https://github.com/emilakerman/java-work
*/
package lab3;

import java.util.Scanner;

public class Circle {
    static double pi = Math.PI;

    public static void calculateArea(double radie) {
        System.out.println("A=" + pi * (radie * radie));
    }

    public static void calculateCircumference(double radie) {
        System.out.println("C=" + 2 * pi * radie);
    }

    public static void main(String[] args) 
    {
        String rString = args[0];
        Scanner rReader = new Scanner (rString);
        double r = rReader.nextDouble();
        calculateArea(r);
        calculateCircumference(r);
        rReader.close();
    }   
}
