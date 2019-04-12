package com.kt.jigyeong;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component("tv")
public class LgTV implements TV{
	
//	@Qualifier("apple")
//	@Resource(name="apple")
	@Autowired
	private Speaker speaker;
	
	public LgTV() {
		System.out.println("LgTV °´Ã¼ »ý¼º");
	}
	
	@Override
	public void powerOn() {
		System.out.println("Lg Power On");
		
	}

	@Override
	public void powerOff() {
		System.out.println("Lg Power Off");
		
	}

	@Override
	public void volumeUp() {
		speaker.volumeUp();
		System.out.println("Lg Volume Up");
		
	}

	@Override
	public void volumeDown() {
		speaker.volumeDown();
		System.out.println("Lg Volume Down");
		
	}

}
