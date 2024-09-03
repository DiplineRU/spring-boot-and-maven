package pro.sky.skyprospringdemo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.skyprospringdemo.Service.CalculatorServiceImpl;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    //server.port = 8090 (application.properties)
    public final CalculatorServiceImpl calculatorService;

    public CalculatorController(CalculatorServiceImpl calculatorService) {
        this.calculatorService = calculatorService;
    }

    //http://localhost:8090/calculator/plus?num1=5&num2=5
    @GetMapping(path = "/plus")
    public String plus(@RequestParam(value = "num1") int number1,
                       @RequestParam(value = "num2") int number2) {
        return calculatorService.plus(number1, number2);
    }

    //http://localhost:8090/calculator/minus?num5=0&num2=5
    @GetMapping(path = "/minus")
    public String minus(@RequestParam(value = "num1") int number1,
                        @RequestParam(value = "num2") int number2) {
        return calculatorService.minus(number1, number2);
    }

    //http://localhost:8090/calculator/multiply?num1=5&num2=5
    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam(value = "num1") int number1,
                           @RequestParam(value = "num2") int number2) {
        return calculatorService.multiply(number1, number2);
    }

    //http://localhost:8090/calculator/divide?num1=5&num2=5
    @GetMapping(path = "/divide")
    public String divide(@RequestParam(value = "num1") int number1,
                         @RequestParam(value = "num2") int number2) {
        if (number1 != 0 || number2 != 0) {
            return "На ноль делить нельзя";
        }
        return calculatorService.divide(number1, number2);
    }
}
