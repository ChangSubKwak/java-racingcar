package racing;

public class Main {

    public static void main(String[] args) {

        InputView inputView = new InputView();
        int carCount = inputView.getCarCount();
        int tryCount = inputView.getTryCount();
        RacingEvent racingEvent = new RacingEvent(carCount,tryCount);
        ResultView resultView = new ResultView();

        for(int i = 1; i <= tryCount; i++){
            checkCars(racingEvent, resultView, i);
            resultView.printResultSpace();
        }
    }

    private static void checkCars(RacingEvent racingEvent, ResultView resultView, int i) {
        for(Cars cars : racingEvent.getCarList()){
            resultView.printResultPosition(cars.getPosition().get(i));

        }
    }
}
