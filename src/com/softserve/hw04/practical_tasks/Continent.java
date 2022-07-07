package com.softserve.hw04.practical_tasks;

import com.softserve.hw04.practical_tasks.Continent;
import com.sun.xml.internal.bind.v2.runtime.Name;

import java.io.BufferedReader;

public enum Continent {
	ASIA("china","japan"){
	public Continent returnContinent(){ return ASIA;}
	},
	AFRICA("nigeria","egypt","algeria"){
		public Continent returnContinent(){ return AFRICA;}
	},
	EUROPE("ukraine","germany","spain","italy"){
		public Continent returnContinent(){ return EUROPE;}
	},
	NORTH_AMERICA("honduras", "dominica", "cayman islands"){
		public Continent returnContinent(){ return NORTH_AMERICA;}
	},
	SOUTH_AMERICA("colombia", "uruguay", "brazil"){
		public Continent returnContinent(){ return SOUTH_AMERICA;}
	},
	AUSTRALIA("new zealand", "guinea", "australia") {
				public Continent returnContinent(){ return AUSTRALIA;}
			};

	private String name;

	Continent(String...name) {
	}

	public abstract Continent returnContinent();


}
