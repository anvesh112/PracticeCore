package com.Nexgenapps.training;

public class Fish{
	private String type;
	private int size ; 
	//int Feed ;
	
	void setType(String s) {
		this.type = s;
	}
	void setSize(int sz) {
		this.size = sz;
	}
	
	String getType() {
		return this.type;
	}
	int getSize() {
		return this.size;
	}
	@Override
	public String toString() {

		return "type " + this.type + " size " + this.size;
	}
	
	void feed(int food) {
		
		
		this.size = this.size + food;
		System.out.println(this.type + " size increased to " + this.size +" after feeding");
		
	}
}



