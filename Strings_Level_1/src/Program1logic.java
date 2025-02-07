
public class Program1logic {
	public static String insertString(String originalString ,String stringToBeInserted , int index)
	{
		StringBuilder newString= new StringBuilder(originalString);
		newString.insert(5, " ");
		newString.insert(index, stringToBeInserted);
		newString.insert(9," ");
		return newString.toString();
		
	}
}
