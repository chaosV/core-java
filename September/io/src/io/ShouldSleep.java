package io;

public class ShouldSleep {
	public boolean shouldSleep(boolean isWeekday,boolean isVacation){
		return !isWeekday || !isVacation;
	}
}
