package calculator;

import view.ErrorView;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public enum Operator {
    ADDITION(OperatorRepository::add, "+"),
    SUBTRACTION(OperatorRepository::subtract, "-"),
    MULTIPLICATION(OperatorRepository::multiply, "*"),
    DIVISION(OperatorRepository::divide, "/");

    private static final Integer ZERO_INDEX = 0;
    private static final Integer ONE_SIZE = 1;

    private BinaryOperator<Double> operate;
    private String symbol;

    Operator(BinaryOperator<Double> operate, String symbol) {
        this.operate = operate;
        this.symbol = symbol;
    }

    public static Operator getOperator(String symbol) throws IllegalArgumentException {
        return Arrays.stream(Operator.values())
                .filter(t -> t.getSymbol().equals(symbol))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException(ErrorView.INVALID_EXPRESSION_ERROR_STR));
    }

    public double calculate(double a, double b) {
        return operate.apply(a, b);
    }

    private String getSymbol() {
        return symbol;
    }
}
