package home.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class broController {
	//@ResponseBody
	@RequestMapping("/cricketBat")
	public String cticketBat() {
		return "bro";
	}
}
