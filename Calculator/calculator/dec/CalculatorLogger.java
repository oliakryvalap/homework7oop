package Calculator.calculator.dec;

import Calculator.calculator.calculator.Calculable;
import Calculator.log.Loggable;

public class CalculatorLogger implements Calculable {
    private Calculable calculator;
    private Loggable logger;

    public CalculatorLogger(Calculable calculator, Loggable logger) {
        this.calculator = calculator;
        this.logger = logger;
    }

    @Override
    public Calculable sum(int arg) {
        logger.log(String.format("Вычисляется сумма чисел: %d и %d", calculator.getResult(), arg));
        return calculator.sum(arg);
    }

    @Override
    public Calculable multi(int arg) {
        logger.log(String.format("Вычисляется произведение чисел: %d и %d", calculator.getResult(), arg));
        return calculator.multi(arg);
    }

    @Override
    public int getResult() {
        logger.log(String.format("Результат = %d", calculator.getResult()));
        return calculator.getResult();
    }

}
