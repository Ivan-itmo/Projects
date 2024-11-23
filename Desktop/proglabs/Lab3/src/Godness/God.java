package Godness;

public record God (String name, int k_fertility) {
    public void Hello(){
        System.out.println("Появился бог " + name + " который может увеличить плодородность в " + k_fertility + " раза");
    }
}

