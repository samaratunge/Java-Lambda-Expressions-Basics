package method.reference;

interface IReference {
	void display();
}

public class First {

	public void myMethod() {
		System.out.println("Instance Method");
	}

	public static void main(String[] args) {
		
		First first = new First();
		IReference iReference = first::myMethod;
		iReference.display();
	}
}
