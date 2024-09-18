/* 
 * Modul 3
 * CharScrambler.java
 * Emil Åkerman
 * 2024-09-18
 * https://github.com/emilakerman/java-work
*/
package lab3;

public class CharScrambler {
    public static void main(String[] args) 
    {
        String textInput = args[0];
        if (textInput.length() < 9 || textInput.length() > 9) System.out.println("wrong number of characters: " + textInput.length());
        else {
            char[] mutatedString = {
                textInput.charAt(8), 
                textInput.charAt(0), 
                textInput.charAt(7), 
                textInput.charAt(1), 
                textInput.charAt(6), 
                textInput.charAt(2), 
                textInput.charAt(5), 
                textInput.charAt(3), 
                textInput.charAt(4), 
            };
            if (textInput.startsWith("java")) {
                System.out.println(mutatedString);
                System.out.println("first characters: java");
            } else {
                System.out.println(mutatedString);
            }
        }
    }
}
