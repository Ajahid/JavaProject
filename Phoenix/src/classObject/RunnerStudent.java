package classObject;

import javax.print.attribute.standard.PrinterMessageFromOperator;

public class RunnerStudent {

	public static void main(String[] args) {
	
		Student obj1 = new Student ("Mohammad Mustafa", 15);
		Student obj2 = new Student ("Mohammad Murtaza", 11);
		
		System.out.println(obj1.name);
		System.out.println(obj1.age);
		
		System.out.println("---------------------");
		
		System.out.println(obj2.name);
		System.out.println(obj2.age);
	
		
		obj1.print();
		obj2.print();
		
		
		
	}
	
	
	
}
