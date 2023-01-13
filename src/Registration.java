
public class Registration{

public static void main(String args[]) { 
		Vehicle v1= new Vehicle();
		
		v1.setModel("Toyota");
		v1.setYear(2016);
		v1.setSeating(5);
		
		System.out.println(v1.getModel());
		System.out.println(v1.getYear());
		System.out.println(v1.getSeating());
	}
}