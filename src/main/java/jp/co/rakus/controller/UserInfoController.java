package jp.co.rakus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.rakus.domain.User;

/**
 * フォームで入力した名前、住所、年齢を表示させるコントローラー.
 * @author risa.okumura
 *
 */
@Controller
@RequestMapping("/userInfo")
public class UserInfoController {
	
	/**
	 * 入力画面を表示.
	 * @return 入力画面
	 */
	@RequestMapping("/toInput")
	public String toInput() {
		return "inputuserinfo";
	}
	
	/**
	 * 出力画面を表示.
	 * @param name 名前
	 * @param age　年営
	 * @param address　住所
	 * @param model　モデル
	 * @return　出力画面
	 */
	@RequestMapping("/inputuserinfo")
	public String inputuserinfo(String name,String age,String address,Model model) {
		User user = new User();
		
		user.setName(name);
		user.setAge(age);
		user.setAddress(address);
		
		model.addAttribute("user", user);
		
		return "outputuserinfo";
	}
	

}
