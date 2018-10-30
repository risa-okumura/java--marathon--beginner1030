package jp.co.rakus;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/nameReceive")
public class NameReceiveController {
	
	@RequestMapping("/toInput")
	public String toInput() {
		return "inputname";
	}
	
	@RequestMapping("/input")
	public String input(String name,Model model) {
		model.addAttribute("name",name);
		return "outputname";
	}
	
	

}
