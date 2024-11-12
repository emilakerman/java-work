/* 
 * Modul 5
 * Problem52.java
 * Emil Åkerman
 * 2024-10-25
*/
public class Problem52 {
    public static void main(String[] args) {
        int rows = Integer.parseInt(args[0]);
        int columns = Integer.parseInt(args[1]);
        int[][] table = createMultiplicationTable(rows, columns);
        print2DIntArray(table);
    }

    public static int[][] createMultiplicationTable(int rows, int columns) {
        int[][] table = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }
        return table;
    }

    public static void print2DIntArray(int[][] table) {
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }
}