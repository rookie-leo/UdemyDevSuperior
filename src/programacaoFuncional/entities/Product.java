package programacaoFuncional.entities;

public class Product {

	private String name;
	private Double price;
	
	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	/**
	 * @method verifica se o valor enviado como argumento eh igual ou maior do que 100
	 * @param Objeto do tipo produto
	 * @return boolean true ou false  
	 * */
	public static boolean staticProductPredicate(Product p) {
		return p.getPrice() >= 100.0;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}

}
