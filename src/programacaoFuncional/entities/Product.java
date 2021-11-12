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
	 * @method atualiza o valor do produto pela porcentagem do valor especificado
	 * @param recebe como parametro um objeto do tipo produto
	 */
	public static void staticPriceUpdate(Product p) {
		p.setPrice(p.getPrice() * 1.1);
	}

	public void nonStaticPriceUpdate() {
		price = price * 1.1;
	}

	/**
	 * @method verifica se o valor enviado como argumento eh igual ou maior do que
	 *         100
	 * @param Objeto do tipo produto
	 * @return boolean true ou false
	 */
	public static boolean staticProductPredicate(Product p) {
		return p.getPrice() >= 100.0;
	}

	/**
	 * @method verifica se o valor do objeto eh igual ou maior do que 100
	 * @return boolean true ou false
	 */
	public boolean nonStaticProductPredicate() {
		return getPrice() >= 100.0;
	}

	/**
	 * @method coloca todos os caracterer do nome do produto em caixa alta
	 * @param objeto do tipo Product
	 * @return String com todos os caracteres em caixa alta
	 * */
	public static String staticUpperCaseName(Product p) {
		return p.getName().toUpperCase();
	}

	/**
	 * @method coloca todos os caracterer do nome do produto em caixa alta
	 * @return String com todos os caracteres em caixa alta
	 * */
	public String nonStaticUpperCaseName() {
		return name.toUpperCase();
	}
	
	@Override
	public String toString() {
		return String.format("Product [name= %s,  price= %.2f]", name, price);
	}

}
