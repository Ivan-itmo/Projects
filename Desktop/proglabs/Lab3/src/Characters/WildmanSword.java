package Characters;

import Moves.*;

public class WildmanSword extends Wildman {
    int sword;
    public WildmanSword(String name, int height, int weight, Weapon weapon) {
        super(name, height, weight, weapon);
    }
    @Override
    public void setDamage(MainCharacter character, Weapon weapon){
        sword = weapon.damage();
        character.takeDamage(sword, name);

    }
    @Override
    public void Hello(){
        System.out.println("Появился солдат из племени " + name + " " + "рост " + height + " " + "вес " + weight + " " + "оружие " + weapon.toString());
    }

}
