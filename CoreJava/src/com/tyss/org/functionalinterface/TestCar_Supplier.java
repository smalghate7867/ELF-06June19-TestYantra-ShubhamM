package com.tyss.org.functionalinterface;

import java.util.function.Supplier;

public class TestCar_Supplier {
	public static void main(String[] args) {
		Supplier<Car> car = () -> new Car(56.23);
		Car c = car.get();
		System.out.println(c.initFuelCap);
	}

}
