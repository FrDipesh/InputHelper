import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        //1
        String name = InputHelper.getNonZeroLenString(scan, "Enter your name. ");
        System.out.println(name);
        //2
        int faveNum = InputHelper.getInt(scan, "Enter your fav number.");
        System.out.println(faveNum);
        //3
        int numGuess = InputHelper.getRangedInt(scan, "Guess a number between 1-10", 1, 10);
        System.out.println("You guessed " + numGuess);
        //4
        double faveDeci = InputHelper.getDouble(scan, "Enter your fav decimal number.");
        System.out.println("You guessed " + faveDeci);
        //5
        double getRangedDouble = InputHelper.getRangedDouble(scan, "Guess a number between 1.00-10.00", 1.0 ,10.0);
        System.out.println("You guessed " + getRangedDouble);
        //6
        double greaterThanZero = InputHelper.getPositiveNonZeroInt(scan, "Enter a number greater than Zero ");
        System.out.println("You guessed " + greaterThanZero);

    }
}
