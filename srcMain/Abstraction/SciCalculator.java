package Abstraction;

public class SciCalculator extends calculator {

	public void calName() {
		
	}


	public int add(int a,int b) {
		System.out.println("add From child class sci");
		return b;
	}

	
	public void sub() {
		
		System.out.println("sub From child class sci");
	}

}
