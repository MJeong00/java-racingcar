package step3;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarTest {

    Car car = new Car();

    @Test
    void addCount() {
        Car car = new Car();
        car.addGoCount();
        Assertions.assertThat(car.getGoCount()).isEqualTo(1);
    }
}
