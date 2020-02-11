package calculator;

import view.ErrorView;

public class OperatorFunction {
    private static final double ZERO = 0d;

    private OperatorFunction() {
    }

    public static double add(double a, double b) {
        return Double.sum(a, b);
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        checkIsZero(b);
        return a / b;
    }

    private static void checkIsZero(double num) throws IllegalArgumentException {
        if (num == ZERO) {
            throw new IllegalArgumentException(ErrorView.INVALID_EXPRESSION_ERROR_STR);
        }
    }
}
