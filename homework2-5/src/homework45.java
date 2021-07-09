
public class homework45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// LAB 9
		int counter = 20;
		do {
			counter--;
			if (counter == 11) {
				System.out.println("Counter : " + counter);
				counter=20;
			}
		} while (counter >= 0);
		
		// LAB 10
		counter = 0;
		do {
			counter++;
			if (counter == 2) {
				continue;
			}else {
			System.out.println("Counter : " + counter);
			}
		} while (counter < 10);
		

	}

}
