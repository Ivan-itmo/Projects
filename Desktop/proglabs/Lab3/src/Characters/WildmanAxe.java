package Characters;

import Moves.Weapon;

public class WildmanAxe extends Wildman {
    int axe;
    public WildmanAxe(String name, int height, int weight, Weapon weapon) {
        super(name, height, weight, weapon);
    }
    @Override
    public void setDamage(MainCharacter character, Weapon weapon){
        axe = weapon.damage();
        character.takeDamage(axe, name);

    }
    @Override
    public void Hello(){
        System.out.println("Появился солдат из племени " + name + " " + "рост " + height + " " + "вес " + weight + " " + "оружие " + weapon.toString());
    }

}
