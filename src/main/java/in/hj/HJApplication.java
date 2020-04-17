package in.hj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAutoConfiguration
@SpringBootApplication
public class HJApplication {

	public static void main(String[] args) {
		SpringApplication.run(HJApplication.class, args);
	}

}
