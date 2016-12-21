package com.qk18;

public interface EnvStandard {
	void clean();
	void recycle();
	default void report(){
		System.out.println("report-----");
	}
}
