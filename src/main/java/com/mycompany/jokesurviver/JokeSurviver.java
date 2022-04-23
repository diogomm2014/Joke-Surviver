package com.mycompany.jokesurviver;

import java.util.Scanner;

public class JokeSurviver {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int lives = 3;
        int correctRiddles = 0;

        System.out.println("Welcome to Joke Surviver!");
        System.out.println("Here's the story: You are walking through a forest.\nYou find a cave and decide to explore it.\nYou walk inside and find a dragon.\nYou decide to run deeper into the cave to get away from the dragon.\nThe dragon notices you and starts to chase you.\nYou suddenly remember that you read that this cave has five stone walls halfway through.\nSolve the riddles to break the stone walls and run away.\nBut get a riddle wrong and the dragon attacks you and you lose a life.");
        System.out.println("Here are the instructions. Type in the number that solves the riddle you are currently solving.\nIf you use words or punctuation, an error will occur.");
        System.out.println("You in the moment have 3 lives. Here is the first riddle.");
        System.out.print("What number is luckier than 7?: ");
        int myAnswer = input.nextInt();

        switch (myAnswer) {
            case 77:
                System.out.println("Correct!");
                System.out.println("You broke the first stone wall! It's a great start.");
                correctRiddles = correctRiddles + 1;
                break;
            default:
                System.out.println("You got it wrong! The dragon attacked and you lost a life!");
                switch (lives) {
                    case 0:
                        System.out.print("GAME OVER");
                        System.exit(0);
                        break;
                    default:
                        lives = lives - 1;
                        System.out.println(" You now have " + (lives) + " lives left.");
                        break;
                }
        }

        System.out.println("Here goes the second riddle!");
        System.out.print("What is the most greedy number?: ");
        int myAnswer2 = input.nextInt();

        switch (myAnswer2) {
            case 8:
                System.out.println("Correct!");
                System.out.println("You broke the second stone wall! Keep going!");
                correctRiddles = correctRiddles + 1;
                break;
            default:
                System.out.print("You got it wrong! The dragon attacked you and you lost a life!");
                switch (lives) {
                    case 0:
                        System.out.print("GAME OVER");
                        System.exit(0);
                        break;
                    default:
                        lives = lives - 1;
                        System.out.println(" You now have " + (lives) + " lives left.");
                        break;

                }
        }

        System.out.println("Here goes the third riddle!");
        System.out.print("What number is more prone to winning?: ");
        int myAnswer3 = input.nextInt();

        switch (myAnswer3) {
            case 1:
                System.out.println("Correct!");
                System.out.println("You broke the third stone wall! You're doing good.");
                correctRiddles = correctRiddles + 1;
                break;
            default:
                System.out.print("You got it wrong! The dragon attacked you and you lost a life!");
                switch (lives) {
                    case 0:
                        System.out.print("GAME OVER");
                        System.exit(0);
                        break;
                    default:
                        lives = lives - 1;
                        System.out.println(" You now have " + (lives) + " lives left.");
                        break;

                }
        }
        System.out.println(" The fourth riddle is here!");
        System.out.print("What number gives even more bad luck than 13?: ");
        int myAnswer4 = input.nextInt();

        switch (myAnswer4) {
            case 1313:
                System.out.println("Correct!");
                System.out.println("You broke the fourth stone wall! You're almost out!");
                correctRiddles = correctRiddles + 1;
                break;
            default:
                System.out.print("You got it wrong! The dragon attacked you and you lost a life!");
                switch (lives) {
                    case 0:
                        System.out.print("GAME OVER");
                        System.exit(0);
                        break;
                    default:
                        lives = lives - 1;
                        System.out.print(" You now have " + (lives) + " lives left.");
                        break;

                }

        }

        System.out.println("You find a extra life.");
        System.out.print("You grab it.");
        lives = lives + 1;
        System.out.println(" You now have " + lives + " lives left.");
        System.out.println("For the last riddle, you're going to be solving a problem instead of a riddle.");
        System.out.println("So here it is!");
        System.out.print("What number means \"A topic for begginners\"?: ");
        int myAnswer5 = input.nextInt();

        switch (myAnswer5) {
            case 101:
                System.out.println("Correct!");
                System.out.println("You broke the fifth and final stone wall!");
                correctRiddles = correctRiddles + 1;
                break;
            default:
                System.out.print("You got it wrong! The dragon attacked you and you lost a life!");
                lives = lives - 1;
                break;

        }

        System.out.println("You got through the cave!!!");
        System.out.println("Game Status: You ended the game with " + lives + " lives left and " + correctRiddles + " out of 5 correct riddles.");
        System.out.print("Thank you for playing!!!");

    }

}
