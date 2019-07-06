package com.tyss.designpatterns;

public class MyUmmutableTest {
public static void main(String[] args) {
	MyImmutableClass immutable=new MyImmutableClass(1, "shubham");
	System.out.println(immutable);
	MyImmutableClass immutable1=new MyImmutableClass(2, "1shubham");
	System.out.println(immutable1);

}
}
