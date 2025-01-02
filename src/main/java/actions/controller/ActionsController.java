package actions.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActionsController {
	
	@GetMapping(value = "/api/actions")
	public String actionsTest() {
		return "app-with-actions version:0.0.1 - 2025-01-02-14-24";
	}

	@GetMapping(value = "/api/actions-2")
	public String actionsTest2() {
		return "app-with-actions version:0.0.2 - 2025-01-02-14-41";
	}
	
}
