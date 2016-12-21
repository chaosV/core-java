package com.qk29;

public class LearnThreadSync {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount account=new BankAccount();
		Thread husband=new BankThread(account);
		Thread wife=new BankThread(account);
		husband.start();
		wife.start();

	}
	
}

class BankAccout{
	private double balance=1000;
	public boolean deposit(double newadd){
		if(newadd<=0){
			return false;
		}else {
			synchronized(this){                                  //
				System.out.println("当前余额："+balance);
				try {
					Thread.sleep(5);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				balance=balance+newadd;
				System.out.println("当前余额："+balance);
			}
			return true;
		}
	}
}

class BankThread extends Thread{
	private BankAccount bankAccount;
	
	
}