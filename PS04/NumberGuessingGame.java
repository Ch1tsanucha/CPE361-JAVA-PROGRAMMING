import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        boolean playAgain = true;
        
        while (playAgain) {
            int numberToGuess = (int) (Math.random() * 100) + 1; // Generate a number between 1-100
            int guessCount = 0;
            int maxGuesses = 5;
            boolean hasWon = false;
            
            System.out.println("I have chosen a number between 1 and 100. Try to guess it!");
            
            while (guessCount < maxGuesses) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                guessCount++;
                
                if (userGuess == numberToGuess) {
                    System.out.println("Correct! You win!");
                    hasWon = true;
                    break;
                } else {
                    System.out.println("Wrong guess!");
                    if (userGuess < numberToGuess) {
                        System.out.println("Too low!");
                    } else {
                        System.out.println("Too high!");
                    }
                    
                    if (guessCount >= maxGuesses) {
                        System.out.println("You lose! The number was: " + numberToGuess);
                    }
                }
            }
            
            System.out.print("Do you want to play again? (yes/no): ");
            String response = scanner.next().toLowerCase();
            playAgain = response.equals("yes");
        }
        
        System.out.println("Thanks for playing!");
        scanner.close();
    }
}
