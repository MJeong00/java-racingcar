package step3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RacingCar {

    public static final int RANDOM_LIMIT = 10;
    public static final int LIMIT = 4;
    private static List<Car> cars = new ArrayList<>();
    Random random = new Random();
    public static void createCars(int carCount){
        for(int i=0; i<carCount; i++){
            cars.add(new Car());
        }
    }

    public static List<Car> getCarList() {
        return cars;
    }

    public void oneRace() {
        for (Car car : cars) {
            goOrStop(car);
        }
    }

    private void goOrStop(Car car) {
        boolean isGo = isValueMoreThan(randomValue());
        if(isGo){
            car.addGoCount();
        }
    }

    public boolean isValueMoreThan(int value) {
        return value >= LIMIT;
    }

    private int randomValue() {
        return random.nextInt(RANDOM_LIMIT);
    }

}
