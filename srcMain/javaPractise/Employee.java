package javaPractise;
import java.util.*;
public class Employee {
	
	int EmpID;
	String name;
	String EmailId;
	public static String Cname="COgnizant";
	
	Employee(){
		System.out.println("Default Constructor");
	}
	Employee(int id,String n,String em){
		EmpID=id;
		name=n;
		EmailId=em;
		
	}
	void get() {
		System.out.println("EID:-"+EmpID+" Name:-"+name+" EmailId:-"+EmailId);
	}
	public static void main(String ar[]) {
		
		
		Employee emp1=new Employee(890247,"Shubham Lokare","Sh1999@gmail.com");
		emp1.get();
		
		Employee emp2=new Employee(890249,"Sahil Jadhav","Sah1999@gmail.com");
		emp2.get();
		
		Employee emp3=new Employee();
		
		
	}

}
