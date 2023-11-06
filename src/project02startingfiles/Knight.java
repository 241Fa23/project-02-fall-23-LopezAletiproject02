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

    public Knight(int healthIn, int scoreIn) {
        super(healthIn, scoreIn);
    }

    public String getSpecialMove() {
        return "slash";
    }

    public String getHealth() {
        return super healthIn;
    }

    public void useSpecialMove() {

    }

    @Override

    public String toString() {
        return "Knight: " + "\nHealth: " + healthIn;
    }
}
