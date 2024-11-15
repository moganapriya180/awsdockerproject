package com.dockerautomation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerAutomationController {
	
	@GetMapping(value="/getValue")
	public String getvalue(String a) {
		return "Hi santhosh";
		
	}

}
