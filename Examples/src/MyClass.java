
public class MyClass {

	public static void main(String[] args) {
		TV tv1 = new TV();
		tv1.brand = "Sony";
		tv1.isSmart = true;
		tv1.isLED = true;
		tv1.is4K = false;
		tv1.numberOfHdmiInputs = 2;
		tv1.screenSize = 40;
		tv1.price = 350;
		tv1.turnOn();
		
		System.out.println("Output from MyClass starts from here:");
		
		System.out.println("Brand: " + tv1.brand);
		System.out.println("Smart: " + tv1.isSmart);
		System.out.println("LED: " + tv1.isLED);
		System.out.println("4K: " + tv1.is4K);
		System.out.println("Number of HDMI Ports: " + tv1.numberOfHdmiInputs);
		System.out.println("Screen Size: " + tv1.screenSize);
		System.out.println("Price: " + tv1.price);
		System.out.println("Is the TV on?: " + tv1.status);
 
	}

}
