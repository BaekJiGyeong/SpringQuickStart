package com.kt.jigyeong;

public class SamsungTV implements TV{
	
	private Speaker speaker;
	private int price;
	
	public void initMethod() {
		System.out.println("Init Object...");
	}
	
	public void destroyMethod() {
		System.out.println("Destroy Object...");
	}
	
	// Samsung TV 생성자 1
	public SamsungTV() {
		System.out.println("===> SamsungTV(1) Object Create.");
	}
	
	public void setSpeaker(Speaker speaker) {
		System.out.println("SetSpeaker 호출 ....");
		this.speaker = speaker;
	}
	
	public void setPrice(int price) {
		System.out.println("SetPrice 호출...");
		this.price = price;
	}
	
//	// Samsung TV 생성자 2
//	public SamsungTV(Speaker speaker) {
//		System.out.println("===> SamsungTV(2) Object Create.");
//		this.speaker = speaker;
//	}
//	
//	// Samsung TV 생성자 3
//		public SamsungTV(Speaker speaker, int price) {
//			System.out.println("===> SamsungTV(3) Object Create.");
//			this.speaker = speaker;
//			this.price = price;
//		}
	
	public void powerOn() {
		System.out.println("Samsung Power On (Price : "+price+" )");
		
	}

	public void powerOff() {
		System.out.println("Samsung Power Off");
		
	}

	public void volumeUp() {
		speaker.volumeUp();		
	}

	public void volumeDown() {
		speaker.volumeDown();
	}

}
