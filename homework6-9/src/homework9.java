
public class homework9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Design Mopile Phone
		Note8 galaxyNote8 = new Note8();
		IPhoneX iPhoneX = new IPhoneX();
		IPhone8 iphone8 = new IPhone8();
		Android galaxyS8 = new Android();
		
		galaxyNote8.ModelName();
		iPhoneX.ModelName();
		iphone8.ModelName();
		galaxyS8.ModelName();
		
	}
	
}

class MobilePhone {
	
	public static void PhoneCall() {
		System.out.println("Phone Call");
	}

	public static void SMS() {
		System.out.println("SMS");
	}

	public static void InternetSurfing() {
		System.out.println("Internet Surfing");
	}

}

class IPhone extends MobilePhone {
	private String modelName = "IPhone";    //attribute
	
	public void AppStore() {
		System.out.println("App Store");
	}
}


class IPhoneX extends IPhone {
	private String modelName = "IPhoneX";    //attribute
	
	public void ModelName() {
		System.out.println(modelName);
	}
	
	public void FaceID() {
		System.out.println("Face ID");
	}
}

class IPhone8 extends IPhone {
	private String modelName = "IPhone8";    //attribute
	
	public void ModelName() {
		System.out.println(modelName);
	}
	
	public void TouchID() {
		System.out.println("Touch ID");
	}
}

class Android extends MobilePhone {
	private String modelName = "Android";    //attribute
	
	public void ModelName() {
		System.out.println(modelName);
	}
	
	public void UseGearVR() {
		System.out.println("Use Gear VR");
	}
	
	public void TransformToPC() {
		System.out.println("Transform To PC");
	}
	
	public void GooglePlay() {
		System.out.println("Google Play");
	}
	
}

class Note8 extends Android {
	private String modelName = "Note8";    //attribute
	
	public void ModelName() {
		System.out.println(modelName);
	}
	
	public void UsePen() {
		System.out.println("Use Pen");
	}
	
}

