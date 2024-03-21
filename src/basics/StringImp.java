package basics;

public class StringImp {

	public static void main(String[] args) {
		// split every word from the sentence
		try {
		String name = "Hello this is my name";
		String[] names = name.split(" ");
		for (String str : names) {
			System.out.println(str);
		
		}
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
