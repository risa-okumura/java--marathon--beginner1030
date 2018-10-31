package jp.co.rakus.controller;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.rakus.domain.Item;

/**
 * ショッピングカートを表すクラス.
 * 
 * @author risa.okumura
 *
 */
@Controller
@RequestMapping("/item")
public class ItemController {
	
	@Autowired
	HttpServletRequest application;
	
	@Autowired
	HttpSession session;
	
	/**
	 * 最初に呼ばれる.
	 * 
	 * @return
	 */
	@RequestMapping("/startApp")
	public String startApp() {
		
		Item item1 = new Item("手帳ノート","1000");
		Item item2 = new Item("文房具セット","1500");
		Item item3 = new Item("ファイル","2000");
		
		List<Item> itemList = new ArrayList<>();
		itemList.add(1, item1);
		itemList.add(2, item2);
		itemList.add(3, item3);
		application.setAttribute("itemList", itemList);
		
		List<Item> itemList2 = new LinkedList<>();
		session.setAttribute("itemList2", itemList2);
		int total = 0;
		
		return "itemAndCart";
		
	}
	
	/**
	 * 毎回「商品一覧＆ショッピングカート一覧画面」を表示する.
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping("/viewCart")
	public String viewCart(Model model) {

		List<Item> itemVewList = ;
		for(Item item : )
		
		return "itemAndCart";
	}
	
	/**
	 * ショッピングカートに商品を追加する.
	 * 
	 * @param index
	 * @return 「商品一覧＆ショッピングカート一覧画面」を表示するメソッド
	 */
	@RequestMapping("/insert")
	public String insert(String index) {
		
		List<Item> itemInsertList = new LinkedList<>();
		Item item = new Item();
		
		
		return "/item/viewCart";
	}

}
