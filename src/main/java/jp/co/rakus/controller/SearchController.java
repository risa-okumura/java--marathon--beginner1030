package jp.co.rakus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.rakus.domain.User;
import jp.co.rakus.repository.UserDao;

/**
 * ID（主キー）検索を表示するコントローラー.
 * 
 * @author risa.okumura
 *
 */
@Controller
@RequestMapping("/search")
@Transactional
public class SearchController {
	
	@Autowired
	private UserDao dao;
	
	/**
	 * ID入力画面を表示する.
	 * 
	 * @return 入力画面
	 */
	@RequestMapping("/toUserinfosearch")
	public String toUserinfosearch() {
		return "userinfosearch";
	}
	
	/**
	 * 入力されたIDを元にリポジトリのloadメソッドから結果を表示する.
	 * 
	 * @param model リクエストスコープに対応するmodel
	 * @param id　id
	 * @return 検索結果画面
	 */
	@RequestMapping("/execute")
	public String execute(Model model,String id) {
		User user = dao.load(Integer.parseInt(id));
		model.addAttribute("user", user);
		return "userinfoview";
	}

}
