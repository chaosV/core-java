package com.qk29;

public class CodingThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//long startTime=System.currentTimeMillis();
		//print();
//		Thread t=new PrintThread();//¼Ì³ÐThreadÀà
//		Thread t=new Thread(Runnable);//Runnable½Ó¿Ú
		//coding();
		//long finishTime=System.currentTimeMillis();
		//System.out.println(""+(finishTime-startTime));
		
		Thread print=new PrintThread();
		print.start();
		try {
			print.join(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		downLoadMovie dm=new downLoadMovie();
		Thread downloader=new Thread(dm);
		downloader.start();
//		Thread t=Thread.currentThread();
		
		coding();
	}
	
	public static void coding(){
		for(int i=0;i<=100;i++){
			System.out.println(""+i+"");
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
//	public static void print(){
//		for(int i=0;i<=200;i++){
//			System.out.println(""+i+"");
//			try {
//				Thread.sleep(5);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//	}
}
	class PrintThread extends Thread{
		public void run(){
			long startTime=System.currentTimeMillis();
			for(int i=0;i<=100;i++){
				System.out.println(""+i+"");
				try {
					Thread.sleep(5);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			long finishTime=System.currentTimeMillis();
			System.out.println(""+(finishTime-startTime));

		}
	}
	


