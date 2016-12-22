package qk.lambda;

public class LearnLambda1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<1000;i++){
		new Thread(new Runnable() {        //匿名内部类  创建Runnable接口      多线程
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("I am thread "+Thread.currentThread().getId());
			}
		}).start();
	}
  }

}
