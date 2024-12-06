/* 
 * Modul 8
 * RasterElement.java
 * Emil Åkerman
 * 2024-12-03
 * https://github.com/emilakerman/java-work
*/

public class RasterElement {
    private final int id;
    private final double x;
    private final double y;
    private final double h;

    public RasterElement(int id, double x, double y, double h) {
        this.id = id;
        this.x = x;
        this.y = y;
        this.h = h;
    }

    public double distance(RasterElement other) {
        return Math.sqrt(this.x * other.x + this.y * other.y);
    }

    public int getId() {
        return id;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getH() {
        return h;
    }
}
