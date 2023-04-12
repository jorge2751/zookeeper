package com.jorge.zookeeper;

public class Bat extends Mammal{

	public Bat() {
		super(300);
	}
	
	public void fly() {
		System.out.println("Woooshhh!");
		this.setEnergy(this.getEnergy() - 50);
		
	}
	
	public void eatHumans() {
		this.setEnergy(this.getEnergy() + 25);
	}
	
	public void attackTown() {
		System.out.println("*CITY IS ON FIRE*");
		this.setEnergy(this.getEnergy() - 100);
	}

}
