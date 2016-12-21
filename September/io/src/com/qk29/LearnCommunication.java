package com.qk29;

public class LearnCommunication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box box=new Box();
		Producer p=new Producer(box);
		Consumer c=new Consumer(box);
		p.start();
		c.start();
	}

}
class Box{
	int boxvalue=0;
}

class Producer extends Thread{
	private Box box;
	public Producer(Box box){
		this.box=box;
	}
	
	public void run(){
		for(int i=1;i<6;i++){
			synchronized(box){
				while(box.boxvalue !=0){
					try {
						System.out.println("Producer:box是满的");
						box.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				box.boxvalue=i;
				System.out.println("Producer:放入"+i);
				box.notify();
			}
		}
	}
}

class Consumer extends Thread{
	private Box box;
	public Consumer(Box box){
		this.box=box;
	}
	
	public void run(){
		for(int i=1;i<6;i++){
			synchronized(box){
				while(box.boxvalue ==0){
					try {
						System.out.println("Consumer:box空的");
						box.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				box.boxvalue=0;
				System.out.println("Consumer:拿走"+i);
				box.notify();
			}
		}
	}
}