package racingcar;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class RacingCarTest {

	@Test
	@DisplayName("자동차 전진 테스트")
	void moveTest() {
		Car car = new Car();
		assertThat(car.getPosition()).isEqualTo(0);
		car.move();
		assertThat(car.getPosition()).isEqualTo(1);
		car.move();
		car.move();
		assertThat(car.getPosition()).isEqualTo(3);
	}

	@DisplayName("게임 생성 : 자동차 생성 테스트")
	@ParameterizedTest
	@ValueSource(strings = {"3", "5", "10"})
	void makeCarTest(int carSize) {
		Game game = new Game(carSize);
		assertThat(game.getCar().size()).isEqualTo(carSize);
	}

	@Test
	@DisplayName("전진 또는 멈춤 테스트")
	void moveOrStopTest() {
		Game game = new Game(1);
		Car car = game.getCar().get(0);
		game.moveOrStop(car);
		game.moveOrStop(car);
		game.moveOrStop(car);
		game.moveOrStop(car);
		game.moveOrStop(car);
		assertThat(car.getPosition()).isBetween(0, 6);
	}

	@Test
	@DisplayName("실행 횟수 테스트")
	void runTest() {
		Game game = new Game(1);
		game.run(5);
		assertThat(game.getExecuteCount()).isEqualTo(5);
		game.run(10);
		assertThat(game.getExecuteCount()).isEqualTo(10);
	}

	@Test
	@DisplayName("실행 결과 테스트")
	void runExecuteTest() {
		Game game = new Game(3);
		game.run(5);

		for(Car car : game.getCar()) {
			assertThat(car.getPosition()).isBetween(0,6);
		}
	}
}
