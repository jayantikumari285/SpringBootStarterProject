package wfhSpring.test.project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@GetMapping("/getMessage")
	public String getMessage()
	{
		return "Hello world!!";
	}

}
