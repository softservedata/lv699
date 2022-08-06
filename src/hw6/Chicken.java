package hw6;

public class Chicken extends NonFlyingBird {

	public Chicken(String nonFlyingBird) {
		super(nonFlyingBird);
		
	}

	@Override
	public String toString() {
		return "Chicken [getNonFlyingBird()=" + getNonFlyingBird() + "]";
	}

}
