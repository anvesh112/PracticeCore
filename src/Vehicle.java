
public class Vehicle {
	String model;
	int year;
	int seating;
	
	public void setModel(String m) {
		this.model = m ;
	}
	public void setYear(int y) {
		this.year = y ;
	}
	public void setSeating(int s) {
		this.seating = s ;
	}
	public String getModel() {
		return this.model ;
	}
	public int getYear() {
		return this.year;
	}
	public int getSeating() {
		return this.seating;
	}
	@Override
	public String toString() {
		System.out.println(this.model);

		return "Model" + this.model + " Year " + this.year + " Seating " +this.seating;
	}
}
	

	
	
