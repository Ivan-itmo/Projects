package Characters;
import Household.*;
import Godness.God;
import java.util.Objects;

public class MainCharacter extends People{
    public int health;
    public int performance;
    public int intake;
    public MainCharacter(String name, int height, int weight, int health, int performance, int intake) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.health = health;
        this.performance = performance;
        this.intake = intake;
    }
    @Override
    public void Hello(){
        System.out.println("Появился главный персонаж " + name + "!");
    }
    public boolean f = true;
    public void starvation(Field field, God god){
        if (field.getFertility(performance, god) - intake < 0){
            health -= field.getFertility(performance, god) - intake;
            if (health <= 0){
                f = false;
                System.out.println(name + " погиб от голода");
            }
        }
        else{
            System.out.println("Год прошел без голода");
        }
    }
    public void takeDamage(int attack, String nameattacker){
        if (f) {
            health -= attack;
            if (health <= 0) {
                f = false;
                System.out.println(name + " погиб от рук " + nameattacker);
            }
            else {
                System.out.println("Получен дамаг " + name + " на " + attack + " от " + nameattacker + " оставшееся здоровье " + health);
            }
        }
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Проверяем, ссылаются ли объекты на одну и ту же память
        if (obj == null || this.getClass() != obj.getClass()) return false; // Проверяем, что объект не null и того же класса

        MainCharacter that = (MainCharacter) obj;
        return health == that.health &&
                performance == that.performance &&
                intake == that.intake &&
                f == that.f &&
                name.equals(that.name) && // Сравниваем строку имени
                height == that.height &&
                weight == that.weight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, height, weight, health, performance, intake, f);
    }

    @Override
    public String toString() {
        return "MainCharacter{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", health=" + health +
                ", performance=" + performance +
                ", intake=" + intake +
                ", isalive=" + f +
                '}';
    }

}
