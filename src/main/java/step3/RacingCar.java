package step3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RacingCar {

    public static final int RANDOM_LIMIT = 10;
    public static final int LIMIT = 4;

    public static List<Car> createCars(int carCount){
        List<Car> cars = new ArrayList<>();
        for(int i=0; i<carCount; i++){
            cars.add(new Car());
        }
        return cars;
    }
    public void oneRace(List<Car> cars) {
        for (Car car : cars) {
            goOrStop(car);
        }
    }

    public void goOrStop(Car car) {
        boolean isGo = isValueMoreThan(randomValue());
        if(isGo){
            car.addGoCount();
        }
    }

    public boolean isValueMoreThan(int value) {
        return value >= LIMIT;
    }

    private int randomValue() {
        Random random = new Random();
        return random.nextInt(RANDOM_LIMIT);
    }
}
