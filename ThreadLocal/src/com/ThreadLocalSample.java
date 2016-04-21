package com;

public class ThreadLocalSample {
	
	public static void main(String[] args) {
		//DateFormatClass dateFormatClass = new DateFormatClass();
		NormalThread dateFormatClass = new NormalThread();
		for(int itr=1; itr<=10; itr++){
			Thread t = new Thread(dateFormatClass, String.valueOf(itr));
			t.start();
		}
	}

}
