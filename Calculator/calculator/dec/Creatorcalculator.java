package Calculator.calculator.dec;



public class Creatorcalculator implements import ICalculableMaker;
import Calculator.calculator.Calculable;
import Calculator.calculator.Calculator;
import Calculator.log.impl.ConsoleLogger;
 {
    @Override
    public Calculable create(int primaryArg) {
        return (Calculable) new CalculatorLogger(new Calculator(primaryArg), new ConsoleLogger());
    }
}