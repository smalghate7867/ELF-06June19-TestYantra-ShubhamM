package com.tyss.java.test.train;

public class Train {
	Integer trainNo;
	String trainName;

	public Integer getTrainNo() {
		return trainNo;
	}

	public void setTrainNo(Integer trainNo) {
		this.trainNo = trainNo;
	}

	public String getTrainName() {
		return trainName;
	}

	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}

	@Override
	public String toString() {
		return "Train [trainNo=" + trainNo + ", trainName=" + trainName + "]";
	}

}
