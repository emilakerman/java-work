/* 
 * Modul 3
 * MathOps.java
 * Emil Åkerman
 * 2024-09-18
 * https://github.com/emilakerman/java-work
*/
package lab3;

import java.util.Scanner;

public class MathOps {
    public static void calculateNumbers(int a, int b, int c) {
        if (a < b) {
            if (b < c) { c++; }
        a = ((b + 5) * a);
        } else if (a > b) {
            if (a < c) { a++; }
            else {a = (c + 3);}
        } else {
            c = c /= (a + b);
        }
        System.out.println(a + b + c);
    }
    public static void main(String[] args) 
    {   
        Scanner rReader0 = new Scanner (args[0]);
        Scanner rReader1 = new Scanner (args[1]);
        Scanner rReader2 = new Scanner (args[2]);
        calculateNumbers(rReader0.nextInt(), rReader1.nextInt(), rReader2.nextInt());
        rReader0.close();rReader1.close();rReader2.close();

    }
}
