
class Animal1 {
	 public void animalSound() {
		 System.out.println("animal makes sound");
	 }
	
}
class Pig extends Animal1{
	public void animalSound() {
		 System.out.println("pig makes sound");
	
	
}
}

class Polymorphism {
	public static void main(String[] args) {
		
		Animal1 myAnimal = new Animal1();
		Animal1 myPig = new Pig();
		myAnimal.animalSound();
		myPig.animalSound();
		
	}
}
