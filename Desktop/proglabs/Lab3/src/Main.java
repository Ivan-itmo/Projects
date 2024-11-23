import Exceptions.*;
import Moves.*;
import Characters.*;
import Household.*;
import Godness.*;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        try {
            System.out.println("Введите имя главного героя, его высоту, вес, здоровье, производителньость и потребление в int");
            String name = scanner.nextLine();

            int height = scanner.nextInt();
            if (height < 0) {
                throw new NegativeNumberException();
            }
            int weight = scanner.nextInt();
            if (weight < 0) {
                throw new NegativeNumberException();
            }
            int health = scanner.nextInt();
            if (health < 0) {
                throw new NegativeNumberException();
            }
            int performance = scanner.nextInt();
            if (performance < 0) {
                throw new NegativeNumberException();
            }
            int intake = scanner.nextInt();
            if (intake < 0) {
                throw new NegativeNumberException();
            }

            int year = 485;
            God god = new God("Аллах", random.nextInt(3) + 1);
            god.Hello();

            MainCharacter character = new MainCharacter(name, height, weight, health, performance, intake);
            character.Hello();
            CharacterItems items = new CharacterItems(Item.values());
            Field field = new Field(25);

            Weapon weapon1 = new Sword();
            Weapon weapon2 = new Spear();
            Weapon weapon3 = new Axe();

            //System.out.println();

            while (character.f) {
                System.out.println("В " + year + " году произошло:");
                if (random.nextInt(2) == 0){
                    System.out.println("Дикие люди не пришли");
                    items.printItems(character);
                    character.starvation(field, god);
                }
                else {
                    System.out.println("Дикие люди пришли");

                    WildmanSword wildman1 = new WildmanSword("Enumai", random.nextInt(10) + 170, random.nextInt(10) + 70, weapon1);
                    wildman1.Hello();
                    WildmanSpear wildman2 = new WildmanSpear("Kriks", random.nextInt(20) + 160, random.nextInt(20) + 65, weapon2);
                    wildman2.Hello();
                    WildmanAxe wildman3 = new WildmanAxe("Barka", random.nextInt(15) + 190, random.nextInt(15) + 60, weapon3);
                    wildman3.Hello();
                    Stoleman stoleman = new Stoleman("Ashyr", random.nextInt(5) + 150, random.nextInt(5) + 90, random.nextInt(130));
                    stoleman.Hello();

                    wildman1.setDamage(character, weapon1);
                    wildman2.setDamage(character, weapon2);
                    wildman3.setDamage(character, weapon3);

                    stoleman.processStole(character, items);
                    items.printItems(character);
                }
                year += 1;
                System.out.println();
            }
        } catch (InputMismatchException e) {
            System.out.println("int должен быть!");
            System.exit(0);
        } catch (NegativeNumberException e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }


    }
}