class Study{
	String Name;
	String Course;
	String Subject;
	String Grade;
	static String College = "pragnya";
	void setName(String N) {
		this.Name = N;
	}
	void setCourse(String S) {
		this.Course = S;
	}
	void setSubject(String Sub) {
		this.Subject = Sub;
	}
	void setGrade(String G) {
		this.Grade = G;
	}
	String getName() {
		return this.Name;
	}
	String getCourse() {
		return this.Course;
	}
	String getSubject() {
		return this.Subject;
	}
	String getGrade() {
		return this.Grade;
	}@Override
	public String toString() {
		
		return "Name " + this.Name + " Course " + this.Course +" Subject " 
		+ this.Subject + " Grade " + this.Grade;
	}
	
	
}



public class Student {
	public static void main(String[] args) {
		Study s1 = new Study();
		s1.setName("raj");
		s1.setCourse("BSc");
		s1.setSubject("Cs");
		s1.setGrade("A");
		
		System.out.println();
		
		System.out.println(s1);
		
	}

}
