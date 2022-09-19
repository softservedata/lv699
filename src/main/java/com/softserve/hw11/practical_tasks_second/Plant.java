package com.softserve.hw11.practical_tasks_second;

public class Plant {
	   private Type type;
	   private Color color;
	   private int size;

	   public Plant(String type, String color, int size) throws ColorException, TypeException{
	      Color c = colorStrToEnum(color);
	      Type t = typeStrToEnum(type);
	      this.size = size;
	      this.type = t;
	      this.color = c;
	   }

	   private Color colorStrToEnum(String color) throws ColorException{
	      switch(color.toLowerCase()){
	         case "blue" : return Color.BlUE; 
	         case "red" : return Color.RED; 
	         case "white" : return Color.WHITE; 
	         default : throw new ColorException("Input only color blue, red or white");
	      }
	   }
	   private Type typeStrToEnum(String type) throws TypeException{
		      switch(type.toLowerCase()){
		         case "alpines" : return Type.AlPINES; 
		         case "annuals" : return Type.ANNUALS; 
		         case "bulbs" : return Type.BULBS; 
		         case "cacti" : return Type.CACTI; 
		         case "climbers" : return Type.CLIMBERS; 
		         default : throw new ColorException("Wrong type. Input only type alpines, annuals, bulbs, cacti, climbers");
		      }
		   }
	   
	   
	   
@Override
public String toString() {
	return "Plant size=" + size + ", color=" + color + ", type=" + type;
}

}
