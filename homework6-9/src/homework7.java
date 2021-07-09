
public class homework7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Compare
		String String1 = "You and Me";
		String String2 = "you and me";
		if ( String1.equals(String2) )
			System.out.println( "Equal" );
		else
			System.out.println("Not equal");
		
		//Contain
		System.out.println(String1.contains("Me"));
		
		//Length
		System.out.println("String1 lenrth = " + String1.length());
		System.out.println("String2 lenrth = " + String2.length());
		
		//Substring
		System.out.println(String1.substring(4, String1.length()));
		System.out.println(String2.substring(4, String2.length()));
		
		//Trim
		System.out.println(String1.trim());
		System.out.println(String2.trim());
		
		//toUpperWord
		System.out.println(String1.toUpperCase());
		System.out.println(String2.toUpperCase());
		
		//chinning
		System.out.println(String1.substring(0,3).toUpperCase()+String1.substring(4,7).toUpperCase()+String1.substring(8,10).toUpperCase());

	}

}
