
public class TV {
	String brand;
	boolean isSmart; // boolean data-type gets the values "true" or "false"
	boolean isLED; // if the TV is of LED type then this variable is true; otherwise is false
	boolean is4K;
	int screenSize;
	int numberOfHDMIInputs;
	double price;
	boolean status; // this variable shows whether the TV is on or off
	
	void turnOn(){
		status = true;
		// we later learn the keyword "this" and then we will change the code to: this.status = true;
		System.out.println("TV is on");
	}
	
	void turnOff(){
		status = false;
		// we later learn the keyword "this" and then we will change the code to: this.status = false;
		System.out.println("TV is off");
	}

}
