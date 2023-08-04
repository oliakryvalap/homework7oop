package Calculator.calculator;

import Calculator.calculator.dec.Creatorcalculator;
public class Main {
    public static void main(String[] args) {
        ICalculableMaker calculableMaker = new Creatorcalculator();
        CalculatorView view = new CalculatorView(calculableMaker);
        view.run();
    }
}
