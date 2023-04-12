package com.jorge.zookeeper;

public class Mammal {
	private int energy = 100;
	
	public Mammal() {
	}
	
	public Mammal(int energy) {
		this.energy = energy;
	}

	
	public int displayEnergy() {
		System.out.println("Current Energy:" + energy);
		return this.energy;
	}

	public int getEnergy() {
		return energy;
	}
	
	public void setEnergy(int energy) {
		this.energy = energy;
	}

}
