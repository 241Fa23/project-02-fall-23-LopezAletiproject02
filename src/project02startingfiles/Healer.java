/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project02startingfiles;

/**
 *
 * @author s548114
 */
public class Healer extends Player {

    private String specialMove;

    public Healer(int health, int score) {
        super(health, score);
    }

    @Override
    public String getSpecialMove() {
        return "Slash with Sword";
    }

    @Override
    public void useSpecialMove() {
        System.out.println("The healer uses sleeping powder!");
    }

    @Override
    public String toString() {
        return "Healer Status:\nHealth: " + getHealth() + "\nScore: " + getScore() + "\nThe Healer's Special move is " + specialMove;
    }

}
