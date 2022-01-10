package classObject;

import java.util.ArrayList;

public class Runner {
	public static void main(String[] args) {

		// create 10 objects of the device
		// add values to these objects that make sense

		ArrayList<String> apps = new ArrayList<String>();
		apps.add("Facebook");
		apps.add("Messenger");
		apps.add("Whatsapp");
		apps.add("Youtube");
		apps.add("Slack");

		Device obj1 = new Device("John", "iphone13", 2021, "New", apps);
		Device obj2 = new Device("Mark", "iphone12", 2020, "New", new ArrayList<String>());
		obj2.listOfApps.add("Amazon");
		Device obj3 = new Device("Jennifer", "SamsungGalaxy S20", 2020, "New", new ArrayList<String>());
		obj3.listOfApps.add("Gmail");
		obj3.listOfApps.add("Instagram");
		Device obj4 = new Device("Nicole", "Google Pixle", 2020, "Like New", apps);
		obj4.listOfApps.add("Google");
		obj4.listOfApps.add("Chrome");
		Device obj5 = new Device("Mike", "Iphone XS", 2019, "Used", new ArrayList<String>());
		obj5.listOfApps.add("Google Photos");
		obj5.listOfApps.add("Netflix");
		Device obj6 = new Device("Aaron", "Samsung Fold", 2021, "New", new ArrayList<String>());
		obj6.listOfApps.add("Google Maps");
		obj6.listOfApps.add("Youtube");
		Device obj7 = new Device("Todd", "Motorolla", 2017, "Used Good", new ArrayList<String>());
		obj7.listOfApps.add("Intagram");
		obj7.listOfApps.add("Twitter");
		Device obj8 = new Device("Deanna", "Iphone 12 Max", 2020, "New", apps);
		obj8.listOfApps.add("Twitter");
		Device obj9 = new Device("Alexis", "Iphone 7 plus", 2015, "Used", apps);
		obj9.listOfApps.add("BOFA");
		obj9.listOfApps.add("Walmart");
		obj9.listOfApps.add("Viber");
		Device obj10 = new Device("Rick", "Iphone 4 plus", 2010, "Used", new ArrayList<String>());
		obj10.listOfApps.add("Gmail");

	}

	
	

		
	}

