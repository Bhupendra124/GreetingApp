package com.bridgelabz.GreetingApp.controller;
import com.bridgelabz.GreetingApp.model.User;
import org.springframework.web.bind.annotation.*;



//@RestController
//@RequestMapping("/hello")
public class HelloGreeting {

//    private static final String template = "Hello, %s!";
//    private final AtomicLong counter = new AtomicLong();

    /**
     * http://localhost:8080/hello
     * @return
     */
    @RequestMapping(value = {"","/","/home"})
    public String sayHello(){
    return "Hello from Bridgelabz!!!";
}

    /**
     * http://localhost:8080/hello/query?name=bhupendra
     * @param name
     * @return
     */
    @RequestMapping(value = {"/query"},method = RequestMethod.GET)
    public String sayHello(@RequestParam(value = "name") String name){
        return "Hello "+name+"!";
}

    /**
     * http://localhost:8080/hello/param/bhupendra
     * @param name
     * @return
     */
    @GetMapping("/param/{name}")
    public String sayHelloParam(@PathVariable String name){
        return "Hello " +name+"!";
}

@PostMapping("/post")
public  String sayHello(@RequestBody User user){
        return  "Hello" +user.getFirstName()+" "+user.getLastName() + "!";
}

    /**
     * put
     * http://localhost:8080/hello/put/bhupendra/?lastName=wadekar
     * @param firstName
     * @param lastName
     * @return
     */

  @PutMapping("/put/{firstName}")
    public  String sayHello(@PathVariable String firstName,
                            @RequestParam(value = "lastName") String lastName){
        return "Hello "+ firstName+" "+lastName+ "!";
  }

}