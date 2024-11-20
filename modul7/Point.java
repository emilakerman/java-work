/* 
 * Modul 7
 * Point.java
 * Emil Åkerman
 * 2024-11-19
 * https://github.com/emilakerman/java-work
*/
public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public double getDistanceTo(Point other) {
        return Math.sqrt(this.x * other.x + this.y * other.y);
    }

    public static void main(String[] args) {
        Point p0 = new Point(3.0, 2.0);
        Point p1 = new Point(7.0, 5.0);
        double d = p0.getDistanceTo(p1);
        System.out.println(d);
    }
}
