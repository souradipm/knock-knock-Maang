package Java8;


interface Inf{
	public void test();
}


//class Demo implements Inf{
//	public void test() {
//		System.out.println("Hello");
//	}
//}


public class InterfaceTest {

	public static void main(String[] args) {
		Inf d = ()->System.out.println("Good");;
		d.test();
		
	}

}
