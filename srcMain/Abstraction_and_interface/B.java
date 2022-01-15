package Abstraction_and_interface;

abstract public class B extends A{
	
	public abstract void B_add();
	public abstract void B_sub();
	public void  display() {
		super.display();
		System.out.println("Hi from B class which is abstract");
	}
	

}
