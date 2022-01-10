package classObject;

import java.util.ArrayList;

public class Session1 {
	
	ArrayList <Student1> Student1;
	ArrayList <Instructor> Instructor;
	
	String sessionName;
	
		
	public Session1() {
		
		Student1 = new ArrayList<Student1>();
		Instructor = new ArrayList<Instructor>();
		sessionName = "";	
	}
	public Session1(String newName, ArrayList <Student1> tempStuList, ArrayList <Instructor> tempInsList) { 
		
		
	sessionName = newName;
	Student1 = tempStuList;
	Instructor = tempInsList;

	}
	
	public void printSessioninfo() {
		
		System.out.println("**********************************");
		System.out.println("Sessioin Name: " + sessionName);
		System.out.println("Student Name: " + Student1);
		for(Student1 s : Student1) {
			s.printInfo();
		}
		
		
		System.out.println("Instructor Name: " + Instructor);
		System.out.println("**********************************");
		
	}
}
