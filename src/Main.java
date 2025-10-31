import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //4
        int numGuessDouble = InputHelper.getDouble(scan, "Guess a number between 1.00-10.00", 1, 10);
        System.out.println("You guessed " + numGuessDouble);
        //1
        String name = InputHelper.getNonZeroLenString(scan, "Enter your name. ");
        System.out.println(name);
        //2
        int faveNum = InputHelper.getInt(scan, "Enter your fav number.");
        System.out.println(faveNum);
        //3
        int numGuess = InputHelper.getRangedInt(scan, "Guess a number between 1-10", 1, 10);
        System.out.println("You guessed " + numGuess);
    }
}
