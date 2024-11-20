/* 
 * Modul 7
 * GraphicsTest.java
 * Emil Åkerman
 * 2024-11-19
 * https://github.com/emilakerman/java-work
*/
public class GraphicsTest {
    public static void main(String[] args) {
        Point startPoint = new Point(4.4, 3.3);
        Point endPoint = new Point(5.5, 6.6);
        Line line = new Line(startPoint, endPoint);

        // Printing values of the the instances.
        System.out.println("\nStartpoint x value: " + startPoint.getX() + "\nStartpoint y value: " + startPoint.getY());
        System.out.println("\nEndpoint x value: " + endPoint.getX() + "\nEndpoint y value: " + endPoint.getY());
        System.out.println("\nLine start value:\nx: " + line.getStart().getX() + " & y: " + line.getStart().getY());
        System.out.println("\nLine end value:\nx: " + line.getEnd().getX() + " & y: " + line.getEnd().getY());

        // Printing the distance between Point instances.
        System.out.println("\nDistance between start and endpoint: " + startPoint.getDistanceTo(endPoint));
        // Printing the length of the Line instance.
        System.out.println("\nLength of the line instance: " + line.getLength());
    }
}
