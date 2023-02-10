package racing.domain;

import java.util.ArrayList;

public class RacingEvent {

    private ArrayList<Cars> carsList = new ArrayList<>();

    public RacingEvent(int carCount, int tryCount){
        readyEvent(carCount);
        startEvent(tryCount);
    }

    public ArrayList<Cars> getCarList(){
        return this.carsList;
    }

    private void readyEvent(int count){
        for(int i = 0; i < count; i++){
            carsList.add(new Cars());
        }
    }

    private void startEvent(int count){
        RandomMove random = new RandomMove();
        for(int i = 0; i < count; i++){
            for(Cars cars : carsList){
                cars.moveForward(random.move());
            }
        }
    }
}
