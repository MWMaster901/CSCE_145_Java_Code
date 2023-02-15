/*
 * Christopher Schweninger
 */
public class Bread extends PBJcomponent{

	private String breadType;
	public Bread()
	{
		super();
		breadType = "No Type Yet";
	}
	public Bread(String initialName, int initialCalories, String initialType)
	{
		super(initialName, initialCalories);
		breadType = initialType;
	}
	public void reset(String newName, int newCalories, String newType)
	{
		setPBJcomponentName(newName);
		setPBJcomponentCalories(newCalories);
		breadType = newType;
	}
	public void setBreadType(String newType)
	{
		breadType = newType;
	}
	public String getBreadType()
	{
		return breadType;
	}
	//ToString
	public String toString()
	{
		return "Name: " + getPBJcomponentName() + "/nCalories: " + getPBJcomponentCalories() + "/nType: " + breadType;
	}
	public boolean equals(Bread otherBread)
	{
		return super.equals(otherBread) && this.breadType.equalsIgnoreCase(otherBread.getBreadType());
	}
}
