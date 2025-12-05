package day2;

public class Mobile {

	//methods - actions can be performed in mobile
	//takePhoto, makeCall
	//ClassName objectName=new ClassName();
	public void takephoto() {
		System.out.println("take photo");
	}
	 
    private void makeCall(String number) {
		System.out.println(number);

	}
	public static void main(String[] args) {
		Mobile obj=new Mobile();
		obj.takephoto();
		obj.makeCall("94414434");
	}
}
