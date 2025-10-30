import java.util.Scanner;
import java.util.Stack;

public class InputHelper {

    //getNonZeroLenString method returns a String a non-zero length back to user
    public static String getNonZeroLenString(Scanner scan, String prompt) {
        boolean valid = false;
        String userInput;

        System.out.println(prompt);
        do {
            userInput = scan.nextLine();
            if (userInput.length() > 0) {
                valid = true;
            }
            else{
                System.out.println("Error - must enter string of non-zero length");
            }
        } while (!valid);
        return userInput;
    }

    //The getInt method returns a valid int value back to the user
    public static int getInt(Scanner scan,  String prompt) {
        boolean valid = false;
        int userInput = 0;

        System.out.println(prompt);
        do {
            if (scan.hasNextInt()) {
                userInput = scan.nextInt();
                valid = true;
            }
            else{
                System.out.println("Error - must enter integer value");
                scan.nextLine();
            }
        } while (!valid);
        return userInput;
    }

    //The getRangedInt method returns a valid int value back to the user between min and max
    public static int getRangedInt(Scanner scan, String prompt, int min, int max) {
        boolean valid = false;
        int userInput = 0;

        System.out.println(prompt);
        do {
            if (scan.hasNextInt()) {
                userInput = scan.nextInt();
                if (userInput >= min && userInput <= max) {
                    valid = true;
                }
                else{
                    System.out.println("Error - input must be between " + min + " and " + max + ".");
                    scan.nextLine();
                }
            }
            else{
                System.out.println("Error - must enter integer value");
                scan.nextLine();
            }
        } while (!valid);
        return userInput;
    }

    //The getDouble method returns a valid double value back to the user
    public static int getDouble(Scanner scan,  String prompt) {
        boolean valid = false;
        double userInput = = 0;

        System.out.println(prompt);
        do {
            if (scan.hasNextInt()) {
                userInput = scan.nextInt();
                valid = true;
            }
            else{
                System.out.println("Error - must enter integer value");
                scan.nextLine();
            }
        } while (!valid);
        return userInput;
    }

}


