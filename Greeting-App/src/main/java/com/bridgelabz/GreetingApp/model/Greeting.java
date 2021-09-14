package com.bridgelabz.GreetingApp.model;

public class Greeting {
    private final long id;
    private String message;

    public String getMessage() {
        return message;
    }

    public long getId() {
        return id;
    }

    public Greeting(){
        id = 0;
        message = "";
    }
    public Greeting(long id, String message) {
        this.id = id;
        this.message = message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

