package com.brentaronsen.section7OOP2;

public class Player {

    // example no encapsulation
    public String fullName;
    public int health;
    public String weapon;

    public void loseHealth(int damage) {
        this.health = this.health - damage;
        if (this.health <= 0 ) {
            System.out.println("Player knocked out");
            // reduce number of lives remaining for player
        }
    }

    public int healthRemaining() {
        return this.health;
    }
}
