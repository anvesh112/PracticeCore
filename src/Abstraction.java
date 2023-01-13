abstract class A{
	public abstract void animalSound();
	void animalType() {
		System.out.println("class A");
	}
}
class B extends A{
	public void animalSound() {
		System.out.println("class B");
	}
	
}

public class Abstraction {

	public static void main(String[] args) {
		
		B abc=new B();
		abc.animalSound();
		abc.animalType();
		

	}

}
