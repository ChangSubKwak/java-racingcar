package work3;

public class Calculator {

    //더하기
    public int plus(int a, int b) {
        return a + b;
    }

    //빼기
    public int minus(int a, int b) {
        return a - b;
    }

    //곱하기
    public int multiply(int a, int b) {
        return a * b;
    }

    //나누기
    public int divide(int a, int b) {

        try {
            return a / b;
        }catch (ArithmeticException e){

            System.out.println("0으로 나눌수 없습니다.");
            return 0;
        }
    }

    //사칙연산 메서드 이용
    public int calculate(int first, char sign, int second){

        if(sign == '+'){
            return plus(first, second);
        }

        if(sign == '-'){
            return minus(first, second);
        }

        if(sign == '*'){
            return multiply(first,second);
        }

        if(sign == '/'){
            return divide(first, second);
        }
        throw new RuntimeException();
    }

    //공백나누기
    public String[] diviedBlink(String str){
        return str.split(" ");
    }

    //문자를 숫자로 변경
    public int toInt(String str){
        return Integer.parseInt(str);
    }

    //계산코드
    public int toCalculate(String[] str){
        int result = toInt(str[0]);
        for(int i = 0; i < str.length - 2; i += 2){
            result = calculate(result, str[i + 1].charAt(0), toInt(str[i + 2]));
        }
        return result;
    }
}
