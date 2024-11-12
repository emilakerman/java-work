/* 
 * Modul 6
 * Problem63.java
 * Emil Åkerman
 * 2024-11-12
*/
public class Problem63 {
    public static void main(String[] args) {
        int[] values = { 2, 1, 8, 0, 4 };
        int[] clonedValues = values.clone();
        swap(clonedValues, 3, 0);
        for (int i = 0; i < clonedValues.length; i++) {
            System.out.print(clonedValues[i] + " ");
        }
        System.out.println();
    }

    public static void swap(int[] values, int a, int b) {
        int aa = values[a];
        int bb = values[b];
        values[a] = bb;
        values[b] = aa;
    }
}
