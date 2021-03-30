package com.stackroute.patterns;


public class Computer {
	
	public void startComputer() {
		CPU cpu = new CPU();
		cpu.freeze();
		Memory mem = new Memory();
		mem.load();
		HardDrive hd = new HardDrive();
		hd.read();
		cpu.execute();
		
	}
	
}
