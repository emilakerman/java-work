/* 
 * Modul 7
 * ShipTest.java
 * Emil Åkerman
 * 2024-11-19
 * https://github.com/emilakerman/java-work
*/
public class ShipTest {
    public static void main(String[] args) {
        Ship shipObject = new Ship("The Traveler", 123.4);
        System.out.println("Name of Ship: " + shipObject.getName());
        System.out.println("Length of the Ship: " + shipObject.getLength());
        System.out.println("Velocity of the Ship: " + shipObject.getVelocity());
        System.out.println("Bearing of the Ship: " + shipObject.getBearing());
        // Settings new values of Velocity and Bearing.
        shipObject.setVelocity(23.4);
        shipObject.setBearing(8883.1);
        // Printing the new values of the Ship Object.
        System.err.println("\nNew Values: ");
        System.out.println("Name of Ship: " + shipObject.getName());
        System.out.println("Length of the Ship: " + shipObject.getLength());
        System.out.println("Velocity of the Ship: " + shipObject.getVelocity());
        System.out.println("Bearing of the Ship: " + shipObject.getBearing());
    }
}
