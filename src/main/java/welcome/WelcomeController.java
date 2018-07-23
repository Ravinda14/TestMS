package welcome;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import service.WelcomeService;

@RestController
@RequestMapping("/Welcome")
public class WelcomeController {

	@Autowired
	WelcomeService welService;
	
	@RequestMapping("/msg")
	public String getMessage() {
		welService.getMessage();
		return "Welcome Message";
	}
}
