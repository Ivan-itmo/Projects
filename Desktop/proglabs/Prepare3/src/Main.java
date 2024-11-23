import java.util.Objects;
public class Main {
    public static void main(String[] args) {
        Person p = new Person("Alice", 30);
        System.out.println(p);
        System.out.println(p.hashCode());
    }
}
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, age); // Хэш-код на основе полей
    }

}

