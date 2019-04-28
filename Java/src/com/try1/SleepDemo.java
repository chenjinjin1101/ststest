package com.try1;

import java.util.Date;

public class SleepDemo {
public static void main(String[] args) {
	
	try {
		System.out.println(new Date()+"\n");
		Thread.sleep(1000);
		System.out.println(new Date()+"\n");
	} catch (InterruptedException e) {

	}
	
}
}
