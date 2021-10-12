package home.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/mom")
public class momControoler {
	@ResponseBody
	@RequestMapping("/suger")
	public String giveSuger() {
		return "Suger....";
	}
	
	@ResponseBody
	@RequestMapping("/milk")
	public String giveMilk() {
		return "Milk....";
	}
}
