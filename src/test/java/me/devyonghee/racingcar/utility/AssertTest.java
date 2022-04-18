package me.devyonghee.racingcar.utility;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.platform.commons.util.ReflectionUtils;

import java.util.Collections;

import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

@DisplayName("검증")
class AssertTest {

    @Test
    @DisplayName("객체화 불가능")
    void instance_thrownAssertionError() {
        assertThatExceptionOfType(AssertionError.class)
                .isThrownBy(() -> ReflectionUtils.newInstance(Assert.class));
    }

    @Test
    @DisplayName("null 검증")
    void notNull() {
        //given
        String error = "error";
        //when, then
        assertThatIllegalArgumentException().isThrownBy(() -> Assert.notNull(null, error))
                .withMessage(error);
    }

    @ParameterizedTest
    @DisplayName("텍스트 존재 검증")
    @NullAndEmptySource
    void hasText(String text) {
        //given
        String error = "error";
        //when, then
        assertThatIllegalArgumentException().isThrownBy(() -> Assert.hasText(text, error))
                .withMessage(error);
    }

    @Test
    @DisplayName("빈 컬렉션 검증")
    void notEmpty() {
        assertThatIllegalArgumentException().isThrownBy(() -> Assert.notEmpty(null, "message"));
        assertThatIllegalArgumentException().isThrownBy(() -> Assert.notEmpty(Collections.emptyList(), "message"));
    }
}