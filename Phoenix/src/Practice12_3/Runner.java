package Practice12_3;

public class Runner {

	public static void main(String[] args) {
		
		Parent p = new Parent("AbdulMajeed", "AzizaJahid", "35 Years", "34 Years");
		Parent p1 = new Son("Mohammad Jahid", "15", 4000);
		Son p2 = new Son();
		
		System.out.println(p.getFatherName());
		System.out.println(p.getFatherAge());
		System.out.println(p.getMotherName());
		System.out.println(p.getMotherAge());
		
		System.out.println(p.fatherMethod());
		p.motherMethod();
		
		System.out.println(p.toString());
		
		p1.motherMethod();
		
		System.out.println("--------------------------");
		
		System.out.println(p2.toString());
		
		
		
		
		

	}

}
