
public class Product {
	
	public Product(int id, String name, String description, double price, int stockAmount) {
		System.out.println("Yapıcı blok çalıştı");
		this.id =id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.stockAmound = stockAmound;
		
	}
	
	
	public Product() {
		
	}
	private int id;
	private String name;
	private String description;
	private double price;
	private int stockAmound;
	private String kod;
	
	
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
	
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	public int getStockAmound() {
		return stockAmound;
	}
	public void setStockAmound(int stockAmound) {
		this.stockAmound = stockAmound;
	}
	
	public String getkod() {
		return this.name.substring(0,1) + id; 
	}
	
	
	



}
