package programacaoFuncional.funcao.util;

import java.util.List;

import programacaoFuncional.entities.Product;

public class ProductSumService {
	
	public double filterSum(List<Product> list) {
		double sum = 0.0;
		
		for (Product p : list) {
			if (p.getName().charAt(0) == 'T') {
				sum += p.getPrice();
			}
		}
		
		return sum;
	}

}
