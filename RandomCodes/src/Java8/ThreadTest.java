package Java8;

//class MyThread implements Runnable {
//
//	public void run() {
//
//		for (int i = 0; i < 3; i++) {
//
//			System.out.println("Child thread");
//
//		}
//
//	}
//
//}

public class ThreadTest {

	public static void main(String[] args) {

		Runnable m = ()->{
			for (int i = 0; i < 3; i++) {

				System.out.println("Child thread");

			}
			
		};
		Thread t = new Thread(m);

		t.start();
		for (int i = 0; i < 3; i++) {

			System.out.println("Main thread");

		}

	}

}
