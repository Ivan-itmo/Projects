package Household;

import java.util.Random;
import Godness.God;

public class Field {
    Random random = new Random();
    public int fertility;
    public Field(int fertility) {
        this.fertility = fertility;
    }
    public int getFertility(int performance, God god) {
        return fertility * performance * god.k_fertility() - random.nextInt(501);
    }
}
