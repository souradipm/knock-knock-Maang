package other;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class FIndHighestMarks {

	public String getName(Map<String, Integer> map) {

		int marks = Collections.max(map.values());

		for (Map.Entry<String, Integer> entry : map.entrySet()) {

			if (entry.getValue() == marks) {
				return entry.getKey();
			}

		}

		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FIndHighestMarks f = new FIndHighestMarks();
		Map<String, Integer> map = new HashMap<>();
		map.put("Souradip", 90);
		map.put("Anad", 80);
		map.put("Tukai", 88);
		map.put("Tutai", 98);
		map.put("Tania", 99);

		System.out.println(f.getName(map));
	}

}
