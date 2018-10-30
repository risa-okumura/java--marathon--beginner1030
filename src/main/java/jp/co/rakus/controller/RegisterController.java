package jp.co.rakus.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 商品の合計を表示するコントローラー
 * 
 * @author risa.okumura
 *
 */
@Controller
@RequestMapping("/register")
public class RegisterController {
	
	@Autowired
	HttpServletRequest application;
	
	/**
	 * 商品金額の入力画面を表示する.
	 * 
	 * @return 入力画面
	 */
	@RequestMapping("/toBuygoods")
	public String toBuygoods() {
		return "buygoods";
	}
	
	/**
	 * 合計金額を税抜き、税込み価格で表示する.
	 * 
	 * @param goods1　商品1
	 * @param goods2　商品2
	 * @param goods3　商品3
	 * @return　税抜き、税込み価格の出力画面
	 */
	@RequestMapping("/buygoods")
	public String buygoods(String goods1,String goods2,String goods3) {
		int price1 = Integer.parseInt(goods1);
		int price2 = Integer.parseInt(goods2);
		int price3 = Integer.parseInt(goods3);
		
		int total = price1 + price2 + price3;
		int totalTax = (int) ((price1 + price2 + price3)*1.08);
		
		;
		application.setAttribute("total",String.format("%,d", total));
		application.setAttribute("totalTax",String.format("%,d", totalTax));
		
		return "totalprice";
	}

}
