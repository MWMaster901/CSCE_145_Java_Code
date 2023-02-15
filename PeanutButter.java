/*
 * Christopher Schweninger
 */
public class PeanutButter extends PBJcomponent{

	private boolean IsCrunchy;
	public PeanutButter()
	{
		super();
		IsCrunchy = false;
	}
	public PeanutButter(String initialName, int initialCalories, boolean initialCrunchy)
	{
		super(initialName, initialCalories);
		IsCrunchy = initialCrunchy;
	}
	public void reset(String newName, int newCalories, boolean newCrunchy)
	{
		setPBJcomponentName(newName);
		setPBJcomponentCalories(newCalories);
		IsCrunchy = newCrunchy;
	}
	public void setPeanutButterType(boolean newCrunchy)
	{
		IsCrunchy = newCrunchy;
	}
	public boolean getPeanutButterIsCrunchy()
	{
		return IsCrunchy;
	}
	//ToString
	public String toString()
	{
		return "Name: " + getPBJcomponentName() + "/nCalories: " + getPBJcomponentCalories() + "/nIs Crunchy: " + IsCrunchy;
	}
	public boolean equals(PeanutButter otherPeanutButter)
	{
		return super.equals(otherPeanutButter) && this.IsCrunchy == otherPeanutButter.getPeanutButterIsCrunchy();
	}
}