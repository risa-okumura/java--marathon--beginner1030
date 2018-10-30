package jp.co.rakus.domain;

/**
 * ユーザ情報を表すドメイン.
 * 
 * @author OkumuraRisa
 *
 */
public class User {
	/** 名前 */
	private String name;
	/** 年齢 */
	private String age;
	/** 住所 */
	private String address;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	

}
