
public class CEO extends Employee {
	public CEO(String firstnameInput, String lastnameInput, int salaryInput) {
		super(firstnameInput, lastnameInput, salaryInput);
	}
	

	public void orderWebsite(IWebsiteCreator creator) {
		creator.createWebsite("some template", "Codecamp3");
	}
}
