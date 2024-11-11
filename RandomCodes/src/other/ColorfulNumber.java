package other;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ColorfulNumber {

	public int colorful(int A) {

		// 236
		List<Integer> list = new ArrayList<>();

		int num = A;
		while (num > 0) {
			int digit = num % 10;
			list.add(digit);
			num = num / 10;
		}

		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < list.size(); i++) {

			int prod = 1;

			for (int j = i; j < list.size(); j++) {

				prod *= list.get(j);
				if (set.contains(prod)) {
					return 0;
				} else {
					set.add(prod);
				}

			}

		}

		return 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ColorfulNumber c = new ColorfulNumber();
		System.out.println(c.colorful(23));

	}

}
