class Dog{
	int height ;
	int length ;
	int weight ;
	String breed ;
	
	
	public void setHeight( int h) {
		 this.height = h ;
	}
	public void setlength( int l) {
		 this.length = l ;
	}
	public void setWeight( int w) {
		 this.weight = w ;
	}
	public void setBreed( String b) {
		 this.breed = b ;
	}
	int getHeight() {
		return this.height;
		
	}
	int getLength() {
		return this.length;
		
	}
	int getWeight() {
		return this.weight;
		
	}
	String getBreed() {
		return this.breed;
		
	}@Override
	public String toString() {

		return "breed" + this.breed;
	}
	
}





public class Animal {
	public static void main(String[] args) {
		Dog d1 = new Dog();
		d1.setHeight(10);
		d1.setlength(6);
		d1.setWeight(10);
		d1.setBreed("pomerian");
		
		System.out.println(d1.getHeight());
		System.out.println(d1.getBreed());
		System.out.println(d1.getLength());
		System.out.println(d1.getWeight());
	}

}
