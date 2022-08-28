package hw8;

public class Wrapper<T> {
	
	private T value;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
	
	public Wrapper(T value) {
		super();
		this.value = value;
	}
	
public static void main(String[] args) {
	Wrapper <Integer> wr1 = new Wrapper<>(123);
	Wrapper <String> wr2 = new Wrapper<String>("Why not");
	Wrapper <Boolean> wr3 = new Wrapper<Boolean>(1 != 2);
	
	
	System.out.println("Wrapper Integer = " + wr1.getValue());
	System.out.println("Wrapper String =  " + wr2.getValue());
	System.out.println("Wrapper Boolean =  " + wr3.getValue());

	
}



}


