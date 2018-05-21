package vn.dl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
@EnableWebMvc
public class SpringBootRestfulApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestfulApplication.class, args);
	}
}
