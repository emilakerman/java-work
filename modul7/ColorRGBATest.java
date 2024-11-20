/* 
 * Modul 7
 * ColorRGBATest.java
 * Emil Åkerman
 * 2024-11-20
 * https://github.com/emilakerman/java-work
*/
public class ColorRGBATest {
    public static void main(String[] args) {
        // Instance created and values printed.
        ColorRGBA color = new ColorRGBA(255, 25, 25, 50);
        System.out.println("Colors of color instance");
        System.out.println(color.toString());
        // Inverting the color and inverted values printed.
        ColorRGBA invertedColor = color.invert();
        System.out.println("\nInverted colors");
        System.out.println(invertedColor.toString());
        // Using the greyscale method on the first instance of the color and printed
        // values.
        ColorRGBA greyScaleColor = color.toGrayScale();
        System.out.println("\nGreyscale colors");
        System.out.println(greyScaleColor.toString());
    }
}
