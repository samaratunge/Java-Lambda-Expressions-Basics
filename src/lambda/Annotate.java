package lambda;
interface ITestable1{
	
	public default void readAnnotations(){
		System.out.println("Read Annotations");
	}
}

interface ITestable2{
	
	public default void readAnnotations(){
		System.out.println("Read Annotations");
	}
}

public class Annotate implements ITestable1, ITestable2{

	public static void main(String[] args) {
		Annotate diff = new Annotate();
		diff.readAnnotations();
	}

	@Override
	public void readAnnotations() {
		ITestable1.super.readAnnotations();
		ITestable2.super.readAnnotations();
	}
}

