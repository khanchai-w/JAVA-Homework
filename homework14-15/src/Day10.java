import java.util.ArrayList;

public class Day10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Employee dang = new Employee("Dang", "Red", 10000);
		Employee ceo = new CEO("Captain", "Marvel", 30000);
		Programmer prog = new Programmer("Captain", "Marvel", 20000);
		CEO ceo2 = (CEO) ceo;
		// CEO ceo3 = new Employee("Captain", "Marvel", 30000); // Error
		// CEO ceo4 = (CEO) dang; // Error
		ArrayList<Employee> myList = new ArrayList<>();
		myList.add(ceo2);
		myList.add(dang);
		myList.add(prog);
		CEO ceo3 = (CEO) myList.get(0);
		Employee dang2 = myList.get(1);
		Programmer prog2 = (Programmer) myList.get(2);
		ceo3.hello(); // Hi, nice to meet you. Captain!
		prog2.hello(); // Hello Captain
		
		
		CEO ceo4 = new CEO("Captain", "Marvel", 30000);
		IWebsiteCreator dang4 = new Programmer("Dang", "Red", 10000);
		Programmer dang5 = (Programmer) dang4;
		AI alphaGo = new AI("alphaGo", "Java");
		IWebsiteCreator alphaGo2 = alphaGo;
		ceo4.orderWebsite(dang4);
		ceo4.orderWebsite(dang5);
		ceo4.orderWebsite(alphaGo);
		ceo4.orderWebsite(alphaGo2);


	}

}
