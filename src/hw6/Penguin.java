package hw6;

public class Penguin extends NonFlyingBird {

	public Penguin(String nonFlyingBird) {
		super(nonFlyingBird);
		
	}

	@Override
	public String toString() {
		return "Penguin [getNonFlyingBird()=" + getNonFlyingBird() + "]";
	}

}
