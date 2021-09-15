package com.bridgelabz.GreetingApp.services;

import com.bridgelabz.GreetingApp.model.Greeting;
import com.bridgelabz.GreetingApp.model.User;
import com.bridgelabz.GreetingApp.repository.GreetingRepository;
import org.apache.catalina.Store;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;

@Service
public class GreetingService  implements  IGreetingService{

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @Autowired
    private GreetingRepository greetingRepository;


    @Override
    public Greeting addGreeting(User user) {
        String message = String.format(template, (user.toString().isEmpty())? "Hello World" : user.toString());
        return greetingRepository.save(new Greeting(counter.incrementAndGet(), message));
    }
//    @Override
//    public Greeting addGreeting(User user) {
//        return null;
//    }

    @Override
    public Greeting getGreetingById(Long id) {
        return null;
    }
}
