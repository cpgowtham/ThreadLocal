package com;

import java.text.SimpleDateFormat;
import java.util.Date;

public class NormalThread implements Runnable {

	
	SimpleDateFormat simpleDateLocal = new SimpleDateFormat("yyyyMMdd-HH:mm");

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Before Thread_" + Thread.currentThread().getName()
				+ " : " + simpleDateLocal.format(new Date()));

		simpleDateLocal = new SimpleDateFormat();
		System.out.println("After Thread_" + Thread.currentThread().getName()
				+ " : " + simpleDateLocal.format(new Date()));
	}

}
