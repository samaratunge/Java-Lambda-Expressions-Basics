package lambda;

@FunctionalInterface
interface IGreetService{
	
	void sayGoodMorning();
	
    default void sayGoodAfterNoon(){
		System.out.println("Hi Udara, Good After Noon !!!");
	}
	
	static void sayGoodEvening(){
		System.out.println("Hi Udara, Good Evening !!!");
	}
}

public class Anonymous {

	public static void main(String[] args) {
		
		IGreetService greetService = () -> System.out.println("Hi Udara, Good morning !!!");
		greetService.sayGoodMorning();
		greetService.sayGoodAfterNoon();
		IGreetService.sayGoodEvening();
	}
}
