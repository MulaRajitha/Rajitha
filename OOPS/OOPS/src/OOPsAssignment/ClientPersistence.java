package OOPsAssignment;

abstract class Persistence{
    abstract public String persist();
}
class FilePersistence extends Persistence{
    @Override
    public String persist() {
        return "File persistence class is called";
    }
}
class DatabasePersistence extends Persistence{
    @Override
    public String persist() {
        return "Database persistence class is called";
    }
}
public class ClientPersistence {
    public static void main(String[] args) {
      /*  Persistence persistence = new FilePersistence();
        System.out.println(persistence.persist());*/
        Persistence persistence = new DatabasePersistence();
        System.out.println(persistence.persist());
    }

}












/*

public class Persistance {
	public void main(String args[])
	{	
	}
}
abstract class persistance1{
	void persist() {
		System.out.println("This is persistance");
	}
}
class Filepersistance{
	void persist() {
		System.out.println("This is file persistance");
	}
}
 class Datapersistance{
	void persist() {
		System.out.println("This is Database persistance");
	}
}*/

