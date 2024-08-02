package Com.Example.Demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//@SpringBootApplication
@SpringBootConfiguration
@EnableAutoConfiguration
@ComponentScan
public class SpringActuatorDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringActuatorDemoApplication.class, args);
		
		System.out.println("Check Application Actuator");
		
		
		
		
	}

}
