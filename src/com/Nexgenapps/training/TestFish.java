package com.Nexgenapps.training;

public class TestFish {
	public static void main(String[] args) {
		Fish f1=new Fish();
		f1.setType("salmon");
		f1.setSize(5);
		f1.feed(3);
		
		System.out.println(f1.getType());
		System.out.println(f1.getSize());
		
		
		System.out.println(f1);
		
			
	}

}

