/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs4_photon_masipag_exercise4;

/**
 *
 * @author Lance Masipag
 */
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Move rock = new Move("Rock");
        Move paper = new Move("Paper");
        Move scissors = new Move("Scissors");

        rock.setStrongAgainst(scissors);
        paper.setStrongAgainst(rock);
        scissors.setStrongAgainst(paper);

        int currentRound = 1;
        int roundsToWin = 2;
        int userWins = 0;
        int computerWins = 0;
        int counter = 0;
        
        System.out.println("This is a Rock Scissors Paper Game!\nChoose the number of your choice:\n");
        System.out.println("1. Start the game\n2. Change number of rounds\n3. End the game\n");
        Scanner choice = new Scanner(System.in);
        Scanner rounds = new Scanner(System.in);
        int option = choice.nextInt();
        while (option != 3){
            if (counter != 0){
                System.out.println("1. Start the game\n2. Change number of rounds\n3. End the game\n");
                option = choice.nextInt();
            }
            switch (option) {
                case 2:
                    System.out.println("Up to how many wins to end the game: ");
                    roundsToWin = rounds.nextInt();
                    if (roundsToWin <= 1){
                        System.out.println("Up to how many wins to end the game: ");
                        roundsToWin = rounds.nextInt();
                    }
                    System.out.println("\nFirst to win " + roundsToWin + " rounds wins!\n");
                    while (userWins < roundsToWin && computerWins < roundsToWin) {
                        System.out.println("This is round " + currentRound + ".");
                        System.out.println("The computer has selected its move: Please enter the number of your choice:\n1. Rock\n2. Paper\n3. Scissors\n");

                        /*set the choice of the user*/
                        Move userChoice;
                        int userNumChoice = choice.nextInt();
                        userChoice = (userNumChoice == 1) ? rock : (userNumChoice == 2) ? paper : (userNumChoice == 3) ? scissors : null;
                        while (userChoice == null){
                            System.out.println("Please enter only a number... 1, 2, or 3\n");
                            userNumChoice = choice.nextInt();
                            userChoice = (userNumChoice == 1) ? rock : (userNumChoice == 2) ? paper : (userNumChoice == 3) ? scissors : null;
                        }

                        /*set te choice of the computer*/
                        Move computerChoice;
                        int random = (int) Math.floor(Math.random() * 3) + 1;
                        computerChoice = (random == 1) ? rock : (random == 2) ? paper : scissors;

                        /*generates result*/
                        int resultValue;
                        String result = null;
                        resultValue = Move.compareMoves(userChoice, computerChoice);
                        switch (resultValue) {
                            case 0:
                                result = "You win!\n";
                                userWins++;
                                break;
                            case 1:
                                result = "The computer wins!\n";
                                computerWins++;
                                break;
                            case 2:
                                result = "It's a draw!\n";
                                break;
                        }

                        System.out.println("\nYou chose " + userChoice.getName() + "...");
                        System.out.println("The computer chose " + computerChoice.getName() + ".\n");
                        System.out.println(result);
                        System.out.println("Current Score\n\tYou: " + userWins + "\n\tComputer: " + computerWins + ".\n");
                        currentRound++;
                    }
                    break;
                case 3:
                    break;
                default:
                    while (userWins < roundsToWin && computerWins < roundsToWin) {
                        System.out.println("\nThis is round " + currentRound + ".");
                        System.out.println("The computer has selected its move: Please enter the number of your choice:\n1. Rock\n2. Paper\n3. Scissors\n");

                        /*set the choice of the user*/
                        Move userChoice;
                        int userNumChoice = choice.nextInt();
                        userChoice = (userNumChoice == 1) ? rock : (userNumChoice == 2) ? paper : (userNumChoice == 3) ? scissors : null;
                        while (userChoice == null){
                            System.out.println("Please enter only a number... 1, 2, or 3");
                            userNumChoice = choice.nextInt();
                            userChoice = (userNumChoice == 1) ? rock : (userNumChoice == 2) ? paper : (userNumChoice == 3) ? scissors : null;
                        }

                        /*set te choice of the computer*/
                        Move computerChoice;
                        int random = (int) Math.floor(Math.random() * 3) + 1;
                        computerChoice = (random == 1) ? rock : (random == 2) ? paper : scissors;

                        /*generates result*/
                        int resultValue;
                        String result = null;
                        resultValue = Move.compareMoves(userChoice, computerChoice);
                        switch (resultValue) {
                            case 0:
                                result = "You win!\n";
                                userWins++;
                                break;
                            case 1:
                                result = "The computer wins!\n";
                                computerWins++;
                                break;
                            case 2:
                                result = "It's a draw!\n";
                                break;
                        }

                        System.out.println("\nYou chose " + userChoice.getName() + "...");
                        System.out.println("The computer chose " + computerChoice.getName() + ".");
                        System.out.println(result);
                        System.out.println("\nCurrent Score...\tYou: " + userWins + "\tComputer: " + computerWins + ".\n");
                        currentRound++;
                    }
            }

            if (userWins > computerWins) {
                System.out.println("Congratulations! You win the game!\n");
                currentRound = 1;
                userWins = 0;
                computerWins = 0;
            } else {
                System.out.println("Computer wins the game. Try again!\n");
                currentRound = 1;
                userWins = 0;
                computerWins = 0;
            }
            counter++;
        }
        System.out.println("Thank you for playing!");
    }
}