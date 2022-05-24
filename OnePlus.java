package week4day1;

public class OnePlus implements TvDesign,OnePlusDesign {

	public void switchOn() {
		System.out.println("Switch On Tv");
		
	}

	public void changeChannel() {
		System.out.println("Change Channel");
		
	}

	public void switchOff() {
		System.out.println("Switch Off Tv");
		
	}
	
	public static void main(String[] args) {
		OnePlus one = new OnePlus();
		one.changeChannel();
		one.switchOff();
		one.switchOn();
		one.increaseBrightness();
		one.increaseVolume();
	}

	public void increaseVolume() {
		System.out.println("Increase Volume");
		
	}	
	
	public void increaseBrightness() {
		System.out.println("Increase Brightness");
		
	}
	
}
