package Interface;
interface demo2{
	public static final int a = 0;
	public void setting();
	public void getting();
}
interface demo1{
	public void setter();
	public void getter();
}
interface demo extends demo1{
	public void set();
	public void get();
}
class abc implements demo,demo1{
	public void set() {
		System.out.println("Hi from first method");
	}
	public void get() {
		System.out.println("Hi from second method");
	}
	public void setter() {
		System.out.println("again1");
		
	}
	public void getter() {
		// TODO Auto-generated method stub
		System.out.println("again2");
	}	
}

