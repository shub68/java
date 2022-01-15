package Abstraction;

public abstract class calculator {
	
	 public void calName() {
		System.out.println("Hi");
	}
	
	abstract public int add(int a,int b) ;
		
	
	
	abstract public void sub();
	
	public void display() {
		System.out.println("Hi from abstract class");
	}
	public calculator() {
		System.out.println("Hi i am constructor");
	}

			

}
