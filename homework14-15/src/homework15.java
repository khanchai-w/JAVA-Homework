
public class homework15 {
	enum Status {
		HEALTHY, SLEEPY, DEAD
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Abstract
		final Pig myPig = new Pig(); // Create a Pig object
		myPig.animalSound();
		myPig.sleep();

		Status myStatus = Status.HEALTHY;
		switch (myStatus) {
		case HEALTHY:
			System.out.println("พร้อมจะลุยกันมานานแล้วววว!!");
			break;
		case SLEEPY:
			System.out.println("ง่วงจังขอกาแฟหน่อย");
			break;
		case DEAD:
			System.out.println("ไม่ไหวแล้วไปนอนละบายยย");
			break;
		}

	}

}
