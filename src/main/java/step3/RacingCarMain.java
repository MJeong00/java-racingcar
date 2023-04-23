package step3;

import java.util.List;

import static step3.Car.*;
import static step3.RacingCar.*;
import static step3.input.InputView.input;
import static step3.input.InputView.inputString;
import static step3.output.ResultView.printRace;

public class RacingCarMain {
    public static void main(String[] args) {
        RacingCar rc = new RacingCar();
        String carsName = inputString("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        int raceCount = input("시도할 회수는 몇 회 인가요?");

        List<Car> cars = createCars(rc.split(carsName));
        for(int i=0; i<raceCount; i++){
            rc.oneRace(cars);
            printRace(cars);
        }
    }
}
