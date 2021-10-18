package generics.delimitados.calculation.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import generics.delimitados.calculation.entities.Product;
import generics.delimitados.calculation.service.CalculationService;

public class Program {

	public static void main(String[] args) {
		
		List<Product> products = new ArrayList<Product>();
		
		String path = "C:\\Projetos\\in.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");//Arquivo formato csv
				products.add(new Product(fields[0], Double.parseDouble(fields[1])));
				line = br.readLine();
			} 
			
			Product product = CalculationService.max(products);
			System.out.println("Most expensive product: ");
			System.out.println(product);
			
		} catch (IOException ex) {
			System.out.println("Error: "  + ex.getMessage());
		}
		
	}
	
}
