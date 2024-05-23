package basics;

public class student {
	String name = "zake";
	int phone = 123456789;
    String address = "kathmandu";

	public static void main(String[] args) {
		student studentObject = new student();
		String myname = studentObject.name;
		int myphone = studentObject.phone;
		String myaddress = studentObject.address;
		System.out.println("=====first output=====");
		System.out.println(myname + "\n" + myphone + "\n" + myaddress + "\n");

		System.out.println("=====second output=====");
		System.out.println(myname + myphone + myaddress + "\n");

		System.out.println("=====third output=====");
		System.out.println(myname + "\t" + myphone + "\t" + myaddress);

		studentObject.name = "jolie";
		studentObject.phone = 987654321;
		studentObject.address = "lalitpur";

		System.out.println("\nafter overriding values");
		System.out.println(studentObject.name + studentObject.phone + studentObject.address);


	}

}


