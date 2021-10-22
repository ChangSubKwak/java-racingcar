import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import work3.Calculator;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatExceptionOfType;

public class CalcuratorTest {

    Calculator calculator;

    @BeforeEach
    public void SetUp(){
        calculator = new Calculator();
    }

    @Test
    @DisplayName("plus 메서드를 이용하여 1과3을 더하면 더한값이 4로 정상출력되어 통과된다")
    void plusTest(){
        assertThat(4).isEqualTo(calculator.plus(1,3));
    }

    @Test
    @DisplayName("minus 메서드를 이용하여 6에서2를 빼면 값이 4로 정상출력되어 통과된다")
    void minusTest(){
        assertThat(4).isEqualTo(calculator.minus(6,2));
    }

    @Test
    @DisplayName("multiply메서드를 이용하여 2와 2를 곱한값이 4로 정상출력되어 통과된다")
    void multiplyTest(){
        assertThat(4).isEqualTo(calculator.multiply(2,2));
    }

    @Test
    @DisplayName("divide메서드를 이용하여 나눌때 ArithmeticException이 발생하면 0으로나눌수 없다는 예외처리가 된다. ")
    void divideTest(){calculator.divide(8,0);}

    @Test
    @DisplayName("space메서드를 이용하여 정상적으로 공백이 제거된다")
    void spaceTest(){
        String str = "1 + 3";
        String[] result = {"1" , "+", "3"};
        assertThat(result).isEqualTo(calculator.diviedBlink(str));

    }

    @Test
    @DisplayName("toCalculate메서드를 이용하여 입력된 문자열을 한글자씩 나누어 순서대로 사칙연산에 의한 값이 출력된다")
    void calTest(){
        String str = "2 + 3 * 4 / 2";
        String[] result = calculator.diviedBlink(str);
        assertThat(10).isEqualTo(calculator.toCalculate(result));
    }

    @Test
    @DisplayName("문자열 사이에 사칙연산 대신 공백이 오면 익셉션이 발생하는 테스트")
    void calExceptionTest(){
        String str = "2  3";
        String[] result = calculator.diviedBlink(str);
        assertThatExceptionOfType(IndexOutOfBoundsException.class)
                .isThrownBy(() -> {
                    calculator.toCalculate(result);
                }).withMessageMatching("String index out of range: \\d+");
    }
}
