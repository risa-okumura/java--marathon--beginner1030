package jp.co.rakus.domain;

/**
 * 商品を表すドメイン
 * 
 * @author risa.okumura
 *
 */
public class Item {
	
	/**　商品名	 */
	private String name;
	/**　値段 */
	private String price;
	
	public Item() {
		
	}
	
	public Item(String name,String price) {
		this.name = name;
		this.price = price;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

}
