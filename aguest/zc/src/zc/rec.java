package zc;

public class rec {

	public static void main(String[] args) {
		//System.out.println(dg(8));
		System.out.println(f(8));
	}

	public static int dg(int a){
		if(a==1)return 1;
		return a * dg(a-1);	
	}

	public static int f(int a){
		if(a<=1) return 0;
		if(a==2) return 1;
		return f(a-1)+f(a-2);
	}
	
}