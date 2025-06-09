package Java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//class MyComparator implements Comparator<Integer>{
//
//	@Override
//	public int compare(Integer o1, Integer o2) {
//		// TODO Auto-generated method stub
//		
//		if(o1<o2) {
//			return -1;
//		}else if (o1>o2) {
//			return 1;
//		}else {
//			return 0;
//		}
//	}
//	
//}

public class ComparatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(51);
		list.add(11);
		list.add(31);
		list.add(100);
		
		System.out.println(list);
		
		Collections.sort(list,(o1,o2)->(o1<o2)?-1:((o1>o2)?1:0));
		
		System.out.println(list);

		List<String> listStr = new ArrayList<>();
		listStr.add("Souradip");
		listStr.add("Tukai");
		listStr.add("Tutai");
		listStr.add("Rumni");
		listStr.add("Gogol");
		
		System.out.println(listStr);
		
		Collections.sort(listStr,Comparator.reverseOrder());
		System.out.println(listStr);
		Collections.sort(listStr);
		System.out.println(listStr);
	}

}
