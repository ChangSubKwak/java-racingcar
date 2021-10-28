package work3;

import java.util.Arrays;
import java.util.function.BiFunction;

public enum Operator {
    PLUS("+", (firstNumber, secondNumber) -> firstNumber + secondNumber),
    MINUS("-", (firstNumber, secondNumber) -> firstNumber - secondNumber),
    MULTIPLY("*", (firstNumber, secondNumber) -> firstNumber * secondNumber),
    DIVIDE("/", (firstNumber, secondNumber) -> firstNumber / secondNumber);

    private final String operator;
    private final BiFunction<Integer, Integer, Integer> expression;

    Operator(String operator, BiFunction<Integer, Integer, Integer> expression) {
        this.operator = operator;
        this.expression = expression;
    }

    public static Operator of(String operator) {
        return Arrays.stream(values())
            .filter(op -> op.operator.equals(operator))
            .findFirst()
            .orElseThrow(() -> new IllegalArgumentException("존재하지 않는 연산자입니다."));
    }

    public int calculate(Integer firstNumber, Integer secondNumber) {
        return expression.apply(firstNumber, secondNumber);
    }
}
