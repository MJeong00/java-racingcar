package step3;

import java.util.ArrayList;
import java.util.List;

public class Car {

    private int goCount;
    //private static List<Car> cars = new ArrayList<>();



    public Car() {
        this.goCount = 0;
    }

    public int getGoCount() {
        return goCount;
    }

    public void addGoCount() {
        this.goCount++;
    }

}
