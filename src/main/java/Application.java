import calculator.Calculator;
import view.ErrorView;
import view.InputView;
import view.OutputView;

public class Application {
	public static void main(String[] args) {
		while (true){
			String input = InputView.inputExpression();
			useCalculator(input);
		}
	}

	public static void useCalculator(String input) {
		String result;
		try {
			result = Calculator.doOneCycle(input);
			OutputView.printResult(result);
		} catch (IllegalArgumentException e) {
			ErrorView.println(e.getMessage());
		}
	}
}
