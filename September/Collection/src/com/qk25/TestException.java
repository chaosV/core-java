package com.qk25;

public class TestException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		a=1;
		b=0;
		try{
			if(b==0){
				throw new DivisionZeroException("..."+b+"..."+"...");
			}
			c=a/b;
		}catch(DivisionZeroException e){
			e.printStackTrace();
		}
	}

}
