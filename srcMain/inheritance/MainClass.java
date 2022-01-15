package inheritance;

public class MainClass {
	public static void main(String arg[]) {
		SonMulti obj1=new SonMulti();
		
		System.out.println("\nGrand parent age is="+obj1.g_age);
		obj1.gage();
		System.out.println("Grand parent are="+obj1.Work);
		GrandParentMulti.fund();
		
		System.out.println("\nParent age is="+obj1.p_age);
		obj1.page();
		System.out.println("Parent Company Name="+ParentMulti.Company);
		
		System.out.println("\nSon age is="+obj1.s_age);
		obj1.sage();
		System.out.println("Son school name is="+SonMulti.school);
		
	}

}
