package pro.sky.skyprospringdemo.Service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl {
    public String plus(int number1, int number2) {
        return number1 + " + " + number2 + " = " + (number1+number2);
    }

    public String minus(int number1, int number2) {
        return number1 + " - " + number2 + " = " + (number1-number2);
    }

    public String multiply(int number1, int number2) {
        return number1 + " x " + number2 + " = " + (number1+number2);
    }

    public String divide(int number1, int number2) {
        return number1 + " / " + number2 + " = " + (number1/number2);
    }
}
