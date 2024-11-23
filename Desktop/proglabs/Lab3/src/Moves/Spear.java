package Moves;

import java.util.Random;

public class Spear implements Weapon{
    Random random = new Random();
    int attack;
    @Override
    public int damage(){
        attack = random.nextInt(31);
        return attack;
    }
    @Override
    public String toString(){
        return "Spear";
    }
}