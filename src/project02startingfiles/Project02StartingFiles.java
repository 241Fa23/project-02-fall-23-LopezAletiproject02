/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project02startingfiles;

import java.util.*;

/**
 *
 * @author
 */
public class Project02StartingFiles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        String cChoice;
        Random rand = new Random();

        System.out.println("Welcome to JavaQuest!");
        System.out.println("Stay alive and increase your score!");

        System.out.println("\nChoose a character...");
        System.out.println("(k)Knight || (h)Healer || (w)Wizard || (t)Thief");
        cChoice = input.nextLine();
        Player player;
        switch (cChoice) {
            case "k":
                player = new Knight();
                System.out.println("\nWelcome, Knight!\n");
                break;
            case "h":
                player = new Healer();
                System.out.println("\nWelcome, Healer!\n");
                break;
            case "w":
                player = new Wizard();
                System.out.println("\nWelcome, Wizard!\n");
                break;
            case "t":
                player = new Thief();
                System.out.println("\nWelcome, Thief!\n");
                break;
            default:
                System.out.println("Invalid choice. Exiting the game");
                return;
        }
        System.out.println("What would you like to do?");
        System.out.println("{?}Status Report || {n}{s}{e}{w} move 1 space North, South, East, or West || {q} Quit");
        cChoice = input.nextLine();
        while (!"q".equals(cChoice)) {
            if ("?".equals(cChoice)) {
                System.out.println(player);
            } else if ("n".equals(cChoice) || "s".equals(cChoice) || "e".equals(cChoice) || "w".equals(cChoice)) {
                move(player, rand);
            } else {
                System.out.println("Invalid choice, please try again!");
            }
            System.out.println("What would you like to do?");
            System.out.println("{?}Status Report || {n}{s}{e}{w} move 1 space North, South, East, or West || {q} Quit");
            cChoice = input.nextLine();
        }
        System.out.println("*******************************************");
        System.out.println("*******************************************");
        System.out.println("The game has come to an end! Your final stats:");
        System.out.println("\n" + player.toString());
        System.out.println("Thanks for playing!");
    }

    private static void move(Player player, Random random) {
        int randomEvent = random.nextInt(5);

        if (randomEvent == 0) {
            System.out.println("**********************");
            System.out.println(getRandomScene());
            System.out.println("**********************");
            player.setScore(player.getScore() + 1);
        } else {
            attack(player, random);
        }
    }

    private static void attack(Player player, Random random) {
        int randomEnemy = random.nextInt(3);
        int chance = random.nextInt(5);
        int run = random.nextInt(2);
        Scanner input = new Scanner(System.in);
        String choice;

        if (randomEnemy == 0) {
            System.out.println("A zombie has appeared!!!");
        } else if (randomEnemy == 1) {
            System.out.println("A bandit has snuck up on you!");
        } else if (randomEnemy == 2) {
            System.out.println("A lobbyist are approaching you :( ");
        }
        System.out.println("How would you like to handle this?");
        System.out.println("{s}Special Move || {r}Run!");
        choice = input.nextLine();
        if ("s".equals(choice)) {
            battle(player, random);
        } else if ("r".equals(choice)) {
            System.out.println("You attempted to run away!");
            if (run == 0) {
                System.out.println("Succesful you got away! + 1 score");
                player.setScore(player.getScore() + 1);
            } else if (run == 1) {
                System.out.println("You were not succesful");
                battle(player, random);
            }

        }
    }

    private static void battle(Player player, Random random) {
        Scanner input = new Scanner(System.in);
        int randBattle = random.nextInt(10);
        System.out.println("Prepare for battle!");
        System.out.println("Choose anyletter then ENTER to continue");
        input.nextLine();
        System.out.println("**********************");
        if (randBattle < 6) {
            player.useSpecialMove();
            System.out.println("Player wins! Increase score by 2 points!");
            player.setScore(player.getScore() + 2);
            System.out.println("\n" + player.toString());
            System.out.println();
        } else {
            player.useSpecialMove();
            System.out.println("Oh no! Attacked Missed! Lose 1 health!");
            player.setHealth(player.getHealth() - 1);
            System.out.println("\n" + player.toString());
            System.out.println();
        }
    }

    private static String getRandomScene() {
        String[] scenes = {"Nothing here...", "Nice trees around here...", "Interesting cottage there...", "Potty break..."};
        return scenes[new Random().nextInt(scenes.length)];
    }

}
