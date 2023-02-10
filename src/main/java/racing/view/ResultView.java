package racing.view;

public class ResultView {

    private static final String MOVE_CNT = "-";

    public ResultView(){}

    public void printResultPosition(int moveCount){
        for(int i = 1; i <= moveCount; i++){
            System.out.print(MOVE_CNT);
        }
        System.out.println("");
    }
}
