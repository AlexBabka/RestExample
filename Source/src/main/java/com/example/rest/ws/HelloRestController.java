package com.example.rest.ws;

import com.example.rest.bean.Greeting;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRestController {
    private final AtomicLong counter = new AtomicLong();

    @ResponseBody
    @RequestMapping(value = "/user", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Greeting hello(@RequestParam(value = "name", defaultValue = "World") String name) {

        //returns the view name
        return new Greeting(counter.incrementAndGet(), name);
    }
}
