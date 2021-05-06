package com.learn.oops.composition;

public class Human {
	private String name;
	private double height;
	private double weight;
	private Brain brain;
	private Heart heart;

	public Human(String name, double height, double weight, Brain brain, Heart heart) {
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.brain = brain;
		this.heart = heart;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public Brain getBrain() {
		return brain;
	}

	public void setBrain(Brain brain) {
		this.brain = brain;
	}

	public Heart getHeart() {
		return heart;
	}

	public void setHeart(Heart heart) {
		this.heart = heart;
	}

}
