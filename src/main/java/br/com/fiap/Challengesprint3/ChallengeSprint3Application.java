package br.com.fiap.Challengesprint3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class ChallengeSprint3Application {

	public static void main(String[] args) {
		SpringApplication.run(ChallengeSprint3Application.class, args);
	}

	@RestController
	class DemoController {
		@GetMapping("/")
		public String get() {
			return "esta funcionando";
		}
	}
}
