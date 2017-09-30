//Vivek Patel
//A class defining a circular cone
//Goal Sheet 5 - 3D Shapes

public class GoalSheet5_CircularCone extends GoalSheet5_Cylinder {

	//Constructors
	public GoalSheet5_CircularCone()
	{
		//Default constructor
		super();
	}
	
	public GoalSheet5_CircularCone(float baseRadius, float height)
	{
		super(baseRadius, height);
	}
	
	
	//Getter functions
	@Override
	public float getVolume()
	{
		return (float)(1.0 / 3.0 * super.getVolume());
	}
	
	@Override
	public float getSurfaceArea()
	{
		float r = getBaseRadius();
		float h = getHeight();
		
		return (float)(Math.PI * r * (r + Math.sqrt((h * h) + (r * r))));
	}
}
