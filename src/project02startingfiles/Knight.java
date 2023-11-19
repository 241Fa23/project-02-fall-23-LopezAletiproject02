/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project02startingfiles;

/**
 *
 * @author S543153
 */
public class Knight extends Player {

    private String specialMove;

    public Knight() {

    }

    @Override
    public String getSpecialMove() {
        return "'Slash with Sword'";
    }

    @Override
    public void useSpecialMove() {
        System.out.println("The Knight slashes with the sword!");
    }

    @Override
    public String toString() {
        return "Knight Status:\nHealth: " + getHealth() + "\nScore: " + getScore() + "\nThe Knight's special move is " + getSpecialMove();
    }
}
