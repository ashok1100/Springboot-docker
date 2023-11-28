package in.ashokit.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	private Logger logger = LoggerFactory.getLogger(WelcomeController.class);

	public WelcomeController() {
		logger.info("***** WelcomeRestController::Constructor *****");
	}

	@GetMapping
	public String welcomeMsg() {
		logger.info("***** welcomeMsg() execution start *****");
		String msg = "Welcome to Ashok's beautiful world..";
		logger.info("***** welcomeMsg() execution end *****");
		return msg;
	}
}
