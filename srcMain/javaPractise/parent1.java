package javaPractise;

import org.openqa.selenium.interactions.Actions;

class Parent1 {
	int age;

	Parent1(int a) {

		//age = a;
		System.out.println("Parent constructor");
	}

	void m1(int a) {
		System.out.println("Prent m1 method " + age);// this.age

	}

}

class Child2 extends Parent1 {

	String name;

	Child2(int a,int b) {
		super(a);
		System.out.println(name);// this.name
		System.out.println(super.age);
		
	}
}
