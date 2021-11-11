package programacaoFuncional.consumer.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import programacaoFuncional.consumer.util.PriceUpdate;
import programacaoFuncional.entities.Product;

public class Program {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<Product>();

		String path = "C:\\Projetos\\produto.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				list.add(new Product(fields[0], Double.parseDouble(fields[1])));
				line = br.readLine();
			}

			list.forEach(Product::staticPriceUpdate);

			list.forEach(System.out::println);

		} catch (IOException e) {
			System.out.printf("Erro: %s", e.getMessage());
		}
	}
}
