package hw6;

import java.util.Arrays;

public abstract class AbstractBird {
private String nameBirds;
private boolean feathers;
private boolean layEggs;
	
public AbstractBird(boolean f, boolean l, String nb) {
	this.feathers = f;
	this.layEggs = l;
	this.nameBirds = nb;

}

@Override
public String toString() {
	return "AbstractBird [feathers=" + feathers + ", layEggs=" + layEggs + ", br=" + "]";
}
}


