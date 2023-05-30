package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class Game {
    private String name;
    private int pointsQuantity;
    private int userPointsQuantity;
    private int computerPointsQuantity;


    public void gameProcess() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome in Rocks-Paper-Scissors game. Enter your name:");
        name = scanner.nextLine();

        System.out.println(name + " enter the number of points to win:");
        pointsQuantity = scanner.nextInt();

        System.out.println("We play to " + pointsQuantity + " points. \n" +
                "key 1 = stone, \n" +
                "key 2 = paper, \n" +
                "key 3 = scissors, \n" +
                "key x = end of the game, \n" +
                "key n = launching the game again. \n" +
                "Let's start!");

        boolean end = false;
        while (!end) {
            System.out.println("Enter your move:");
            String input = scanner.nextLine();

            int percentage = random.nextInt(3);

            if (input.equals("1")) {
                handleMove("stone", percentage);
            } else if (input.equals("2")) {
                handleMove("paper", percentage);
            } else if (input.equals("3")) {
                handleMove("scissors", percentage);
            }

            if (input.equals("n")) {
                System.out.println("Are you sure to reset the points? y/n:");
                input = scanner.nextLine();
                if (input.equals("y")) {
                    System.out.println("Game starts again!");
                    resetGame();
                } else if (input.equals("n")) {
                    System.out.println(("We keep playing."));
                    continue;
                }
            }

            if (input.equals("x")) {
                System.out.println("Are you sure to end the game? y/n:");
                input = scanner.nextLine();
                if (input.equals("y")) {
                    System.out.println("Good bye!");
                    System.exit(0);
                } else {
                    System.out.println(("We keep playing."));
                    continue;
                }
            }

            if (isGameOver()) {
                if (pointsQuantity == computerPointsQuantity) {
                    System.out.println(name + " you lost!");
                } else {
                    System.out.println(name + " you won!");
                }
                System.out.println("If you want to play again press n, if you want to end the game press x:");
                input = scanner.nextLine();
                if (input.equals("x")) {
                    System.out.println("Good bye!");
                    System.exit(0);
                } else if (input.equals("n")) {
                    System.out.println("We're playing again!");
                    resetGame();
                }
            }
        }
    }

    private void handleMove(String userMove, int computerMove) {
        String[] moves = {"stone", "paper", "scissors"};
        String computerMoveName = moves[computerMove];

        if (userMove.equals(computerMoveName)) {
            System.out.println("Same figure, go again!");
            showPoints();
        } else if ((userMove.equals("stone") && computerMoveName.equals("scissors")) ||
                (userMove.equals("paper") && computerMoveName.equals("stone")) ||
                (userMove.equals("scissors") && computerMoveName.equals("paper"))) {
            userPointsQuantity++;
            System.out.println(userMove + " wins with " + computerMoveName);
            showPoints();
        } else {
            computerPointsQuantity++;
            System.out.println(userMove + " loses with " + computerMoveName);
            showPoints();
        }
    }

    private boolean isGameOver() {
        return pointsQuantity == computerPointsQuantity || pointsQuantity == userPointsQuantity;
    }

    private void resetGame() {
        userPointsQuantity = 0;
        computerPointsQuantity = 0;
    }

    public void showPoints() {
        System.out.println("Your points: " + userPointsQuantity + "\n" +
                "Computer points: " + computerPointsQuantity);
    }
}
