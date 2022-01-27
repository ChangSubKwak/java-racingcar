package racing;

import static org.assertj.core.api.AssertionsForClassTypes.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import racing.domain.RacingEvent;

public class RacingTest {

    @Test
    @DisplayName("차량 대수를 지정한 수 만큼 이벤트의 차량객체가 지정한 차량대수만큼 리스트에 추가되었는지 테스트한다")
    void racingEventCarTest(){
        int carCount = 3;
        int tryCount = 4;
        RacingEvent racingEvent = new RacingEvent(carCount,tryCount);
        int size = racingEvent.getCarList().size();
        assertThat(size).isEqualTo(carCount);
    }
}
