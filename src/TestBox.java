
public class TestBox {
	public static void main(String args[]) {
		
		Box b1 = new Box();
		b1.setLength(10);
		b1.setBreadth(20);
		b1.setHeight(30);
		
		System.out.println(b1.getLength());
		System.out.println(b1.getBreadth());
		System.out.println(b1.getHeight());
		System.out.println(b1);
		
		b1.calculateArea();
		
	}
	
}