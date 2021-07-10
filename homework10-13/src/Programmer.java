
public class Programmer extends Employee {
	public Programmer(String firstnameInput, String lastnameInput, int salaryInput,String positionInpu) {
		super(firstnameInput, lastnameInput, salaryInput, positionInpu);
	}
	
	@Override	
	public void hello() {
		System.out.println("Hi, nice to meet you. " + this.firstname + "!");
	}

	public void fire(Employee employee) {
		System.out.println(employee.firstname + " has been fired!");
	}
	
	public void createWebsite(String template, String titleName) {
		
	}
	
	public void installWindows(String version,String productKey) {
		
	}

}
