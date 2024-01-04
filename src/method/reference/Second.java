package method.reference;

public class Second {
	
	public static void staticMethod() {
		System.out.println("Static Method display");
	}

	public static void main(String[] args) {
		
		IReference iReference = Second::staticMethod;
		iReference.display();
	}
}
