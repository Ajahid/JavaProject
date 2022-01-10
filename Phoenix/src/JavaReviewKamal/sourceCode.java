package JavaReviewKamal;

public class sourceCode {

	public static void main(String[] args) {
		
		System.out.println("Java is High level Language");
		
		String a = "20";
		String b = "10";
		
		int int1 = Integer.parseInt(a); // Convert String to Integer
		int int2 = Integer.parseInt(a); // Convert String to Integer
		
		System.out.println(int1 + int2);
		
		
		int x = 2;
		x = x + 2; // int a += 2; (using shortcut operators)
		System.out.println(x);
		
		String name = "Abdul";
		String name1 = "Abdul";
		
		int compare = name.compareToIgnoreCase(name1); // This will match both names and will return o if it's same

		System.out.println(compare);
		
		String cont = name.concat(name1);
		
		System.out.println(cont); // This will concatenate both names "AbdulAbdul"
		
		String name2 = "Tek School of America";
		
		System.out.println(name2.contains("Tek")); // Result will be in true and false
		
		String name3 = "Mohammad";
		String name4 = "mohammad";
		
		System.out.println(name3.equalsIgnoreCase(name4)); // This will ignore the lower and upper case. If text at both string are matching it will print true
		
		System.out.println(name3.equals(name4)); // With equal both need to be exactly same. it will compare lower and upper case as well
		
	}

}
