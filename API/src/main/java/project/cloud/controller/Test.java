package project.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.cloud.model.Counter;
import project.cloud.service.CounterService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import java.util.HashMap;
import java.util.Map;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class Test {

    @Autowired
    CounterService counterService;

    @RequestMapping(method = GET, value = "/")
    public ResponseEntity getCount(){
        Counter c = counterService.incrementCounter();
        Map<String, Object> ret = new HashMap<String,Object>();
        ret.put("counter", c);
        ret.put("host", System.getenv("HOST"));

        return new ResponseEntity<>(ret, HttpStatus.OK);
    }
}
