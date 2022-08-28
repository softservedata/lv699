package hw8;

public class Student extends Person {

	private int course;

	public Student(String firstName, String lastName, int age, int course) {
		super(firstName, lastName, age);
		this.course = course;
	}

	public int getCourse() {
		return course;
	}

	public void setCourse(int course) {
		this.course = course;
	}

	@Override
	public String info() {
		
		return super.info() + " I study on " + getCourse() + " course. ";
	}

	@Override
	public String activity() {
		String level = "";
		if (course > 0 && course <= 5) {
			level = "I am studing at the university on " + getCourse() + " course now. ";
		} else {
			level = "I am finish my study";
		}
		return level;
	}




	public static void main(String[] args)  {
		 Person st1 = new Student("Will", "Smith", 41, 8);
	     Person st2 = new Student("Roger", "Federer", 37, 7);
	    System.out.println(st1.info());
	    System.out.println(st1.activity()); 
	    System.out.println(st2.info());   
	    System.out.println(st2.activity());   
	
	}
}
