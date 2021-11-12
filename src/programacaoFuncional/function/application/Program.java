package programacaoFuncional.function.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import programacaoFuncional.entities.Product;
import programacaoFuncional.function.util.UpperCaseName;

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

			List<String> names = list.stream()
					.map(new UpperCaseName())
					.collect(Collectors.toList());
			
			names.forEach(System.out::println);

		} catch (IOException e) {
			System.out.printf("Erro: %s", e.getMessage());
		}
	}
}
