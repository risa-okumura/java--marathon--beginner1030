package jp.co.rakus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.rakus.domain.User;
import jp.co.rakus.repository.UserDao;

@Controller
@RequestMapping("/search")
public class SearchController {
	
	@Autowired
	private UserDao dao;
	
	@RequestMapping("/toUserinfosearch")
	public String toUserinfosearch() {
		return "userinfosearch";
	}
	
	@RequestMapping("/execute")
	public String execute(Model model,String id) {
		User user = dao.load(Integer.parseInt(id));
		model.addAttribute("user", user);
		return "userinfoview";
	}

}
