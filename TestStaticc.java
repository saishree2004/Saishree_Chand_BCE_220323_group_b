package basics;

public class TestStaticc {
	public static void main(String[] args) {

		TestStaticc testObj = new TestStaticc();
		myStaticMethod();
		allFreeMethod();
		TestStaticc.myStaticMethod();
		TestStaticc.allFreeMethod();

	}

	private static void allFreeMethod() {
		System.out.println("i am another method");
	}

	private static void myStaticMethod() {
		System.out.println("I am static method");

	}

}
