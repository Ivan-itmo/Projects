package Characters;
import java.util.Objects;
import Household.*;

public class Stoleman extends People{
    public int maxmas;
    public Stoleman(String name, int height, int weight, int maxmas) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.maxmas = maxmas;
    }
    @Override
    public void Hello(){
        System.out.println("Появился воришка из племени " + name + " который может унести вес " + maxmas + "!");
    }
    public void processStole(MainCharacter character, CharacterItems property) {
        if (character.f) {
            int c = 0;
            for (Item prop : property.getProperty()) {
                if (prop.getMas() > maxmas) {
                    c += 1;
                }
            }
            Item[] newproperty = new Item[c];
            int i = 0;
            for (Item prop : property.getProperty()) {
                if (prop.getMas() > maxmas) {
                    newproperty[i++] = prop;
                }
                else{
                    System.out.println("Воришка " + name + " украл " + prop);
                }
            }
            property.setProperty(newproperty);
        }
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true; // Сравниваем ссылки: если это один и тот же объект, возвращаем true
        }
        if (obj == null || this.getClass() != obj.getClass()) {
            return false; // Если другой объект null или классы не совпадают, возвращаем false
        }
        Stoleman stoleman = (Stoleman) obj; // Приводим объект к классу Stoleman
        return maxmas == stoleman.maxmas &&
                height == stoleman.height &&
                weight == stoleman.weight &&
                name.equals(stoleman.name);
    }

    @Override
    public int hashCode() {
        // Генерируем хэш-код на основе всех полей
        return Objects.hash(name, height, weight, maxmas);
    }

    @Override
    public String toString() {
        return "Stoleman{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", maxmas=" + maxmas +
                '}';
    }


}
