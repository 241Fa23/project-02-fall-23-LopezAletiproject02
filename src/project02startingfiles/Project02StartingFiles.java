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
        System.out.println("");
        cChoice = input.nextLine();
        Player player;
        switch (cChoice) {
            case "k":
                player = new Knight();
                break;
            case "h":
                player = new Healer();
            case "w":
                player = new Wizard();
            case "t":
                player = new Thief();
                break;
            default:
                System.out.println("Invalid choice. Exiting the game");
                return;
        }
        System.out.println("What would you like to do?");
        System.out.println("{?}Status Report || {n}{s}{e}{w} move one space north, south, east, or west || {q} quit");
        cChoice = input.nextLine();
        while (cChoice != "q") {
            if (cChoice == "?") {
                System.out.println(player);
            }
        }
    }

    private static void move(Player player, Random random) {
        int randomEvent = random.nextInt(5);

        if (randomEvent == 0) {
            System.out.println("Nice trees around");
            player.setScore(player.getScore() + 1);
        } else if (randomEvent == 1) {
            System.out.println("Potty break");
            player.setScore(player.getScore() + 1);
        } else if (randomEvent == 2) {

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
        if (choice == "s") {
            System.out.println("Prepare for battle!");
            System.out.println("Choose anyletter the ENTER to continue");
            choice = input.nextLine();
            if (chance == 0 || chance == 1 || chance == 2) {
                player.useSpecialMove();
                System.out.println("Player wins increase score by 2");
                player.setScore(player.getScore() + 2);
                System.out.println(player);

            } else {
                player.useSpecialMove();
                System.out.println("You missed... 1 health point deducted");
                player.setHealth(player.getHealth() - 1);
                System.out.println(player);

            }
            if (choice == "r") {
                System.out.println("You attempted to run away!");
                if (run == 0) {
                    System.out.println("Succesful you got away! + 1 score");
                    player.setScore(player.getScore() + 1);

                } else if (run == 1) {
                    System.out.println("You were not succesful");
                }

            }

        }

    }

}
