package parent;

public class Cars {
    public int year;
    public String mark;
    public String color;
    public static int counter = 0;
    public Cars(int year, String mark, String color){
        this.year = year;
        this.mark = mark;
        this.color = color;
    }
    public Cars(int year, String mark){
        this.year = year;
        this.mark = mark;
    }
    public Cars(){
        year = 1900;
        mark = "Ford";
        color = "black";
    }

    public int age(int now_year){
        return now_year - year;
    }

    public int age(int now_year, int k){
        return (now_year - year) * k;
    }

    public static int price(int year){
        return year * 1000;
    }

}
