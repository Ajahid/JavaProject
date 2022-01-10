package staticSpecifier;

public class StaticPracticeRunner {

	public static void main(String[] args) {
		StaticPractice student1 = new StaticPractice ("AbduMajeed", 1469);
		StaticPractice student2 = new StaticPractice ("Mohammad", 31545);
		StaticPractice student3 = new StaticPractice ("Mujtaba", 13416545);
		StaticPractice student4 = new StaticPractice ("Murtaza", 323141);
		
		student1.display();
		student2.display();
		student3.display();
		student4.display();
		
		StaticPractice student5 = new StaticPractice ("Muzamil", 331715252);
		
		StaticPractice.change();
		
		student5.display();

	}

}
