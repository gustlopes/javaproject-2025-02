package br.edu.atitus.greeting_service_gustlopes.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("greeting-service-gustlopes")
public class GreetingController {

	@GetMapping({"", "/"})
	public ResponseEntity<String> getGreetingService(){
		
		String textReturn = String.format("%s %s!	", "Satisfação,", "meu chefe");
		return ResponseEntity.ok(textReturn);
		
	}
	
}