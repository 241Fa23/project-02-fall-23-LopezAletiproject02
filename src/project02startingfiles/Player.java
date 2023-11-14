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

    public Player() {
        health = 10;
        score = 0;
    }

    public int getHealth() {
        return health;
    }

    public int getScore() {
        return score;
    }

    public void setHealth(int healthIn) {
        this.health = healthIn;
    }

    public void setScore(int scoreIn) {
        this.score = scoreIn;
    }

    public abstract String getSpecialMove();

    public abstract void useSpecialMove();

    @Override
    public abstract String toString();
}
