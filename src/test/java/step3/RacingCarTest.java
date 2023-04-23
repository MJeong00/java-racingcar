package step3;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;
import static step3.RacingCar.createCars;

public class RacingCarTest {

    RacingCar rc = new RacingCar();
    Car car = new Car();
    int carCount = 3;
    int raceCount = 5;

    @Test
    void 차_이름만큼_리스트_사이즈() {
        assertThat(createCars("1,2,3")).hasSize(carCount);
    }

    @ParameterizedTest(name = "{0} is more than 4 : {1}")
    @MethodSource("parameter")
    void 특정값_이상_체크(int value, boolean result) {
        assertThat(rc.isValueMoreThan(value)).isEqualTo(result);
    }

    static Stream<Arguments> parameter(){
        return Stream.of(
                arguments(1, false)
                ,arguments(2, false)
                ,arguments(4, true)
                ,arguments(6, true)
        );
    }


}
