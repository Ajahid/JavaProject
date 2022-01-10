package inheritance;

public class Runner {

	public static void main(String[] args) {
		
		
		Student st1 = new Student ("Abdul", "Jahid", 35, 2.5, "CS");
		
		st1.setFirstName("Abdul Majeed");

		System.out.println(st1.getFirstName());
		
		
		System.out.println(st1.getMajor());
		
		System.out.println(st1);

	}

}
