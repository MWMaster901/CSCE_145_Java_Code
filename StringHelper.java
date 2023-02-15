
public class StringHelper {

	private String inputString1, inputString2;
	public static char[] stringArray1, stringArray2, stringArray3;
	public static boolean hasAllUniqueCharacters(String inputString1)
	{
		stringArray1 = new char[inputString1.length()];
		for(int i = 0; i < stringArray1.length; i++)
			stringArray1[i] = inputString1.charAt(i);
		
		boolean temp = true;
		for(int i = 0; i < stringArray1.length; i++)
		{
			for(int j = i + 1; j < stringArray1.length; j++)
			{
				if(stringArray1[i] == stringArray1[j])
				{
					temp = false;
				}
			}
		}
		return temp;	
	}
	
	public static String meshStrings(String inputString1, String inputString2) 
	{
		stringArray1 = new char[inputString1.length()];
		stringArray2 = new char[inputString2.length()];
		int temp = inputString1.length() + inputString2.length();
		stringArray3 = new char[temp];
		int i = 0;
		int j = 0;
		while(i < stringArray3.length)
		{
			stringArray3[i] = stringArray1[j];
			i += 2;
			j++;
		}
		i = 1;
		j = 0;
		while(i < stringArray3.length)
		{
			stringArray3[i] = stringArray1[j];
			i += 2;
			j++;
		}
		char tempChar = stringArray3[0];
		String tempString;
		String outputString = String.valueOf(tempChar);
		for(i = 1; i < stringArray3.length; i++)
		{
			tempChar = stringArray3[i];
			tempString = String.valueOf(tempChar);
			outputString = outputString.concat(tempString);
		}
		return outputString;	
		
	}
	
	public static String replaceVowelsWithOodle(String inputString1)
	{
		String tempString1, tempString2, tempStringBefore, tempStringAfter;
		String oodleString = "oodle";
		char tempChar;
		tempString1 = inputString1.replace('a', 'o');
		tempString2 = tempString1.replace('e', 'o');
		tempString1 = tempString2.replace('i', 'o');
		tempString2 = tempString1.replace('u', 'o');
		for(int i = 0; i < tempString2.length(); i++)
		{
			tempChar = tempString2.charAt(i);
			if(tempChar == 'o')
			{
				tempStringBefore = tempString2.substring(0, i);
				tempStringAfter = tempString2.substring(i+1);
				tempString2 = tempStringBefore + oodleString + tempStringAfter;
			}
		}
		return tempString2;
	}
	
	public static Double weight(String inputString1)
	{
		char tempChar;
		double weightValue = 0.0;
		for(int i = 0; i < inputString1.length(); i++)
		{
			tempChar = inputString1.charAt(i);
			if(tempChar == 'a' || tempChar == 'e' || tempChar == 'i' || tempChar == 'o' || tempChar == 'u')
				weightValue += 2.5;
			else
				weightValue += 3.4;
		}
		return weightValue;
	}
}
