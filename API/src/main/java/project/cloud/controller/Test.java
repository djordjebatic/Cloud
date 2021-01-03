package project.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.cloud.model.Counter;
import project.cloud.service.CounterService;
import org.springframework.http.HttpStatus;
import java.lang.*; 

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class Test {

    @Autowired
    CounterService counterService;

    @RequestMapping(method = GET, value = "/")
    public String getCount(){
        Counter c = counterService.incrementCounter();

        return "Host: " + System.getenv("HOST") + " | " + "Counter: " + Integer.toString(c.getNumber());
    }
}
