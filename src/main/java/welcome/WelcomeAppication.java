package welcome;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication(scanBasePackages= {"service.*"})

public class WelcomeAppication {

	public static void main(String[] args) {
		SpringApplication.run(WelcomeAppication.class,args);
	}

}
