
interface Inter1 {
	public void myFriend();
	
}
interface Inter2 {
	public void myFriend1();
}
class plant implements Inter1, Inter2{
	
	

	@Override
	public void myFriend() {
		System.out.println("plant 1");
		
	}

	@Override
	public void myFriend1() {
		System.out.println("plant 2");		
	}
	
}


public class Interface1 {
	public static void main(String[] args) {
		plant p1 = new plant();
		p1.myFriend();
		p1.myFriend1();
	}

}
