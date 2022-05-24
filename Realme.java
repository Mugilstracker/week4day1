package week4day1;

public class Realme implements AndroidDesign,RealmeDesign {

	public void startPhone() {
		System.out.println("Start phone");
		
	}

	public void makeCall() {
		System.out.println("Make call");
		
	}

	public void sendSms() {
		System.out.println("Send SMS");
		
	}
    
	public void realmeCpro(){
		System.out.println("Relme C pro");
		
	}
	public static void main(String[] args) {
		Realme obj = new Realme();
		obj.startPhone();
		obj.sendSms();
		obj.makeCall();
		obj.realmeCpro();
		obj.faceAuthentication();
		obj.fingerPrint();
	}

	public void faceAuthentication() {
		System.out.println("Face Authentication");
		
	}

	public void fingerPrint() {
		System.out.println("Finger print");
		
	}
}
   