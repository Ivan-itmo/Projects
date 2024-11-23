package children;
import parent.Cars;

public class BMW extends Cars {
    //public int year1;
    //public String mark1;
    //public String color1;
    public BMW(int year, String mark, String color) {
        super(year, mark, color);
    }

    public BMW(int year, String mark) {
        this.year = year;
        this.mark = mark;
    }

    public String fabric = "BMW Motors";
    public void changefabric(String fabric){
        this.fabric = fabric;
    }
    public void changeyear(int year){
        this.year = year;
    }
    @Override
    public int age(int now_year){
        return now_year - year - 10;
    }
}
