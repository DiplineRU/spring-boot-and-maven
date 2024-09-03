package pro.sky.skyprospringdemo.Service;

import org.springframework.stereotype.Service;
import pro.sky.skyprospringdemo.HelloService;


@Service
public class HelloServiceImpl implements HelloService {
    public String hello() {
        return "<b>Hello!</b>";
    }

    public String answerhello(String userName) {
        return "Hello, " + userName;
    }

    public String helloCalculator() {
        return "Добро пожаловать в калькулятор!";
    }
}
