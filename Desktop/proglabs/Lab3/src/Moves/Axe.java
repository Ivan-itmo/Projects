package Moves;

import java.util.Random;

public class Axe implements Weapon{
    Random random = new Random();
    int attack;
    @Override
    public int damage(){
        attack = random.nextInt(21);
        return attack;
    }
    @Override
    public String toString(){
        return "Axe";
    }
}
