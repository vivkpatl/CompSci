package GoalSheet5;
import GoalSheet4.GoalSheet4_Rectangle;

//Vivek Patel
//A class defining a Square which inherits from a rectangle
//Goal Sheet 5 - Circle, Rectangle, and Square

public class GoalSheet5_Square extends GoalSheet4_Rectangle {
	
	//Constructors
	public GoalSheet5_Square()
	{
		//Default constructor sets all of the instance variables to zero
		//Haha there are none lololololol
		super(0f, 0f);
	}
	
	public GoalSheet5_Square(float sideLength)
	{
		//Allows the use of getArea and getPerimeter as this sets the necessary values in the superclass
		super(sideLength, sideLength);
	}
	
	//Setter methods
	public void setSideLength(float sideLength)
	{
		setLength(sideLength);
		setWidth(sideLength);
	}
	
	//Return the length
	public float getSideLength()
	{
		return getLength();
	}
}