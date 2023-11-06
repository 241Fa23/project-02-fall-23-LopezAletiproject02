/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project02startingfiles;

/**
 *
 * @author S543153
 */
public abstract class Player {

    private int health;
    private int score;

    Player(int healthIn, int scoreIn) {
        health = healthIn;
        score = scoreIn;

    }

    @Override
    public abstract String toString();

}
