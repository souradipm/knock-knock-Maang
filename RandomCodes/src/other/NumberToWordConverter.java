package other;

public class NumberToWordConverter {

	private static final String[] units = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
			"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen",
			"Nineteen" };
	private static final String[] tens = { "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty",
			"Ninety" };

	public String convertNum(int num) {

		return convert(num) + " only.";

	}

	public String convert(int num) {

		if (num == 0) {
			return "Zero";
		}

		String words = "";

		if (num / 1000000000 > 0) {
			words += convert(num / 1000000000) + " billion";
			num = num % 1000000000;
		}
		if (num / 1000000 > 0) {
			words += convert(num / 1000000) + " million";
			num = num % 1000000;
		}
		if (num / 1000 > 0) {
			words += convert(num / 1000) + " thousand";
			num = num % 1000;
		}
		if (num / 100 > 0) {
			words += convert(num / 100) + " hundred";
			num = num % 100;
		}
		if (num > 0) {

			if (!words.isEmpty()) {
				words += " and ";
			}
			if (num < 20) {
				words += units[num];
			} else {

				words += tens[num / 10];
				if (num % 10 > 0) {
					words += " " + units[num % 10];
				}

			}

		}

		return words.trim();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NumberToWordConverter n = new NumberToWordConverter();
		System.out.println(n.convertNum(1109));

	}

}
