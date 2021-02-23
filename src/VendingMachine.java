import java.util.Scanner;

public class VendingMachine
{
    public static void main(String[] args)
    {
    	// Variables
    	Double A1,C7, J2; // Vending codes

    	Double A2,B4,B5,G8,L9,M5;// Vending codes



    	Double A9,K4;// Vending codes
    	A1 = C7 = J2  = 1.50; //$1 for code
    	A2 = B4 = B5 = G8 = L9 = M5 = 2.00; //2$ Amount for code
    	A9 = K4 = 3.00; 	// 3$ for code
    	
    	// Prints
        System.out.println("Welcome to the best snack machine of your life! This machine only accepts $1 bills. Please insert money.");
        System.out.println("[A1] Snickers - $1.50, [A2] Chips - $2.00,  [B4] Gatorade - $2.00,  [C7] Reese's - $1.50, [A9] Trail Mix - $3.00, \n [B5] Hershey's - $2.00, [G8] Granola Bar - $2.00 , [J2] Doritos $1.50, [K4] Protein Bar $3.00 \n [L9] Cheetos $2.00 [M5] Twix $2.00");
        System.out.println("How many $1 bills would you like to enter?");
       
        Scanner input = new Scanner(System.in);
        Double amount = input.nextDouble();
        int amountInt = (int)Math.round(amount); 
        
        System.out.println("You have put in " + amountInt + " dollar bills");
        System.out.println("Please enter your selected snack code number (Ex. A1,A2,B1,...).");
       
        Scanner input2 = new Scanner(System.in);
        String snack = input2.nextLine();
       
        System.out.println("You have selected " + snack + ". One moment please.");
        
        // TODO: Add code that will ask the user for confirmation on the transaction before it is carried out, and if the user
        // decides to cancel the transaction, they are given a full refund

        Double amountLeft = 0.0;
        
        // Switch
        switch (snack.toLowerCase()) {
        case "a1": // if its A1 then
        	System.out.println("Getting Snickers");
        	amountLeft = amount - A1;
        	break;
        case "a2":
        	System.out.println("Getting Chips");
        	amountLeft = amount - A2;
        	break;
        case "b4":
        	System.out.println("Getting Gatorade");
        	amountLeft = amount - B4;
        	break;
        case "c7":
        	System.out.println("Getting Reese's");
        	amountLeft = amount - C7;
        	break;
        case "a9":
        	System.out.println("Getting Trail Mix");
        	amountLeft = amount - A9;
        	break;
        case "b5":
        	System.out.println("Getting Hershey's");
        	amountLeft = amount - B5;
        	break;
        case "g8":
        	System.out.println("Getting Granola Bar");
        	amountLeft = amount - G8;
        	break;
        case "j2":
        	System.out.println("Getting Doritos");
        	amountLeft = amount - J2;
        	break;
        case "k4":
        	System.out.println("Getting Protein Bar");
        	amountLeft = amount - K4;
        	break;
        case "l9":
        	System.out.println("Getting Cheetos");
        	amountLeft = amount - L9;
        	break;
        case "m5":
        	System.out.println("Getting Twix");
        	amountLeft = amount - M5;
        	break;
		default: // if none match then print this
			System.out.println("That option does not exist!");
			break;
		}
        
        // Calculating Amount Left
        System.out.format("Amount Left: %.2f", amountLeft);
        
        // TODO: Give the user a departure message that makes them feel good about their snack choice 
        
    }
}
