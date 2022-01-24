package racing;

public class ResultView {

    public ResultView(){
        System.out.println("실행결과");
    }

    public void printResultPosition(int moveCount){
        for(int i = 1; i <= moveCount; i++){
            System.out.print("-");
        }
        System.out.println("");
    }

    public void printResultSpace(){
        System.out.println("");
        System.out.println("");
    }
}
