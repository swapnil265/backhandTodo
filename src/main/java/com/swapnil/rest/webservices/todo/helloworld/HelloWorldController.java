package com.swapnil.rest.webservices.todo.helloworld;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

//controller
@CrossOrigin(origins="http://localhost:4200")
@RestController
public class HelloWorldController {
	
	//method return Hello World.
	
	//GET 
	//URL - /"hello-world"
	
	@GetMapping(path="/hello-world")
	public String helloWorld() {
		return "Hello world";
	}
	
	@GetMapping(path="/hello-world-Bean")
	public HelloWorldBean helloWorldBean() throws Exception {
		return new HelloWorldBean ("hello world");
		//throw new Exception("Some Error happened in backhand server");
	}
	@GetMapping(path="/hello-world/path-variable/{name}")
	public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
		return new HelloWorldBean (String.format("Hello World,%s",name));
	}

}
