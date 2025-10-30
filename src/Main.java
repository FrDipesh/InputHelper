import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = InputHelper.getNonZeroLenString(scan, "Enter your name. ");
        System.out.println(name);

        int faveNum = InputHelper.getInt(scan, "Enter your fav number.");
        System.out.println(faveNum);

        int numGuess = InputHelper.getRangedInt(scan, "Guess a number between 1-10", 1, 10);
        System.out.println("You guessed " + numGuess);
    }
}
