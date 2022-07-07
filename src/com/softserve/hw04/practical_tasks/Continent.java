package com.softserve.hw04.practical_tasks;

public enum Continent {
	ASIA("china","japan"),
	AFRICA("nigeria","egypt","algeria"),
	EUROPE("ukraine","germany","spain","italy"),
	NORTH_AMERICA(""),
	SOUTH_AMERICA(""),
	AUSTRALIA(""),
	ANTARCTIA("");
	private String name;
private Continent(String...name){
	this.name= String.valueOf(name);
}
}
