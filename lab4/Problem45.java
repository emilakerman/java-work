/* 
 * Modul 4
 * Problem45.java
 * Emil Åkerman
 * 2024-09-30
 * https://github.com/emilakerman/java-work
*/
package lab4;

import java.util.Scanner;

public class Problem45 {
    public static void main(String[] args) {
        Scanner rReader0 = new Scanner(args[0]);
        Scanner rReader1 = new Scanner(args[1]);
        System.out.println(createMultiplicationTable(rReader0.nextInt(), rReader1.nextInt()));
    }

    public static String createMultiplicationTable(int rows, int columns) {
        StringBuilder sBuilder = new StringBuilder();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                sBuilder.append(i * j).append(" ");
            }
            sBuilder.append("\n");
        }
        return sBuilder.toString();
    }
}
