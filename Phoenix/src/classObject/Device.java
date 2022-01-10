package classObject;

import java.util.ArrayList;

public class Device {

	
	
	String ownername;
	String model;
	int yearBuilt;
	String condition;
	ArrayList<String> listOfApps;
	
	
	
	public Device () {
		
		ownername = "";
		model = "";
		yearBuilt = 0;
		condition = "";
		listOfApps = new ArrayList<String>();
		
	}
	
	
	public Device (String newName,String newmodel, int yb, String cond, ArrayList<String> newList ) {
		
		ownername = newName ;
		model = newmodel ;
		yearBuilt = yb ;
		condition = cond ;
		listOfApps = newList;
	
}
}