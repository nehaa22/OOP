package commercialdataprocessing;

import java.util.Scanner;

import JSONprograms.Utility;

public class CommercialLL 
{
	public static void main(String[] args) throws Exception 
	{
		Scanner scanner = new Scanner(System.in);
		CommercialUtility utility = new CommercialUtility();
		CommercialLLMethods stock = new CommercialLLMethods();
		char ch;
		do
		{
			System.out.println("1. Add Details\n2. Buy\n3. Sell\n4. Print Report ");
			int choice = utility.inputInteger();			
			switch(choice)
			{
				case 1 : 
					stock.addDetails();
					break;
				case 2 : 
					stock.buyStock();
					stock.linkedlist();
					break;
				case 3:
					stock.sellStock();
					stock.linkedlist();
					break;
				case 4 : 
					stock.printReport();
					break;							
				default :
					System.out.println("Invalid Choice..!!!");
					break;			
			}
			System.out.println("Do you wants to continue...(Y/N)");
			ch = scanner.next().charAt(0);
		}while(ch=='Y' || ch == 'y');
	}
}


