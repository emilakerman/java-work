/* 
 * Modul 7
 * ColorRGBA.java
 * Emil Åkerman
 * 2024-11-20
 * https://github.com/emilakerman/java-work
*/
public class ColorRGBA {
    private int r;
    private int g;
    private int b;
    private int a;

    public ColorRGBA(int r, int g, int b, int a) {
        int defaultValue = 0;
        this.r = (r < 0 || r > 255) ? defaultValue : r;
        this.g = (g < 0 || g > 255) ? defaultValue : g;
        this.b = (b < 0 || b > 255) ? defaultValue : b;
        this.a = (a < 0 || a > 255) ? defaultValue : a;
    }

    public double getR() {
        return this.r;
    }

    public double getG() {
        return this.g;
    }

    public double getB() {
        return this.b;
    }

    public double getA() {
        return this.a;
    }

    public String toString() {
        return "RGBA: r =" + r + ", g =" + g + ", b =" + b + ", a =" + a;
    }

    public ColorRGBA toGrayScale() {
        int avg = (this.r + this.g + this.b) / 3;
        return new ColorRGBA(avg, avg, avg, this.a);
    }

    public ColorRGBA invert() {
        return new ColorRGBA(255 - this.r, 255 - this.g, 255 - this.b, this.a);
    }

    public static void main(String[] args) {
        ColorRGBA color = new ColorRGBA(255, 25, 13, 66);
        System.out.println(color.toString());
    }
}
