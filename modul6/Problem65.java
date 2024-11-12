import java.util.*;

/* 
 * Modul 6
 * Problem65.java
 * Emil Åkerman
 * 2024-11-12
*/
public class Problem65 {
    public static void main(String[] args) {
        System.out.println(split("skriv en funktion som tar emot två String-värden",
                " "));
        System.out.println(split("132;44;255;18;129", ";"));
    }

    public static ArrayList<String> split(String text, String marker) {
        StringTokenizer st = new StringTokenizer(text, marker);
        ArrayList<String> list = new ArrayList<String>();
        while (st.hasMoreTokens()) {
            list.add(st.nextToken());
        }
        return list;
    }
}
