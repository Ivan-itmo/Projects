import parent.Cars;
import children.BMW;
public class Main {
    public static void main(String[] args) {
        BMW car1 = new BMW(2000, "BMWx1", "white");
        System.out.println(car1.color);
        Cars.counter += 1;
        int a = car1.age(2024, 2);
        System.out.println(a);
        Cars car2 = new Cars(2005, "BMWx2");
        System.out.println(car2.color);
        Cars car3 = new Cars();
        System.out.println(car3.color);
    }
}