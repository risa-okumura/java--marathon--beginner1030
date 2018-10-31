package jp.co.rakus.controller;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.ServletContext;
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
	private ServletContext application;
	
	@Autowired
	private HttpSession session;
	
	/**
	 * 最初に呼ばれる.
	 * 
	 * @return
	 */
	@RequestMapping("/startApp")
	public String startApp(Model model) {
		
		Item item1 = new Item("手帳ノート","1000");
		Item item2 = new Item("文房具セット","1500");
		Item item3 = new Item("ファイル","2000");
		
		List<Item> itemList = new ArrayList<>();
		itemList.add(item1);
		itemList.add(item2);
		itemList.add(item3);
		application.setAttribute("itemList", itemList);
		
		List<Item> itemList2 = new LinkedList<>();
		session.setAttribute("itemList2", itemList2);
		int total = 0;
		model.addAttribute("total", total);
		
		return "itemAndCart";
		
	}
	
	/**
	 * 毎回「商品一覧＆ショッピングカート一覧画面」を表示する.
	 * 
	 * @param model
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@RequestMapping("/viewCart")
	public String viewCart(Model model) {

		List<Item> itemViewList = (List<Item>) session.getAttribute("itemList2");
		int total = 0;
		for(Item item : itemViewList) {
			total += Integer.parseInt(item.getPrice());
		}
		
		model.addAttribute("total", total);

		return "itemAndCart";
	}
	
	/**
	 * ショッピングカートに商品を追加する.
	 * 
	 * @param index
	 * @return 「商品一覧＆ショッピングカート一覧画面」を表示するメソッド
	 */
	@SuppressWarnings("unchecked")
	@RequestMapping("/insert")
	public String insert(String index) {
		List<Item> itemList = (List<Item>) application.getAttribute("itemList");
		List<Item> itemList2 = (List<Item>) session.getAttribute("itemList2");
		itemList2.add(itemList.get(Integer.parseInt(index))); 
		
		return "redirect:/item/viewCart";
	}
	
	@SuppressWarnings("unchecked")
	@RequestMapping("/delete")
	public String delete(String index) {
		
		List<Item> itemList2 = (List<Item>) session.getAttribute("itemList2");
		itemList2.remove(Integer.parseInt(index));
		
		return "redirect:/item/viewCart";
	}

}
