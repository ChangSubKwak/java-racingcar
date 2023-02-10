package work4;

public class Main {
    public static void main(String[] args) {
        InputView inView = new InputView();
        RacingEvent racingEvent = new RacingEvent(inView.getCarCount(),inView.getTryCount());
        ResultView resultView = new ResultView();

        for(int i = 1; i <= inView.getTryCount(); i++){
            for(RacingCar car : racingEvent.getCarList()){
                resultView.showCurrentPosition(inView.getCarCount(), car.getSuccessCount());
            }
            System.out.println("");
            System.out.println("");
        }
        
    }
}
