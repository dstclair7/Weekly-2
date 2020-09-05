

import java.util.Scanner;

public class bagTest{

	public static void main (String[] args)
	{
		
		String[] contentsOfBag = {"A", "A", "B", "A", "C", "A"};
		
	
		BagInterface<String> aBag = new ArrayBag<>(10);
		
		
		// add the values from the array into the bag
		int option=0;
	
		
		while (option != 6)
		{
			System.out.println("1) Check size of bag");
			System.out.println("2) Add an item to the bag");
			System.out.println("3) Remove a specific item from the bag");
			System.out.println("4) Clear the bag");
			System.out.println("5) View contents of the bag");
			System.out.println("6) Exit");
			
			System.out.println("Select an option");
			Scanner myOption = new Scanner(System.in);
			option = myOption.nextInt();
			
			switch (option) {
			
			case 1 :
				System.out.println(aBag .getCurrentSize());
				break;
			
			case 2 :
				System.out.println("What number would you like to add to the bag? ");
				Scanner myString = new Scanner(System.in);
			    String addString = myString.nextLine();
			   aBag.addEntry(addString);
			   break;
			   
			case 3 :
				System.out.println("What number would you like to remove from the bag? ");
				Scanner myString2 = new Scanner(System.in);
			    String subString = myString2.nextLine();
			    aBag.removeEntry(subString);
			    break;
			    
			case 4 :
				aBag.clear();
				break;
				
			case 5 :
				displayBag(aBag);
				break;
				
			case 6 :
				break;
			}
			
			
			
		}
		
	}
	
	private static void displayBag(BagInterface<String> aBag)
	{
		System.out.println("The bag contains the following string(s):");		
		Object[] bagArray = aBag.toArray();
		for (int index = 0; index < bagArray.length; index++)
		{
			System.out.print(bagArray[index] + " ");
		} 
		
		System.out.println();
	} 
	
	
}
