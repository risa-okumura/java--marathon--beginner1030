package jp.co.rakus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 名前を表示させるコントローラー.
 * @author risa.okumura
 */
@Controller
@RequestMapping("/nameReceive")
public class NameReceiveController {
	
	
	/**
	 * 入力画面を表示.
	 * @return 名前登録
	 */
	@RequestMapping("/toInput")
	public String toInput() {
		return "inputname";
	}
	
	/**
	 * 名前を表示.
	 * @param name 名前
	 * @param model モデル
	 * @return　出力画面
	 */
	@RequestMapping("/input")
	public String input(String name,Model model) {
		model.addAttribute("name",name);
		return "outputname";
	}
	
	

}
