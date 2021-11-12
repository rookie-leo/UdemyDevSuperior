package programacaoFuncional.funcao.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import programacaoFuncional.entities.Product;
import programacaoFuncional.funcao.util.ProductSumService;
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

			ProductSumService pss = new ProductSumService();

			double sum = pss.filterSum(list, p -> p.getName().charAt(0) == 'T');

			System.out.printf("Sum= %.2f", sum);

			sum = pss.filterSum(list, p -> p.getPrice() <= 100);

			System.out.printf("\nSum= %.2f", sum);

		} catch (IOException e) {
			System.out.printf("Erro: %s", e.getMessage());
		}
	}
}
