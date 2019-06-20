package cn.pomit.springbootwork.consulzuul.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consul")
public class HealthWeb {

	@RequestMapping(value = "health", method = { RequestMethod.GET })
	public String health() {
		return "check health";
	}
	
}
