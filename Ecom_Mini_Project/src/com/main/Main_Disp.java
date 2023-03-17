package com.main;
import java.util.Scanner;
import com.adminMain.*;
public class Main_Disp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner x=new Scanner(System.in);
		
		
		System.out.println("******** >> Welcome To Ecommerse Application << ********");
		
		int ch=0,ch1=0;
		
		System.out.println("\n 1-Registered User  \n 2-Admin \n 3-Guest User");
		
		System.out.println("Please Select your Status");
		ch=x.nextInt();
		
		switch(ch)
		{
		case 1:

			
			break;
			
		case 2:
			
			System.out.println("\n 1-Add Product item \n 2-Calculate Bill \n 3-Display Amount To End User "
					+ "\n 4-Check Quantity  \n 5-check Registered Users \n 6-Check The Particular History");
			
			System.out.println("Select your choice");
			ch1=x.nextInt();
			
			 
			 
			 switch(ch1)
			 {
			 case 1:
			
				 Scanner y=new Scanner(System.in);
				
                 
					System.out.println("Enter the Product Price");
					int price=y.nextInt();
					
					System.out.println("Enter the Product Description");
					String description=x.next();
					
					System.out.println("Enter the Product Quantity");
					int qty=y.nextInt();
					
					System.out.println("Enter the Product Name");
					String name=y.next();

					
					InsertRecord.insertProduct(description,name,price,qty);
                  
				 break;

			 case 2:
				 
				 break;

			 case 3:
				 
				 break;

			 case 4:
				 
				 break;

			 case 5:
				 
				 break;

			 case 6:
				 
				 break;
			default:
				
				 
			 }
			break;
			
		case 3:
			
			break;
		default:	
		}
		
		

	
		
	}

}
