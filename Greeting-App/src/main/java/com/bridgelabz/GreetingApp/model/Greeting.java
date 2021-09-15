package com.bridgelabz.GreetingApp.model;

import javax.persistence.*;

@Entity
@Table(name ="GREETING" )
public class Greeting {

    //Id here is primary key for table db
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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

