package javaPractise;

public class AreaOfCircle {
	int radius;
	double area(int r) {
	radius=r;
	double areaofcircle=3.14*r*r;
		return areaofcircle;
	}
	public static void main(String arg[]) {
		
		AreaOfCircle obj1=new AreaOfCircle();
		double output=obj1.area(12);
		System.out.println(output);
		
	}

}
