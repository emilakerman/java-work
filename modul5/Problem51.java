/* 
 * Modul 5
 * Problem51.java
 * Emil Åkerman
 * 2024-10-15
*/
public class Problem51 {
    public static void main(String[] args) {
        printStringsArray(args);
    }

    public static void printStringsArray(String[] s) {
        StringBuilder sBuilder = new StringBuilder();
        for (int i = 0; i <= s.length - 1; i++) {
            sBuilder.append(i + 1).append(": ").append(s[i]);
            System.out.println(sBuilder.toString());
            sBuilder.setLength(0);
        }
    }
}