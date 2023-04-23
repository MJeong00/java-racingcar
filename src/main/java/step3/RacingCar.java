package step3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RacingCar {

    public static final int RANDOM_LIMIT = 10;
    public static final int LIMIT = 4;
    public static final int NAME_LENGTH = 5;

    public static List<Car> createCars(String carNames){
        String[] names = split(carNames);

        List<Car> cars = new ArrayList<>();
        for(int i=0; i<names.length; i++){
            checkName(names[i]);
            cars.add(new Car(names[i]));
        }
        return cars;
    }

    private static String[] split(String carsName) {
        String[] names = carsName.split(",");
        return names;
    }

    public static void checkName(String name) {
        if(name.length() > NAME_LENGTH){
            throw new IllegalArgumentException("이름은 5자를 넘길 수 없습니다.");
        }
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
