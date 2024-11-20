/* 
 * Modul 7
 * Line.java
 * Emil Åkerman
 * 2024-11-19
 * https://github.com/emilakerman/java-work
*/
public class Line {
    private Point start;
    private Point end;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public Point getStart() {
        return this.start;
    }

    public Point getEnd() {
        return this.end;
    }

    public double getLength() {
        return this.start.getDistanceTo(this.end);
    }

    public static void main(String[] args) {
        Point startPoint = new Point(125.3, 34.1);
        Point endPoint = new Point(111.3, 2.1);
        Line line = new Line(startPoint, endPoint);
        System.out.println(line.getLength());
    }
}
