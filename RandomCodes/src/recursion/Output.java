package recursion;

public class Output {

	int bar(int x, int y) {

		if (y == 0) {
			return 0;
		} else {
			return (x + bar(x, y - 1));
		}
	}

	int foo(int x, int y) {

		if (y == 0) {
			return 1;
		} else {
			return bar(x, foo(x, y - 1));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Output o = new Output();
		System.out.println(o.foo(3,5));

	}

}
