package racing;

import java.util.Random;

public class RandomMove {

    private Random random = new Random();

    boolean move(){
        return 4 <= random.nextInt(10);
    }

}
