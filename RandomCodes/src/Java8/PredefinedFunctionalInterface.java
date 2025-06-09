package Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class PredefinedFunctionalInterface {

	public void predicateTest() {

		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(11);
		list.add(13);
		list.add(10);
		list.add(15);

		Predicate<Integer> p = i -> i % 5 == 0;

		for (int i : list) {
			if (p.test(i)) {
				System.out.println(i);
			}
		}

		Predicate<Integer> p1 = (n) -> {

			if (n == 1 || n == 2) {
				return true;
			}

			for (int i = 3; i < n; i++) {
				if (n % i == 0) {
					return false;
				}
			}

			return true;

		};

		for (int i : list) {
			if (p1.test(i)) {
				System.out.println(i);
			}
		}

	}

	public void functionTest() {

		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(11);
		list.add(13);
		list.add(10);
		list.add(15);

		Function<Integer, Integer> f = n -> n + 5;

		for (int i : list) {
			System.out.println(f.apply(i));
		}

	}
	
	public void consumerTest() {
		
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(11);
		list.add(13);
		list.add(10);
		list.add(15);
		
		Consumer<Integer> c = n->{
			
			if(n%2==0) {
				System.out.println("Even");
			}else {
				System.out.println("Odd");
			}
		};
		
		for(int i:list) {
			
			c.accept(i);
			
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PredefinedFunctionalInterface t = new PredefinedFunctionalInterface();
//		t.predicateTest();
//		t.functionTest();
		t.consumerTest();

	}

}
