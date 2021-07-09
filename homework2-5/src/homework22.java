
public class homework22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bark();
		
		//float >> int
		float newFloat = 5.5f;
		int newInt = (int) newFloat; //Narrowing
		System.out.println("newFloat value: " + newFloat);
		System.out.println("newInt value: " + newInt); // 5
		
		//int >> float
		int myInt = 5;
		float myFloat = myInt; //Widening
		System.out.println("myInt value: " + myInt);
		System.out.println("myFloat value: " + myFloat);
		
		//double >> float
		/*double myDouble = 5.12345d;
		float myFloat2 = myDouble; //Widening
		System.out.println("myInt value: " + myDouble);
		System.out.println("myFloat value: " + myFloat2);
		*/
		
		//double >> float
		char myChar = 'A';
		int myInt2 = myChar; //Widening
		System.out.println("myInt value: " + myChar);
		System.out.println("myFloat value: " + myInt2);
		
		//Final Variable
		final String hello = "Hello";
		//hello = "World";
		System.out.println("finalInt value: " + hello);
		
		
	}
	
	public static void bark() {
		String dogName ="SHIBA";
		System.out.println("The Dog name = " + dogName + " bark");
	}

}
