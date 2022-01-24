package racing;

import java.util.ArrayList;

public class Cars {
    private ArrayList<Integer> position;

    public Cars() {
        position = new ArrayList<>();
        position.add(0);
    }

    public ArrayList<Integer> getPosition() {
        return position;
    }

    public void moveForward(boolean success) {
        if (success) {
            position.add(position.get(position.size() - 1) + 1);
            return;
        }
        position.add(position.get(position.size() - 1));
    }
}
