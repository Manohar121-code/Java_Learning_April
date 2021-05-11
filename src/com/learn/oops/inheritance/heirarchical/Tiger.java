package com.learn.oops.inheritance.heirarchical;

public class Tiger extends Animal {
	private boolean canHunt;
	private String type;

	public Tiger(boolean canHunt, String type) {
		super();
		this.canHunt = canHunt;
		this.type = type;
	}

	public boolean isCanHunt() {
		return canHunt;
	}

	public void setCanHunt(boolean canHunt) {
		this.canHunt = canHunt;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
