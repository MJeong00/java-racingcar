package step3;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CarTest {

    Car car = new Car();

    @Test
    void 차_이름() {
        assertThatThrownBy(() -> car.checkName("123456"))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void addCount() {
        Car car = new Car();
        car.addGoCount();
        Assertions.assertThat(car.getGoCount()).isEqualTo(1);
    }
}
