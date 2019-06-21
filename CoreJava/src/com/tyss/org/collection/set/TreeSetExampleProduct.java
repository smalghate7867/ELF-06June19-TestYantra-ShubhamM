package com.tyss.org.collection.set;

import java.util.TreeSet;

public class TreeSetExampleProduct {
public static void main(String[] args) {
TreeSet<Product> treeSet=new TreeSet<Product>();
Product p1=new Product("Tea Bag",50,5.0);
Product p2=new Product("Ziva",50,1.0);
Product p3=new Product("Snacks",110,4.4);
Product p4=new Product("Amigo",123,3.0);

treeSet.add(p1);
treeSet.add(p2);
treeSet.add(p3);
treeSet.add(p4);

treeSet.forEach(refVar->{
	System.out.println(refVar.getProductName());
	System.out.println(refVar.getPrice());
	System.out.println(refVar.getRating());
	System.out.println("*******************");

});

}
}
