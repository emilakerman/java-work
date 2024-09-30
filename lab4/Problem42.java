/* 
 * Modul 4
 * Problem42.java
 * Emil Åkerman
 * 2024-09-30
 * https://github.com/emilakerman/java-work
*/
package lab4;

public class Problem42 {
    public static void main(String[] args) {
        System.out.println(min(1,5,2));
        System.out.println(max(1,5,2));
    }
    public static int min(int i0, int i1, int i2) {
        int[] numbers = {i0, i1, i2};
        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i]; 
            }
        }
        return min;
    }
    public static int max (int i0, int i1, int i2) {
        int[] numbers = {i0, i1, i2};
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }
}
