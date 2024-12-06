
/* 
 * Modul 8
 * TimeStampRegisterTest.java
 * Emil Åkerman
 * 2024-12-03
 * https://github.com/emilakerman/java-work
*/
import java.util.Scanner;

public class TimeStampRegisterTest {
    public static void main(String[] args) {
        boolean exit = false;
        Scanner inputReader = new Scanner(System.in);
        TimeStampRegister reg = new TimeStampRegister();

        while (!exit) {
            // om antalet är jämt är det dags för en ny incheckning
            if (reg.getNumberOfStamps() % 2 == 0)
                System.out.println("Welcome!");
            // om antalet är OOOOjämt är det dags för en ny utcheckning
            else
                System.out.println("Goodbye!");

            reg.addTimeStamp();
            System.out.println("Repeat? Press 1");
            int c = inputReader.nextInt();
            if (c != 1)
                exit = true;
        }
        System.out.println("Time: " + reg.getTotalTime());
    }
}
