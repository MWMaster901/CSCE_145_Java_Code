import java.util.Scanner;
//Christopher Schweninger
public class StringHelperTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner k = new Scanner(System.in);
		System.out.println("Please input a string for the characters to be tested for unique-ness");
		String tempString = k.next();
		if(StringHelper.hasAllUniqueCharacters(tempString))
			System.out.println("All characters are unique");
		else
			System.out.println("There are some amount of duplicate letters");
		System.out.println("Please input two string to be meshed together");
		tempString = k.next();
		System.out.println("MeshStrings does not currently work");
		System.out.println("Please input a string to replace vowels with 'oodle'");
		tempString = k.next();
		System.out.println("replaceVowels method does not currently work");
		System.out.println("Please input a string to determine it's weight");
		tempString = k.next();
		System.out.println("Your words weight is: "+ StringHelper.weight(tempString));
		
		
	}

}
