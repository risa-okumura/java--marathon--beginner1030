package jp.co.rakus.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 計算関連のコントローラー
 * @author risa.okumura
 *
 */
@Controller
@RequestMapping("/calc")
public class CalcController {
	
	@Autowired
	private HttpSession session;
	
	/**
	 * 入力画面を表示.
	 * @return 数字入力
	 * 
	 */
	@RequestMapping("/toInput")
	public String toInput() {
		return "inputvalue";
	}
	
	/**
	 * 入力した数字および計算結果を表示.
	 * @param session セッションスコープに対応したmodel
	 * @param num1　入力された数字１
	 * @param num2　入力された数字2
	 * @return　表示画面
	 */
	@RequestMapping("/inputvalue")
	public String inputvalue(HttpSession session,String num1, String num2) {
		int number1 = Integer.parseInt(num1);
		int number2 = Integer.parseInt(num2);
		int answer = number1 * number2;
		
		session.setAttribute("number1", number1);
		session.setAttribute("number2", number2);
		session.setAttribute("answer", answer);
		
		return "outputvalue";
	}
	
	@RequestMapping("/outputvalue")
	public String outputvalue() {
		return "outputvalue2";
	}

}
