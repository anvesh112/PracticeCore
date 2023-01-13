
class Car {
	protected String Brand = "Ford";
	public void Honk() {
		System.out.println("ring ring");
	}
}

public class Inheritance extends Car {
	private String modelName = "Mustang";

	public static void main(String[] args) {
		Inheritance myCar = new Inheritance();
		myCar.Honk();
		
		System.out.println(myCar.Brand + "   " + myCar.modelName );

	}

}
