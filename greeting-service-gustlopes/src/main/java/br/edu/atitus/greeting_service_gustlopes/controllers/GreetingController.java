package br.edu.atitus.greeting_service_gustlopes.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.edu.atitus.greeting_service_gustlopes.configs.GreetingConfig;

@RestController
@RequestMapping("greeting-service-gustlopes")
public class GreetingController {
	
//	@Value("${greeting-service-gustlopes.greeting}")
//	private String greeting;
//
//	@Value("${greeting-service-gustlopes.default-name}")
//	private String defaultName;
	
	private final GreetingConfig greetingConfig;

	public GreetingController(GreetingConfig greetingConfig) {
		super();
		this.greetingConfig = greetingConfig;
	}



	@GetMapping({"", "/", "/{namePath}"})	
	public ResponseEntity<String> getGreetingService(
			@RequestParam(required = false) String name,
			@PathVariable(required = false) String namePath
			){
		if (name == null)
			name = namePath != null ? namePath : greetingConfig.getDefaultName();
		
		String textReturn = String.format("%s %s!	", greetingConfig.getGreeting(), name);
		return ResponseEntity.ok(textReturn);
		
	}
	
}