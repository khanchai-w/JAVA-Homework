
public class homework10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee[] employees = new Employee[3];
		for (int i = 0; i < employees.length; i++) {
			employees[i] = new Employee("name" + i, "lastname" + i, i * 10000,"employee");
		}
		System.out.println(employees[1].firstname); // name1
		System.out.println(employees[2].firstname); // name2
		System.out.println(employees[1].getSalary()); // 10000
		System.out.println(employees[2].getSalary()); // 20000
	}

}

