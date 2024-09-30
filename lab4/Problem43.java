/* 
 * Modul 4
 * Problem43.java
 * Emil Åkerman
 * 2024-09-30
 * https://github.com/emilakerman/java-work
*/
package lab4;

import java.util.Scanner;

public class Problem43 {
    public static void main(String[] args) {
        Scanner rReader1 = new Scanner(args[1]);
        char sign = args[0].charAt(0);
        int number = rReader1.nextInt();
        System.out.print(createCharLine(sign, number) + "\n");
        rReader1.close();
    }

    public static String createCharLine(char c, int nbr) {
        StringBuilder sBuilder = new StringBuilder();
        for (int i = 0; i < nbr; i++) {
            sBuilder.append(c);
        }
        String result = sBuilder.toString();
        return result;
    }
}
