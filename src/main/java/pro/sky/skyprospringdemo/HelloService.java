package pro.sky.skyprospringdemo;

import org.springframework.web.bind.annotation.RequestParam;

public interface HelloService {
    String hello();
    String answerhello(@RequestParam("name") String userName);
    String helloCalculator();
}
