package com.bridgelabz.GreetingApp.controller;

import com.bridgelabz.GreetingApp.model.Greeting;
import com.bridgelabz.GreetingApp.model.User;
import com.bridgelabz.GreetingApp.services.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/greeting")
public class GreetingControllerWithDB {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    /**
     * dependency injection{why interface=want
     * flexablity to inject any kind of service to give open close capablity}
     */
    @Autowired
    private IGreetingService greetingService;
    /**
     * Ability to Store in DB an then return list using GET method from the Database
     * @param: name
     * Execution URL : curl -X GET "http://localhost:8080/greeting" -w "\n"
     * @return
     */

    @GetMapping(value = {"","/","/home"})
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        User user = new User();
        user.setFirstName(name);
        return greetingService.addGreeting(user);
    }
    /**
     * Ability to get greeting message by Id using GET method from the Database
     * @param: id
     * Execution URL : curl -X GET "http://localhost:8080/greeting/greeting/1" -w "\n"
     * @return
     */
}
