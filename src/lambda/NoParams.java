package lambda;

interface ICommunicable{
	
	void sayHello();
}

public class NoParams {

	public static void main(String[] args) {
		
		//Java Lambda Expression with no Parameters 
		ICommunicable iCommunicable = () -> System.out.println("Hello Udara !!!");
		iCommunicable.sayHello();
	}

}
