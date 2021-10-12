package home.com.myCafeControllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyCoffeeController {
	//@ResponseBody
	@RequestMapping("/coffee")
	public String getCafe(Model model) {
		String myName = "Mohmmad";
		model.addAttribute("myName", myName);
		model.addAttribute("title", "Mom's coffee");
		return "welcome-page";
	}
	@RequestMapping("/proOrder")
	public String order(HttpServletRequest request, Model model) {
		
		String food = request.getParameter("food");
		
		model.addAttribute("food", food);
		
		return "proOrder";
	}

}
