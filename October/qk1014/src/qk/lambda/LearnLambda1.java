package qk.lambda;

public class LearnLambda1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<1000;i++){
		new Thread(new Runnable() {        //�����ڲ���  ����Runnable�ӿ�      ���߳�
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("I am thread "+Thread.currentThread().getId());
			}
		}).start();
	}
  }

}
