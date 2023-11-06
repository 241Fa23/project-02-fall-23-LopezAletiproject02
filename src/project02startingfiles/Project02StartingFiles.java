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

        if (cChoice.equals("k")) {
            System.out.println("\nWelcome, Knight");

        }
        if (cChoice.equals("h")) {
            System.out.println("\nWelcome, Healer");

        }
        if (cChoice.equals("w")) {
            System.out.println("\nWelcome, Wizard");

        }
        if (cChoice.equals("t")) {
            System.out.println("\nWelcome, Thief");

        }

        Knight p1 = new Knight(100, 1);

        String specialMove = p1.getSpecialMove();
        System.out.println(specialMove);
    }

}
