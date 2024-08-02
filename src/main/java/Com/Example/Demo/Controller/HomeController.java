package Com.Example.Demo.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	
	
	
	@RequestMapping(value="/log")
	public String getData() {
		
		System.out.println();
		
		return"Check Data";
		
	}

}
