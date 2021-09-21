package com.bridgelabz.GreetingApp.controller;


import com.bridgelabz.GreetingApp.model.Greeting;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

/**
 * UC1--curl opration
 */
//@RestController
//@RequestMapping("/greeting")
public class GreetingController {
    private  static final String template="Hello, %s!";
    private  final AtomicLong counter=new AtomicLong();

    /**
     * $ curl -X GET "http://localhost:8080/greeting" -w "\n"
     * http://localhost:8080/greeting
     * http://localhost:8080/greeting
     * @param name
     * @return
     */
    @GetMapping(value = {"","/","/home"})
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "world") String name){
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }

    /**
     * way using postman
     * {
     *     "id": 1,
     *     "message": "Hello, Hello Bhupendra how are you!"
     * }
     * http://localhost:8080/greeting/post
     *  Execution URL : curl -X POST -H "Message-Type: application/json" -d '{"Message":"Bhupendra"}'
     * @param greeting
     * @return
     */
    @PostMapping("/post")
    public Greeting postGreeting(@RequestBody Greeting greeting) {
        return new Greeting(counter.incrementAndGet(), String.format(template, greeting.getMessage()));
    }

    /**
     *
     * @param id
     * @param name
     * @return
     */
    @PutMapping("/put/{id}")
    public Greeting putGreeting(@PathVariable int id, @RequestParam(value = "name") String name) {
        return new Greeting(id, String.format(template, name));
    }
}

