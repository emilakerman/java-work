import java.util.ArrayList;

public class A {
    public static void main(String[] args) {
        ArrayList<String> textList = new ArrayList<String>();
        textList.add("i");

        String[] cars = new String[5];

        System.out.println(textList);

        for (int i = 0; i < 10; i++) {
            textList.add("i");
        }
        cars[0] = "d";
        textList.set(0, "d");

        textList.add("5");
        textList.remove("5");
        System.out.println(textList);
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

    }
}
