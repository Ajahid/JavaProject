package inheritance;

public class Runner1 {
	
	public static void main(String[] args) {
		
		
		Students1 stu = new Students1 ("Mohammad", "Jahid", "09/28/2006", "571-598-2119" , 12132544, "A-", "mohammadjahid@gmail.com");
		
		System.out.println(stu);
		
		System.out.println("---------------------------------------");
		
		Employees1 emp = new Employees1 ("Abdul", "Jahid", "03/18/1986", "571-598-2177" , 1596317, "Sales Manager", 55000) ;
		
		System.out.println(emp);
	
		
	}
	
	
	
	
	

}
