/* Derick Waugh
 * Mod 3 - Rock, Paper, Scissors!
 * Oct. 30, 2022
 */


import java.util.Random;
import java.util.Scanner;

public class dwaughMod3 {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//Add a function to allow user to determine how many games they want to play
        System.out.println("How many rounds of Rock-Paper-Scissors would you like to play?");
        int rounds = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < rounds; i++) {
            playRockPaperScissors(scanner);
        }
    }

    static void playRockPaperScissors(Scanner scanner) {
//User input
        System.out.println("Make a move! (rock/paper/scissors)");
        String playerMove = scanner.nextLine();

//Computer Input
        Random random = new Random();
        int randomNumber = random.nextInt(3);

        String computerMove;
        if (randomNumber == 0) {
            computerMove = "Rock";
        } else if (randomNumber == 1) {
            computerMove = "Paper";
        } else {
            computerMove = "Scissors";
        }
        System.out.println("Computer chooses " + computerMove + "!");

// results
        if (playerMove.equals(computerMove)) {
            System.out.println("It's a draw!");
        } else if (playerWins(playerMove, computerMove)) {
            System.out.println("You win!");
        } else {
            System.out.println("Computer wins!");
        }
    }
//objects for use
    static boolean playerWins(String playerMove, String computerMove) {
        if (playerMove.equals("rock")) {
            return computerMove.equals("scissors");
        } else if (playerMove.equals("paper")) {
            return computerMove.equals("rock");
        } else {
            return computerMove.equals("paper");
        }
    }
}