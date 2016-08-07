package market.models;

import java.util.Date;

public class Product {
	
	private int id;
	private String name;
	private String brand;
	private Double price;
	private Date date;
	private int mk_id;
	
	public Product() {
		
	}
	
	public Product(String name, String brand, Double price, Date date, int mk_id) {
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.date = date;
		this.mk_id = mk_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getMk_id() {
		return mk_id;
	}

	public void setMk_id(int mk_id) {
		this.mk_id = mk_id;
	}
	
	@Override
	public String toString() {
		return id + " " + name + " " + brand + " " + price + " " + date + " " + mk_id;
	}

}
