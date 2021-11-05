package work3;

public class Calculator {

    public int plus(int a, int b) {
        return a + b;
    }
    public int minus(int a, int b) {
        return a - b;
    }
    public int multiply(int a, int b) {
        return a * b;
    }
    public int divide(int a, int b) {
        return a / b;
    }

    //공백나누기
    public String[] diviedBlank(String str) {
        return str.split(" ");
    }

    //문자를 숫자로 변경
    public int toInt(String str) {
        return Integer.parseInt(str);
    }

    //계산코드
    public int calculate(String[] str) {
        int result = toInt(str[0]);
        for (int i = 0; i < str.length - 2; i += 2) {
            result = Operator.of(String.valueOf(str[i + 1].charAt(0))).calculate(result, toInt(str[i + 2]));
        }
        return result;
    }
}
