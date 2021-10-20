package programacaoFuncional.predicate.application;

import java.util.ArrayList;
import java.util.List;

import programacaoFuncional.entities.Product;
import programacaoFuncional.predicate.util.ProductPredicate;

public class Program {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<Product>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Mouse", 79.85));
		list.add(new Product("Teclado simples", 99.99));
		list.add(new Product("NoteBook", 1200.00));
		list.add(new Product("Tablet", 450.00));
		list.add(new Product("HD Case", 80.50));
		
//		list.removeIf(p -> p.getPrice() >= 100);
		list.removeIf(new ProductPredicate());
		
		for (Product product : list) {
			System.out.println(product);
		}
		
	}
	
}
