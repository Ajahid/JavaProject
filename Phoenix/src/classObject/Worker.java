package classObject;

public class Worker {

	
	private double baseSalary ;
	private double hourlySalary ;
	
	
	
	public Worker (double baseSalary, double hourlySalary) {
		
		this.setBaseSalary(baseSalary);
		this.setHourlySalary(hourlySalary);
		
	}
	
	public void setBaseSalary (double salary) {
		
		baseSalary = salary ;
	}
	
	public void setHourlySalary (double hSalary) {
		
		hourlySalary = hSalary ;
	}
	
	public double wagesCal (double overTime) {
		
		return baseSalary + (hourlySalary * (overTime * 1.5));
	}
	
}
