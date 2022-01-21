package racingTest;

import static org.assertj.core.api.AssertionsForClassTypes.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import racing.Car;
import racing.RacingEvent;

public class RacingTest {
    @Test
    @DisplayName("Car 클래스 검사")
    void carTest() {
        Car car = new Car();
    }

    @Test
    @DisplayName("차량 대수를 지정한 수 만큼 이벤트의 차량객체가 지정한 차량대수만큼 리스트에 추가되었는지 테스트한다")
    void racingEventCarTest(){
        int carCount = 3;
        int tryCount = 4;
        RacingEvent racingEvent = new RacingEvent(carCount,tryCount);
        assertThat(racingEvent.getCarList().size()).isEqualTo(carCount);
    }

/*    @Test
    @DisplayName("차량마다 시도횟수 만큼 4이상의 랜덤값이 배정 되었는지 테스트한다.")
    void racingEventTryTest(){
        int carCount = 3;
        int tryCount = 4;
        RacingEvent racingEvent = new RacingEvent(carCount,tryCount);
        assertThat(racingEvent.getCarList().size()).isEqualTo(carCount);
    }*/

}

