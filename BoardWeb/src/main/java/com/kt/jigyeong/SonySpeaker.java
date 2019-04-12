package com.kt.jigyeong;

import org.springframework.stereotype.Component;

//@Component("sony")
public class SonySpeaker implements Speaker {
	public SonySpeaker() {
		System.out.println("===> Create SonySpeaker Object");
	}
	
	public void volumeUp() {
		System.out.println("SonySpeaker Volume Up ^^^^");
	}
	
	public void volumeDown() {
		System.out.println("SonySpeaker Volume Down vvvv");
	}
}
