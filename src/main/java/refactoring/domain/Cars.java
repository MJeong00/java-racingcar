package refactoring.domain;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import strategy.Moveable;

public class Cars {

	private final List<Car> cars;

	private Cars(List<Car> cars) {
		this.cars = cars;
	}

	public static Cars of(String carNames) {
		String[] names = carNames.split(",");

		List<Car> cars = Arrays.stream(names)
							.map(Car::new)
					   		.collect(Collectors.toList());
		return new Cars(cars);
	}

	public RacingRecord ofRecord() {
		return new RacingRecord(cars);
	}

	public void move(Moveable moveable) {
		for (Car car : cars) {
			car.move(moveable);
		}
	}
}
