package generics.coringa.delimitado.application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program2 {

	public static void main(String[] args) {

		List<Integer> ints = Arrays.asList(1, 2, 3, 4);
		List<Double> doubles = Arrays.asList(3.14, 6.28);
		List<Object> objts = new ArrayList<Object>();

		copy(ints, objts);
		print(objts);
		
		copy(doubles, objts);
		print(objts);
		
	}

	public static void copy(List<? extends Number> source, List<? super Number> destiny) {
		for (Number num : source) {
			destiny.add(num);
		}
	}
	
	public static void print(List<?> list) {
		for (Object obj : list) {
			System.out.print(obj + " ");
		}
		System.out.println();
	}

}
