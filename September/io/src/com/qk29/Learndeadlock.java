package com.qk29;

public class Learndeadlock {



	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Object lock1=new Object();
		Object lock2=new Object();
		ThreadA ta=new ThreadA(lock1,lock2);
		ThreadB tb=new ThreadB(lock1,lock2);
		ta.start();
		tb.start();
	}

}

	class ThreadA extends Thread{
		Object lock1;
		Object lock2;
		public ThreadA(Object lock1,Object lock2){
			this.lock1=lock1;
			this.lock2=lock2;
		}
		
		public void run(){
			synchronized(lock1){
				System.out.println("A:lock1");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				synchronized(lock2){
					System.out.println("lock1+lock2");
				}
			}
		}
	}
	
	class ThreadB extends Thread{
		Object lock1;
		Object lock2;
		public ThreadB(Object lock1,Object lock2){
			this.lock1=lock1;
			this.lock2=lock2;
		}
		
		public void run(){
			synchronized(lock1){        //Ë³Ðò
			//synchronized(lock2){
				System.out.println("B:lock1");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				synchronized(lock1){
					System.out.println("lock1+lock2");
				}
			}
		}
	}