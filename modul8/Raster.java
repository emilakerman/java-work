/* 
 * Modul 8
 * Raster.java
 * Emil Åkerman
 * 2024-12-04
 * https://github.com/emilakerman/java-work
*/

import java.util.ArrayList;

public class Raster {
    private final RasterElement[][] elements;
    private final double x;
    private final double y;
    private final double s;

    // heights är höjdvärdena som skickas med i Tester.java
    public Raster(double[][] heights, double x, double y, double s) {
        // x och y är mätpunkterna hos första kolumnen på första raden
        this.x = x;
        this.y = y;
        // längden på sidan av ett rasterelement (kvadraten)
        this.s = s;

        int rows = heights.length;
        int columns = heights[0].length;
        this.elements = new RasterElement[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                // ID startar på 0 och ökar med 1 för varje element
                int id = i * columns + j;
                double elementX = x + j * s;
                double elementY = y + i * s;
                double height = heights[i][j];
                elements[i][j] = new RasterElement(id, elementX, elementY, height);
            }
        }
    }

    public char[][] getPseudoViz() {
        int rows = elements.length;
        int columns = elements[0].length;
        char[][] characters = new char[rows][columns];
        double maxHeight = Double.NEGATIVE_INFINITY;

        // Find the peak rasterelement.
        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                RasterElement element = elements[row][column];
                double height = element.getH();
                boolean isPeak = true;
                // Check if it is an inner element or not (ignoring edges).
                boolean isInnerElement = rows > 2 && columns > 2 &&
                        row > 0 && row < rows - 1 &&
                        column > 0 && column < columns - 1;

                // Top
                if (row > 0 && elements[row - 1][column].getH() >= height) {
                    isPeak = false;
                }
                // Bottom
                if (row < rows - 1 && elements[row + 1][column].getH() >= height) {
                    isPeak = false;
                }
                // Left
                if (column > 0 && elements[row][column - 1].getH() >= height) {
                    isPeak = false;
                }
                // Right
                if (column < columns - 1 && elements[row][column + 1].getH() >= height) {
                    isPeak = false;
                }
                if (isPeak && isInnerElement) {
                    if (height > maxHeight) {
                        maxHeight = height;
                    }
                }
            }
        }

        ArrayList<Double> list = new ArrayList<>();
        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                RasterElement element = elements[row][column];
                double height = element.getH();
                char charToAdd = ' ';
                if (height == maxHeight) {
                    list.add(height);
                    for (double value : list) {
                        if (value <= height) {
                            break;
                        }
                    }
                    charToAdd = 'x';
                } else if (0.0 <= height && height < 0.25) {
                    charToAdd = ' ';
                } else if (0.25 <= height && height < 0.5) {
                    charToAdd = '*';
                } else if (0.5 <= height && height < 0.75) {
                    charToAdd = '+';
                } else if (0.75 <= height) {
                    charToAdd = '.';
                }
                characters[row][column] = charToAdd;
                System.out.print(characters[row][column] + " ");

            }
            System.out.println();
        }
        return characters;
    }

    public double slopeMinMaxHeight() {
        RasterElement minElement = null;
        RasterElement maxElement = null;
        double minHeight = Double.MAX_VALUE;
        double maxHeight = Double.MIN_VALUE;
        for (RasterElement[] row : elements) {
            for (RasterElement element : row) {
                double height = element.getH();
                // Uppdatera minsta höjd
                if (height < minHeight) {
                    minHeight = height;
                    minElement = element;
                }
                // Uppdatera största höjd
                if (height > maxHeight) {
                    maxHeight = height;
                    maxElement = element;
                }
            }
        }
        // Höjddifferens delat med avståndet
        return (maxHeight - minHeight) / minElement.distance(maxElement);
    }

    public RasterElement[][] getElements() {
        return elements;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getS() {
        return s;
    }
}
