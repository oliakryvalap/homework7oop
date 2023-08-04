package Calculator.calculator;

public class CalculableMaker implements ICalculableMaker {
    public static Calculable create(int primaryArg) {
        return new Calculator(primaryArg);
    }
}
