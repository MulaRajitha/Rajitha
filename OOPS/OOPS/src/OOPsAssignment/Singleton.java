package OOPsAssignment;
class SingletonCheck{
	//static variable reference of single_instance of type Singleton
  private static SingletonCheck single_instance = null;
	//Make constructor private

	private SingletonCheck(){
		
	}

	// static method to create instance of Singleton class

	public static SingletonCheck getInstance() {

	if (single_instance == null)

	{

	single_instance = new SingletonCheck();

	}

	return single_instance;

	}

} 

	public class Singleton {

	public static void main(String[] args) {

	SingletonCheck second_instance = SingletonCheck.getInstance();

	System.out.println(second_instance);

	}
}