/* 
 * Modul 7
 * PointRecord.java
 * Emil Åkerman
 * 2024-11-20
 * https://github.com/emilakerman/java-work
*/
public record PointRecord(double x, double y) {

    public double getDistanceTo(PointRecord other) {
        return Math.sqrt(this.x * other.x + this.y * other.y);
    }

    public static void main(String[] args) {
        PointRecord p0 = new PointRecord(3.0, 2.0);
        PointRecord p1 = new PointRecord(4.0, 1.0);
        System.out.println(p0.getDistanceTo(p1));
    }
}
