package Methods;

public class MethodsWithReturn {

	
	
	
	int addTwoValues () {
	
	int a = 30;
	int b = 40;
	
	int total = a+b;
	
	return total ;
	
	}
	
	
	public static void main(String[] args) {
		
		
		MethodsWithReturn obj = new MethodsWithReturn ();
		
		// obj.addTwoValues(); // This will not print as we do not have systemprint line in the method
			
		System.out.println(obj.addTwoValues());
		
		int a = obj.addTwoValues(); // 
		
		int z = 40;
		
		int finalResult = a + z ;
		
		System.out.println(finalResult);
		
		int x = 90;
		
		int grandResult = x + finalResult ;
		
		System.out.println(grandResult);
		
		
		
		
		
	}
	
}
