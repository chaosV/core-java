package com.qk29;

public class downLoadMovie implements Runnable {
	public void run() {
		long startTime = System.currentTimeMillis();
		for (int i = 0; i <= 10; i++) {
			System.out.println("&" + i + "");
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		long finishTime = System.currentTimeMillis();
		System.out.println("" + (finishTime - startTime));

	}
}
