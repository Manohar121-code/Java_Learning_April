package com.learn.oops.composition;

public class Heart {
	private int heartRate;
	private boolean heartQuality;

	public Heart(int heartRate, boolean heartQuality) {
		this.heartRate = heartRate;
		this.heartQuality = heartQuality;
	}

	public int getHeartRate() {
		return heartRate;
	}

	public void setHeartRate(int heartRate) {
		this.heartRate = heartRate;
	}

	public boolean isHeartQuality() {
		return heartQuality;
	}

	public void setHeartQuality(boolean heartQuality) {
		this.heartQuality = heartQuality;
	}

}
