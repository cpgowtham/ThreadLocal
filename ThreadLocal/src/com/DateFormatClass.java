package com;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatClass implements Runnable {

	String format = null;
	ThreadLocal<SimpleDateFormat> simpleDateLocal = new ThreadLocal<SimpleDateFormat>() {
		protected SimpleDateFormat initialValue() {
			return new SimpleDateFormat("yyyyMMdd-HH:mm");
		}

	};

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Before Thread_"+Thread.currentThread().getName()+
				" : "+simpleDateLocal.get().format(new Date()));
		simpleDateLocal.set(new SimpleDateFormat());
		System.out.println("After Thread_"+Thread.currentThread().getName()+
				" : "+simpleDateLocal.get().format(new Date()));
	}

	

}
