package polymorphism;

public class methodOverriding {
	
	 private  void info() {
		System.out.println("Method no 1 From parent class");
	}
	void info2() {
		System.out.println("method no 2 from parent class");
	}

}
class overriding2 extends methodOverriding{
		public  void info() {
		
			}
	public static void main(String arg[]) {
		overriding2 obj1=new overriding2();
		obj1.info();
	
}
}

