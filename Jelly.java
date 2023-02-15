/*
 * Christopher Schweninger
 */
public class Jelly extends PBJcomponent{

	private String jellyType;
	public Jelly()
	{
		super();
		jellyType = "No Type Yet";
	}
	public Jelly(String initialName, int initialCalories, String initialType)
	{
		super(initialName, initialCalories);
		jellyType = initialType;
	}
	public void reset(String newName, int newCalories, String newType)
	{
		setPBJcomponentName(newName);
		setPBJcomponentCalories(newCalories);
		jellyType = newType;
	}
	public void setJellyType(String newType)
	{
		jellyType = newType;
	}
	public String getJellyType()
	{
		return jellyType;
	}
	//ToString
	public String toString()
	{
		return "Name: " + getPBJcomponentName() + "/nCalories: " + getPBJcomponentCalories() + "/nType: " + jellyType;
	}
	public boolean equals(Jelly otherJelly)
	{
		return super.equals(otherJelly) && this.jellyType.equalsIgnoreCase(otherJelly.getJellyType());
	}
}