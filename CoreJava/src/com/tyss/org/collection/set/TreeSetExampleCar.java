package com.tyss.org.collection.set;

import java.util.TreeSet;

public class TreeSetExampleCar {
public static void main(String[] args) {
	TreeSet<Car> treeSet=new TreeSet<Car>();
	Car p1=new Car("C-CLASS","BMW",5000000,8.3);
	Car p2=new Car("S-BENZ","BENZ",5600000,7.6);
	Car p3=new Car("A-4","AUDI",4564651,5.6);
	Car p4=new Car("C-CAMERO","CHERVLET",9314482,3.0);
	Car p5=new Car("C-CAMERO","CHERVLET",9314482,3.0);

	treeSet.add(p1);
	treeSet.add(p2);
	treeSet.add(p3);
	treeSet.add(p4);
	treeSet.add(p5);

	treeSet.forEach(ref->{
		System.out.println(ref.getName());
		System.out.println(ref.getBrand());
		System.out.println(ref.getCost());
		System.out.println(ref.getRating());
System.out.println("******************");
		
	});
}
}
