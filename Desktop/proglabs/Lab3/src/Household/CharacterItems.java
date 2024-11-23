package Household;
import Characters.MainCharacter;


public class CharacterItems {
    public Item[] items;
    public CharacterItems(Item[] items) {
        this.items = items;
    }
    public void printItems(MainCharacter character){
        if (character.f && items.length > 0) {
            System.out.println("Главный персонаж " + character.name + " имеет собственность:");
            for (Item p : items) {
                System.out.println(p.toString());
            }
        }
    }
    public int getLength(Item[] items){
        int c = 0;
        for (Item p : items) {
            c += 1;
        }
        return c;
    }
    public Item[] getProperty(){
        return items;
    }
    public void setProperty(Item[] items){
        this.items = items;
    }
}

