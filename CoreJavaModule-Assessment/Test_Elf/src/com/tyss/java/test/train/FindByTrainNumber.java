package com.tyss.java.test.train;

import java.util.Comparator;
import java.util.TreeSet;
import java.util.logging.Logger;

public class FindByTrainNumber {
	private static final Logger log = Logger.getLogger("Train");

	public static void main(String[] args) {
		Train train1 = new Train();
		train1.setTrainNo(5);
		train1.setTrainName("ChennaiExpress");

		Train train2 = new Train();
		train2.setTrainNo(4);
		train2.setTrainName("DelhiShatabdi");

		Train train3 = new Train();
		train3.setTrainNo(1);
		train3.setTrainName("KTKSMPK");

		Train train4 = new Train();
		train4.setTrainNo(6);
		train4.setTrainName("GOAExpress");

		// sort by Train name
		Comparator<Train> strCmpbyName = (arg1, arg2) -> arg1.getTrainName().compareTo(arg2.getTrainName());
		// sort by Train Number
		Comparator<Train> strCmpByNumber = (arg1, arg2) -> arg1.getTrainNo().compareTo(arg2.getTrainNo());
		TreeSet<Train> ts = new TreeSet<Train>(strCmpByNumber);
		ts.add(train1);
		ts.add(train2);
		ts.add(train3);
		ts.add(train4);

		ts.forEach(refvar -> {
			log.info("Sorted Result by Name are :-->" + refvar);
		});

	}

}
