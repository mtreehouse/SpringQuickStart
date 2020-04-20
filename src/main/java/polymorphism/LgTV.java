package polymorphism;

import javax.inject.Inject;

import org.springframework.stereotype.Component;

@Component("tv")
public class LgTV implements TV{

	@Inject
	private Speaker speaker;
	
	public void powerOn() {
		System.out.println("LgTV--���� �Ҵ�.");
	}
	
	public void powerOff() {
		System.out.println("LgTV==���� ����.");
	}
	
	public void volumeUp() {
		speaker.volumeUp();
	}
	
	public void volumeDown() {
		speaker.volumeDown();
	}
	
}
