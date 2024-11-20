/* 
 * Modul 7
 * Ship.java
 * Emil Åkerman
 * 2024-11-19
 * https://github.com/emilakerman/java-work
*/
public class Ship {
    private String name;
    private double length;
    private double velocity = 0.0;
    private double bearing = 0.0;

    public Ship(String name, double length) {
        this.name = name;
        this.length = length;
    }

    public String getName() {
        return this.name;
    }

    public double getLength() {
        return this.length;
    }

    public double getVelocity() {
        return this.velocity;
    }

    public double getBearing() {
        return this.bearing;
    }

    public void setVelocity(double velocity) {
        this.velocity = velocity;
    }

    public void setBearing(double bearing) {
        this.bearing = bearing;
    }
}