package Threading;

public class ThreatSafeAndUnsafe {
	
	
	// Java is multi threading language 
	
	
	// StringBuffer
	// String Buffer is Threat safe
	// One threading in the JVM/CPU at a time
	// String Buffer is slower then String Builder
	// If we want to set and get a value at same time it's better to use String Buffer as this result will be accurate
	
	
	
	
	// StringBuilder
	// String Builder is not threat safe
	// Multiple threading at same time in JVM/CPU
	// StringBuilder is faster
	// If we want to only set or get a value it's better to use stringBuilder as it will be fast and no issue with result 
	
	
	public static void main(String[] args) {
		
		// Both below are mutable
		
		StringBuilder SBuilder = new StringBuilder ("test"); // Not Threatsafe
		StringBuffer SBuffer = new StringBuffer ("test"); // Threatsafe
		
		// String is immutable 
		
		String str = new String ("test");
		String str1 = "test2";
		
		
		
	}
	

}
