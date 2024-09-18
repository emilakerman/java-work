/* 
 * Modul 3
 * Uppgift_2.java
 * Emil Åkerman
 * 2024-09-18
 * https://github.com/emilakerman/java-work
*/

package lab3;

import java.lang.Math;
import java.time.LocalDate;


public class Uppgift_2 {
    public static void main(String[] args) 
    {
        double d = 1.3;
        System.out.println(Math.round(d));

        String s = "hello";
        System.out.print(s);

        LocalDate date = LocalDate.now();
        System.out.println(date);
    }
    public static void function1(int siffra, double annanSiffra) {
        System.out.println(siffra + annanSiffra);
    }
}