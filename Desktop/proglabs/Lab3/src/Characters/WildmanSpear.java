package Characters;

import Moves.Weapon;

public class WildmanSpear extends Wildman {
    int spear;
    public WildmanSpear(String name, int height, int weight, Weapon weapon) {
        super(name, height, weight, weapon);
    }
    @Override
    public void setDamage(MainCharacter character, Weapon weapon){
        spear = weapon.damage();
        character.takeDamage(spear, name);

    }
    @Override
    public void Hello(){
        System.out.println("Появился солдат из племени " + name + " " + "рост " + height + " " + "вес " + weight + " " + "оружие " + weapon.toString());
    }

}