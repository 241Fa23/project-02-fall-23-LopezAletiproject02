/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project02startingfiles;

import java.util.Scanner;

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
        System.out.println(player);

    }
}
