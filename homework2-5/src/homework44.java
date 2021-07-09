import java.util.Scanner;

public class homework44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// LAB 6-1
		int i = 0;
		while (i <= 10) {
			System.out.println("Counter" + i);
			i++;
		}

		// LAB 6-2
		int sum = 0;
		for (int j = 1; j <= 10; j++) {
			sum += j;
		}
		System.out.println("sum = " + sum);

		// LAB 6-3
		System.out.println("The number 1-100 % 12 is ...");
		for (int j = 1; j <= 100; j++) {
			if (j % 12 == 0)
				System.out.println(j);
		}

		// LAB 6-4
		System.out.println("LAB 6-4");
		int myArray[] = { 1, 2, 3, 4, 5 };
		for (int val : myArray) {
			System.out.println("Value :" + val);
		}

		// LAB 7-1
		System.out.println("LAB 7-1");
		int counter = 20;
		do {
			System.out.println("Counter :" + counter);
			counter--;
		} while (counter >= 0);

		// LAB 7-2
		Scanner scanner = new Scanner(System.in);		
		String inputString = "";
		do {
			System.out.println("press number");
			inputString = scanner.nextLine();
		} while (Integer.parseInt(inputString) % 2 > 0);
		System.out.println("End");

		// LAB 8-1
		counter = 20;
		do {
			counter--;
			if (counter == 11) {				
				break;				
			}
		} while (counter >= 0);
		System.out.println("Counter : " + counter);
	}

}
