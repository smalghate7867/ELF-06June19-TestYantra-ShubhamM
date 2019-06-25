package com.tyss.org.reference.operator;

public class Test {

	public static void main(String[] args) {
		PenFactory pf = Pen::new;
		Pen x = pf.getpen();
		x.write();

	}

}
