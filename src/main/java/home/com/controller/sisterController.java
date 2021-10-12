package home.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class sisterController {

	@RequestMapping("/makeup")
	public String giveMakeup() {
		return "sis";
	}
}
