package qk.lambda;

public class LearnLambda2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<1000;i++){
		new Thread(()->System.out.println("I am thread "+Thread.currentThread().getId())).start();
	}
  }

}
