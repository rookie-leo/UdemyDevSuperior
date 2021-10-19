package programacaoFuncional.application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import programacaoFuncional.comparator.MyComparator;
import programacaoFuncional.entities.Product;

public class Program {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<Product>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("NoteBook", 1200.00));
		list.add(new Product("Tablet", 450.00));
		
		//Sintaxe de classe anonima para fazer comparacao
		Comparator<Product> comparar = new Comparator<Product>() {

			@Override
			public int compare(Product p1, Product p2) {
				return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
			}
			
		};
		
//		list.sort(new MyComparator());
		
		list.sort(comparar);
		
		for (Product product : list) {
			System.out.println(product);
		}
		
	}
	
}
