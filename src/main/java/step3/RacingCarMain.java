package step3;

import step3_bak.input.InputView;

import java.util.List;

import static step3.RacingCar.createCars;
import static step3.input.InputView.input;
import static step3.output.ResultView.printRace;

public class RacingCarMain {
    public static void main(String[] args) {
        RacingCar rc = new RacingCar();
        String carsName = InputView.inputString("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        int raceCount = input("시도할 회수는 몇 회 인가요?");

        List<Car> cars = createCars(carsName);
        for(int i=0; i<raceCount; i++){
            rc.oneRace(cars);
            printRace(cars);
        }
    }
}
