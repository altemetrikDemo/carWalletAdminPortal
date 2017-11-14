package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VehicleController {
	
	
	@RequestMapping(value= "/")
	public String helloWorld() {
		
		return "Hello World";
	}

}
