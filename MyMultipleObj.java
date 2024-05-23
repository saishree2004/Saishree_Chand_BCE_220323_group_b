package basics;

public class MyMultipleObj {
	int x = 100;

	public static void main(String[] args) {
		MyMultipleObj obj1 = new MyMultipleObj();
		MyMultipleObj obj2 = new MyMultipleObj();

		obj2.x = 111;

		System.out.println(obj1.x + "\n" + obj2.x);

	}

}
