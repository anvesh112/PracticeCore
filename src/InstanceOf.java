class Tv {
	// int Year;
	void year() {
		System.out.println("Tv mannufactured in 2000");
	}
}
class Samsung extends Tv {
	int model ;
	void model() {
		System.out.println("Model SAM- L");
	}
}
public class InstanceOf {

	public static void main(String[] args) {
		
		Tv t = new Tv();
		Samsung sam = new Samsung();
		
		if(t == (Tv) sam) {
			System.out.println("raju");
		}
		
		t.year();
		sam.model();

	}

}
