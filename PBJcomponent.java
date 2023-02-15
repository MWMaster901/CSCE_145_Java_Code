/*
 * 
 */
public class PBJcomponent {

	private String componentName;
	private int componentCalories;
	
	//Basic Constructor
		public PBJcomponent()
		{
			componentName = "No Name Yet.";
			componentCalories = 0;
			
		}
	//Parameterized Constructor
		public PBJcomponent(String initialName, int initialCalories)
		{
			componentName = initialName;
			componentCalories = initialCalories;
		}
	//Mutators
		public void setPBJcomponent(String newName, int newCalories)
		{
			componentName = newName;
			componentCalories = newCalories;
		}
		public void setPBJcomponentName(String newName)
		{
			componentName = newName;
		}
		public void setPBJcomponentCalories(int newCalories)
		{
			componentCalories = newCalories;
		}
	//Accessors
		public String getPBJcomponentName()
		{
			return componentName;
		}
		public int getPBJcomponentCalories()
		{
			return componentCalories;
		}
	//ToString
		public String toString()
		{
			return "Name: " + componentName + "/nCalories: " + componentCalories;
		}
	//Equals
		public boolean equals(PBJcomponent otherPBJcomponent)
		{
			return otherPBJcomponent != null && this.componentName.equalsIgnoreCase(otherPBJcomponent.getPBJcomponentName()) && this.componentCalories == otherPBJcomponent.getPBJcomponentCalories();
		}
}
