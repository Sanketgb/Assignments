package Spring.MVC.AssignmentQ1.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
	
	@RequestMapping("/helloWorld")
	public String helloWorld() {
		return "helloWorld";
	}
}
