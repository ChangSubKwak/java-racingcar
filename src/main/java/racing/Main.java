package racing;

import racing.domain.Cars;
import racing.domain.RacingEvent;
import racing.view.InputView;
import racing.view.ResultView;

public class Main {

    private static final String RESULT_MEG = "실행결과";

    public static void main(String[] args) {

        InputView inputView = new InputView();
        int carCount = inputView.getCarCount();
        int tryCount = inputView.getTryCount();
        RacingEvent racingEvent = new RacingEvent(carCount,tryCount);

        System.out.println(RESULT_MEG);

        for(int i = 1; i <= tryCount; i++){
            checkCars(racingEvent, i);
            printResultSpace();
        }
    }

    private static void checkCars(RacingEvent racingEvent, int i) {
        ResultView resultView = new ResultView();
        for(Cars cars : racingEvent.getCarList()){
            resultView.printResultPosition(cars.getPosition().get(i));
        }
    }

    private static void printResultSpace(){
        System.out.println("");
        System.out.println("");
    }
}
