package com.qk22;

import java.util.Random;

public interface Vehicle {

	void Tuola();
	void Train();
	void Plane();

	default  int speedUp(Vehicle vehicle) {
		int a = 0;
		Random r = new Random();
			if (vehicle==vehicle.Tuola;) {
				Tuola_speed = a;
			} else if (a >= 8 && a < 12) {
				Train_speed = a;
			} else if (a >= 12 && a < 15)
				Plane_speed = a;

	}
}
