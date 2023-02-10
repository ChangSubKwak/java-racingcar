package work4;

import java.util.ArrayList;
import java.util.Scanner;

public class RacingEvent {
    private int carCount;
    private int tryCount;
    private ArrayList<RacingCar> carList = new ArrayList<>();
    private ResultView view = new ResultView();

    RacingEvent(int carCount, int tryCount){
        readyEvent(carCount);
        startEvent(tryCount);
    }

    // private void setUpRacingEvent(){
    //     Scanner scanner = new Scanner(System.in);
    //     System.out.println("자동차 대수는 몇 대 인가요?");
    //     carCount = scanner.nextInt();
    //     System.out.println("시도할 회수는 몇 회 인가요?");
    //     tryCount = scanner.nextInt();
    //     System.out.println("");
    //     System.out.println("실행결과");
    // }

    private void readyEvent(int carCount){
        for(int i = 0; i < carCount; i++){
            carList.add(new RacingCar());
        }
    }

    private void startEvent(int tryCount){
        for(int i = 0; i < tryCount; i++){
            for(RacingCar car : carList){
                car.tryMoveForward();
            }
        }
    }
    public ArrayList<RacingCar> getCarList(){
        return this.carList;
    }
    // void showRacingGame(){
    //     for(int i = 1; i <= tryCount; i++){
    //         for(RacingCar car : carList){
    //             view.showCurrentPosition(i, car.getSuccessCount());
    //         }
    //         System.out.println("");
    //     }
    // }
}
