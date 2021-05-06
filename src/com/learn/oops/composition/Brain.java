package com.learn.oops.composition;

public class Brain {
	private int numOfNuerons;
	private int iq;
	
	public Brain(int numOfNuerons, int iq) {
		this.numOfNuerons = numOfNuerons;
		this.iq = iq;
	}

	public int getNumOfNuerons() {
		return numOfNuerons;
	}

	public void setNumOfNuerons(int numOfNuerons) {
		this.numOfNuerons = numOfNuerons;
	}

	public int getIq() {
		return iq;
	}

	public void setIq(int iq) {
		this.iq = iq;
	}
}
