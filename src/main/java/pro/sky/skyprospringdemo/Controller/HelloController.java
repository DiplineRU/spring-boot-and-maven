package pro.sky.skyprospringdemo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.skyprospringdemo.HelloService;

@RestController
public class HelloController {
    private final HelloService helloService;

    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping
    public String hello() {
        return helloService.hello();
    }

    @GetMapping(path = "/hello")
    public String answerhello(@RequestParam("name") String userName) {
        return helloService.answerhello(userName);
    }

    @GetMapping(path = "/calculator")
    public String helloCalculator(){
        return helloService.helloCalculator();
    }
}