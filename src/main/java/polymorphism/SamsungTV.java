package polymorphism;

public class SamsungTV implements TV {
	private Speaker speaker;
	private int price;
	
	public SamsungTV() {
		System.out.println("===> SamsungTV(1) °´Ã¼ »ý¼º");
	}
	
	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void powerOn() {
		System.out.println("SamsungTV--Àü¿ø ÄÒ´Ù. (°¡°Ý : "+price+")");
	}

	public void powerOff() {
		System.out.println("SamsungTV==Àü¿ø ²ö´Ù.");
	}

	public void volumeUp() {
		speaker.volumeUp();
	}

	public void volumeDown() {
		speaker.volumeDown();
	}

}
