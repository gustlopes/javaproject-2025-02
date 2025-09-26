package br.edu.atitus.greeting_service_gustlopes.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("greeting-service-gustlopes")
public class GreetingController {
	
	@Value("${greeting-service-gustlopes.greeting}")
	private String greeting;

	@Value("${greeting-service-gustlopes.default-name}")
	private String defaultName;
	
	@GetMapping({"", "/", "/{namePath}"})	
	public ResponseEntity<String> getGreetingService(
			@RequestParam(required = false) String name,
			@PathVariable(required = false) String namePath
			){
		if (name == null)
			name = namePath != null ? namePath : defaultName;
		
		String textReturn = String.format("%s %s!	", "Salve,", name);
		return ResponseEntity.ok(textReturn);
		
	}
	
}