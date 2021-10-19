package generics.coringa;

import java.util.Arrays;
import java.util.List;

public class TipoCoringa {

	public static void main(String[] args) {

		List<Integer> ints = Arrays.asList(5, 2, 10);
		printList(ints);
		
		List<String> strs = Arrays.asList("Leo", "Jaque", "Maria", "Le");
		printList(strs);

	}
	
	public static void printList(List<?> list) {
		for (Object obj : list) {
			System.out.println(obj);
		}
	}

}
