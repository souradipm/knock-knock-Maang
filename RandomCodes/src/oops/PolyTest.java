package oops;

class Parent{
	
	public String result(int a, int b) {
		return "Parent";
	}
	
}
class First extends Parent{

	public String result(int a, int b) {
		return "First";
	}

}

class Second extends Parent{

	public String result(int a, int b) {
		return "Second";
	}

}

public class PolyTest {

	public static void main(String[] args) {
		
		Parent p = new Parent();
		System.out.println(p.result(1, 2));
		
		Parent q = new First();
		System.out.println(q.result(1, 2));
		
		Parent r = new Second();
		System.out.println(r.result(1, 2));
		

	}

}
