import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    private int num;
    private int tries;
    private Scanner input = new Scanner(System.in);
    private Random random;

    public GuessingGame() {
        random = new Random();
        num = random.nextInt(100) + 1;
        tries = 0;

        String name = getName();
        System.out.println("Hello, " + name + ". Guess the number!");
        int guess;
        boolean guessed = false;
        while (!guessed) {
            tries++;
            try {
                guess = input.nextInt();
            } catch (InputMismatchException e) {
                String not_a_num = input.next();
                System.out.println(not_a_num + " st not a number. Input a number");
                continue;
            }
            if (guess < 1 || guess > 100) {
                System.out.println("Don't try to fool us. Enter the number between 1 and 1000");
                continue;
            }
            if (guess == num) {
                guessed = true;
                System.out.println(name+", you won! Congrats! You're required " + tries + " attempts to get the number");
            } else {
                if (guess < num) {
                    System.out.println("too low");
                } else {
                    System.out.println("too high");
                }
            }
        }

    }

    private String getName() {
        System.out.println("Hey! What is your name?");
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
}