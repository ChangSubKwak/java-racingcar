package racing;

public class Main {

    public static void main(String[] args) {

        InputView inputView = new InputView();
        RacingEvent racingEvent = new RacingEvent(inputView.getCarCount(), inputView.getTryCount());

        ResultView resultView = new ResultView();

        for(int i = 1; i <= inputView.getTryCount(); i++){
            for(Car car : racingEvent.getCarList()){
                resultView.resultPosition(car.getPosition().get(i));
            }
            System.out.println("");
            System.out.println("");
        }

    }
}