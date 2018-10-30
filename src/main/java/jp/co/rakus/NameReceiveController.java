package jp.co.rakus;

import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/nameReceive")
public class NameReceiveController {
	
	@RequestMapping("/toInput")
	public String toInput() {
		return "inputname";
	}
	
	public String input(String name) {
		return "outputname";
	}
	
	

}
