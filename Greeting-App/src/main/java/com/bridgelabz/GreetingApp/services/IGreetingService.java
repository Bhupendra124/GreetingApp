package com.bridgelabz.GreetingApp.services;

import com.bridgelabz.GreetingApp.model.Greeting;
import com.bridgelabz.GreetingApp.model.User;

public interface IGreetingService {
    Greeting addGreeting(User user);
    Greeting getGreetingById(Long id);
}
