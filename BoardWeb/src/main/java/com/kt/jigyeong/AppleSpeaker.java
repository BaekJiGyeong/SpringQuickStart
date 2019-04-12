package com.kt.jigyeong;

import org.springframework.stereotype.Component;

//@Component("apple")
public class AppleSpeaker implements Speaker{

	public AppleSpeaker() {
		System.out.println("*** Create AppleSpeaker Object");		
	}
	
	public void volumeUp() {
		System.out.println("*** Volume Up AppleSpeaker");
	}

	public void volumeDown() {
		System.out.println("*** Volume Down AppleSpeaker");
	}

}
