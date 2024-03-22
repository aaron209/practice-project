package basics;

import java.util.Scanner;

public class Furniture {
	 String type;
	void showtype()
	{
		Scanner myobj = new Scanner(System.in);
		System.out.println("Enter furntiure type");
		type=myobj.next();
		System.out.println("Furniture is of type:"+type);
	  
	}
	public static void main(String[] args) {
		
		Furniture furniture =new Furniture();
		furniture.showtype();
		
	
		System.out.println("we are learning new project");
		
		
	}
}
