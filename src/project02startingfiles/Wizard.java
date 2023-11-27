/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project02startingfiles;

/**
 *
 * @author s548114
 */
public class Wizard extends Player {

    private String specialMove;

    public Wizard() {

    }

    @Override
    public String getSpecialMove() {
        return "'Cast a Spell'";
    }

    @Override
    public void useSpecialMove() {
        System.out.println("The Wizard casts a spell!");
    }

    @Override
    public String toString() {
        return "Wizard Status:\nHealth: " + getHealth() + "\nScore: " + getScore() + "\nThe Wizard's special move is " + getSpecialMove();
    }

}
