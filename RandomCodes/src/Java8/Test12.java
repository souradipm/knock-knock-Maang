package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test12 {

	public Set<Integer> solve() {

		int arr[] = new int[] { 1, 22, 13, 45, 5, 18, 22, 5 };

		List<Integer> list = Arrays.asList(1, 22, 13, 45, 5, 18, 22, 5);

		Set<Integer> duplicate = list.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(fq -> fq.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toSet());

		return duplicate;

	}

	public void average() {

		int arr[] = new int[] { 1, 22, 13, 45, 5, 18, 22, 5 };
		List<Integer> list = Arrays.asList(1, 22, 13, 45, 5, 18, 22, 5);
		
		OptionalDouble value = list.stream().mapToInt(n -> n).average();
		
		System.out.println(value);

		

	}
	
	public void prime() {

		int arr[] = new int[] { 1, 22, 13, 45, 5, 18, 22, 5 };
		List<Integer> list = Arrays.asList(1, 22, 13, 45, 5, 18, 22, 5);
		
		List<Integer> primeNum = list.stream()
				.filter(Test12::getPrime)
				.collect(Collectors.toList());
		
		for(int i : primeNum) {
			System.out.print(i+" ");
		}

		

	}
	
	
	static boolean getPrime(int num) {
		
		if(num==1 || num == 2) {
			return true;
		}
		
		for(int i=3;i<num/2;i++) {
			
			if(num%i==0) {
				return false;
			}
			
		}
		
		return true;
		
		
	}
	
	public void mergeList() {

		int arr[] = new int[] { 1, 22, 13, 45, 5, 18, 22, 5 };
		List<Integer> list1 = Arrays.asList(1, 22, 13, 45, 5, 18, 22, 5);
		List<Integer> list2 = Arrays.asList(2, 22, 14, 46, 7, 45, 24, 8);
		
		List<Integer> mergedList = Stream.concat(list1.stream(), list2.stream())
				.collect(Collectors.toList());
		
		List<Integer> mergedListss = Stream.of(list1,list2)
				.flatMap(List::stream)
				.collect(Collectors.toList());
		
		
		
		for(int i : mergedListss) {
			System.out.print(i+" ");
		}


		

	}
	
	public void commonElements() {

		int arr[] = new int[] { 1, 22, 13, 45, 5, 18, 22, 5 };
		List<Integer> list1 = Arrays.asList(1, 22, 13, 45, 5, 18, 22, 5);
		List<Integer> list2 = Arrays.asList(2, 22, 14, 46, 7, 45, 24, 8);
		
		List<Integer> common = list1.stream()
				.filter(list2::contains)
				.collect(Collectors.toList());

		for(int i : common) {
			System.out.println(i+" ");
		}
		

	}
	
	public void test() {
		
		List<Employee> employees = Arrays.asList(
	            new Employee(1, "Alice", 3),
	            new Employee(2, "Bob", 3),
	            new Employee(3, "Charlie", 3),  // Charlie is his own manager
	            new Employee(4, "David", 5),
	            new Employee(5, "Eve", 5),      // Eve is her own manager
	            new Employee(6, "Frank", 5)
	        );
		
		Map<Integer, List<Employee>> managerToEmployees = employees.stream()
                .collect(Collectors.groupingBy(emp -> emp.managerId));
		
		System.out.println(managerToEmployees);
		
		List<String> list1 = Arrays.asList("Souradip","Tania","Tukai", "Tutai", "Rumni");
		
		Map<Integer,List<String>> map = list1.stream()
				.collect(Collectors.groupingBy(e -> e.length()));
		
		Map<Integer,Map<Character,List<String>>> map1 = list1.stream()
				.collect(Collectors.groupingBy(e->e.length(),
						Collectors.groupingBy(name -> name.charAt(0))));
		
		
		Map<Integer,Map<Character,List<String>>> map2 = list1.stream()
				.collect(Collectors.groupingBy(e->e.length(),Collectors.groupingBy(e->e.charAt(0))));
		
		
		
		System.out.println(map1);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test12 t = new Test12();
//		System.out.println(t.solve());
//		t.average();
//		t.prime();
//		t.mergeList();
//		t.commonElements();
		t.test();

	}

}
