package com.qk18;

public class TestInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company c = new Company();
		adda(c);

		College co = new College();
		adda(co);

		Bigreport1 b = new Bigreport1();
		addd(b);
	}

	public static void adda(EnvStandard envstandard) {
		envstandard.clean();
		envstandard.recycle();
		envstandard.report();
	}

	public static void addd(Bigreport bigreport) {
		bigreport.bigreport();
	}
}
