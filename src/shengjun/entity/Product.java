package shengjun.entity;

public class Product {
	private String  id;
	private String proname;
	private String protype;
	private double price;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getProname() {
		return proname;
	}
	public void setProname(String proname) {
		this.proname = proname;
	}
	public String getProtype() {
		return protype;
	}
	public void setProtype(String protype) {
		this.protype = protype;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Product(String id, String proname, String protype, double price) {
		super();
		this.id = id;
		this.proname = proname;
		this.protype = protype;
		this.price = price;
	}
	

	
}
