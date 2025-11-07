package br.edu.atitus.config_service_gustlopes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServiceGustlopesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServiceGustlopesApplication.class, args);
	}

}
