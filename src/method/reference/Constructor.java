package method.reference;

@FunctionalInterface 
interface IFoodService{  
    void display();  
}  

class Food{  
    public Food(){  
        System.out.print("Food Constructor");  
    }  
} 

public class Constructor {

	public static void main(String[] args) {
		//Method reference to a constructor
        IFoodService iFoodService = Food::new;  
        iFoodService.display();  
	}
}
