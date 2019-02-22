package com.profesorp.restexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.profesorp.restexample.service.ITestService;

@RestController
public class MyRestController {

    private static final String template = "Hello, %s!";    
    
    @Autowired 
    ITestService testService;
    
    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(testService.callme(),
                            String.format(template, name));
    }
}
