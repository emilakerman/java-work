/* 
 * Modul 8
 * Tester.java
 * Emil Åkerman
 * 2024-12-04
 * https://github.com/emilakerman/java-work
*/

public class Tester {
    public static void main(String[] args) {
        double[][] heights = {
                { 0.25, 0.40, 0.1, 0.4, 0.1, 0.9, 4.1 },
                { 0.74, 0.55, 1.0, 0.3, 0.6, 1.3, 1.1 },
                { 0.94, 0.11, 0.28, 0.7, 0.25, 9.3, 9.3 },
                { 0.4, 0.15, 0.28, 0.4, 0.66, 0.2, 4.4 },
                { 0.4, 0.15, 0.99, 3.4, 1.1, 0.9, 2.2 },
                { 0.25, 9.40, 0.1, 0.4, 0.1, 0.9, 2.7 },
                { 0.74, 0.55, 1.0, 0.3, 0.6, 1.3, 1.1 },
                { 0.94, 0.11, 0.28, 0.7, 0.25, 9.3, 1.3 },
                { 0.4, 0.15, 0.28, 0.4, 0.66, 0.2, 0.86 },
                { 0.4, 0.15, 0.99, 3.9, 1.1, 0.9, 3.3 }
        };
        Raster raster = new Raster(heights, 1.0, 1.0, 4.0);
        raster.getPseudoViz();
    }
}
