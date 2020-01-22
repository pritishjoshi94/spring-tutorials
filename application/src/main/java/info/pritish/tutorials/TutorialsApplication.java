package info.pritish.tutorials;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "info.pritish")
public class TutorialsApplication {

	public static void main(String[] args) {
		SpringApplication.run(TutorialsApplication.class, args);
	}

}
