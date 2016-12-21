package io;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ShouldSleepTest {
	ShouldSleep s=new ShouldSleep();
	
	@Before
	public void setup(){
		System.out.println("****");
	}
	
	@After
	public void endup(){
		System.out.println("####");
	}
	
	@Test
	public void ShouldSleep() {
		assertFalse("...",s.shouldSleep(true, false));
	}
	@Test
	public void ShouldSleep1() {
		assertTrue(s.shouldSleep(true,false));
	}	@Test
	public void ShouldSleep2() {
		assertTrue(s.shouldSleep(false, false));
	}


}
