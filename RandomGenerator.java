
import java.util.Random;
import java.util.Scanner;

public class RandomGenerator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Enter the minimum range: ");
        int minRange = scanner.nextInt();

        System.out.print("Enter the maximum range: ");
        int maxRange = scanner.nextInt();
        int secretNumber = random.nextInt(maxRange - minRange + 1) + minRange;
        int maxAttempts = 3;
        System.out.print("Enter the number of players: ");
        int numPlayers = scanner.nextInt();
        for (int i = 1; i <= numPlayers; i++) {
            System.out.println("\nPlayer " + i + ", it's your turn!");
            for (int attempt = 1; attempt <= maxAttempts; attempt++) {
                System.out.print("Attempt " + attempt + ": Enter your guess: ");
                int guess = scanner.nextInt();
                if (guess == secretNumber) {
                    System.out.println("Congratulations! You guessed the correct number. You win!");
                    break;
                } else {
                    System.out.println("Incorrect guess.");
                    if (attempt < maxAttempts) {
                        System.out.println("Try again.");
                    } else {
                        System.out.println("Sorry, you've run out of attempts. The correct number was: " + secretNumber);
                    }
                }
            }
        }
        scanner.close();
    }
}
