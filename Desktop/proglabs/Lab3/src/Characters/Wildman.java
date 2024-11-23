package Characters;

import Moves.Weapon;
import java.util.Objects;

public abstract class Wildman extends People{
    public Weapon weapon;
    public Wildman(String name, int height, int weight, Weapon weapon) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.weapon = weapon;
    }
    public abstract void setDamage(MainCharacter character, Weapon attack);
    @Override
    public boolean equals(Object obj) {
        // Проверка на то, является ли объект сам собой
        if (this == obj) {
            return true;
        }

        // Проверка на null и на класс объекта
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }

        // Приведение obj к типу Wildman
        Wildman wildman = (Wildman) obj;

        // Сравнение всех полей
        return height == wildman.height &&
                weight == wildman.weight &&
                Objects.equals(name, wildman.name) &&
                Objects.equals(weapon, wildman.weapon); // Сравниваем также weapon
    }

    // Переопределение hashCode()
    @Override
    public int hashCode() {
        return Objects.hash(name, height, weight, weapon); // Сгенерировать хэш-код на основе всех полей
    }

    // Переопределение toString()
    @Override
    public String toString() {
        return "Wildman{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", weapon=" + weapon +
                '}'; // Строковое представление объекта
    }
}
