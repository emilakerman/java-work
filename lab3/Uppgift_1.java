/* 
 * Modul 3
 * Uppgift_1.java
 * Emil Åkerman
 * 2024-09-18
 * https://github.com/emilakerman/java-work
*/
package lab3;

public class Uppgift_1 {
    public static void main(String[] args) {
        int a = 9;
        int b = 15;
        int c = -4;
        c += a-- * ++b;
        if (b % a == a - 8) {
            b = -b;
        } else if (c / (a - 1) == b + 4) {
            a = b / a;
        } else {
            c += a - b;
        }
        System.out.println("a: " + a + "; b: " + b + "; c: " + c);
    }
}
