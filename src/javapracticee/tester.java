package javapracticee;

public class tester {
	public void one(){
		System.out.println("This is a public method");
	}
	private void two(){
		System.out.println("This is a private method");
	}
	protected void three(){
		System.out.println("This is a protected method");
	}		
public static void main (String[] args) {
	tester abc = new tester();
	abc.one();
	abc.two();
	abc.three();	
}

}
