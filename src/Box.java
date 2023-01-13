import java.util.Scanner;

public class Box {
	
	private int length;
	private int  breadth;
	private int height;
	
	public Box() {
		
	}
	 
	
	
	public int getLength() {
		return length;
	}



	public void setLength(int length) {
		this.length = length;
	}



	public int getBreadth() {
		return breadth;
	}



	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}



	public int getHeight() {
		return height;
	}



	public void setHeight(int height) {
		this.height = height;
	}



	public  Box(int l,int b,int h) {
		this.length = l;
		this.breadth = b;
		this.height = h;
		
	}
	
	void calculateArea() {
		int A = this.length * this.breadth * this.height ;
		System.out.println(A);
	}
	@Override
	public String toString() {

		return "length " + this.length + " breadth " + this.breadth + " height " + this.height;
	}

	

}
 
