package com.experion.works;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Checking {
	public static void main(String[] args) throws Exception // You can also use try-catch blocks.
    {
      System.out.println("dd-mm-yyyy");
      Scanner scanner = new Scanner(System.in);
      String date = scanner.nextLine();
      Date date1=new SimpleDateFormat("dd-MM-yyyy").parse(date);  
      System.out.println(date1);
      
      
  	SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
  	Date dates = new Date();
  	System.out.println(formatter.format(dates)); 
  	//System.out.println(date1); 
  	//System.out.println(dates); 
  	if(date1.after(dates))
  	{
  		System.out.println("Invalid date"); 
  		System.out.println(date1.after(dates)); 
  		
  	}
	if(date1.before(dates))
  	{
		System.out.println("Valid date"); 
		System.out.println(date1.after(dates)); 
  	}

	
 
  	

    }


}