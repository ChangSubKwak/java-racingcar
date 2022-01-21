package racingTest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import racing.Car;
import racing.RandomMove;

public class RacingTest {
    @Test
    @DisplayName("Car 클래스 검사")
    void carTest() {
        Car car = new Car();
    }

    @ParameterizedTest
    @DisplayName("car가 4 이상의 숫자만 전진하는 테스트")
    @ValueSource(ints = {0, 1, 2, 3})
    void doesCarProceed(int value) {
        Car car = new Car();

    }

    @Test
    @DisplayName("숫자타입이 입력이 되는지를 테스트한다.")
    void moveTest(){
        RandomMove move = new RandomMove();
        move.equals(1);
    }

}

