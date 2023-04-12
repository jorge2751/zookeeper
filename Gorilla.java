package com.jorge.zookeeper;

public class Gorilla extends Mammal{

	public Gorilla() {
		super();
	}
	
	public void throwSomething() {
		System.out.println("The gorilla just threw something!");
		this.setEnergy(this.getEnergy() - 5);
	}
	
	public void eatBananas() {
		System.out.println("*BUUURRP* \n the gorilla just ate a banana");
		this.setEnergy(this.getEnergy() + 10);
	}
	
	public void climb() {
		System.out.println("The gorilla just climbed a tree!");
		this.setEnergy(this.getEnergy() - 10);
	}

}
