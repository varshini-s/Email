package com.bridgelabz.emailproblem;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email 
{

	public static void main(String[] args) 

	{
		System.out.println("welcome to email problem");

		String regularExpression="^[a-z0-9]+$";

		
		String[] validMails = {"abc@yahoo.com","abc-100@yahoo.com","abc.100@yahoo.com","abc111@abc.com","abc-100@abc.net",
				"abc.100@abc.com.au","abc@1.com","abc@gmail.com.com","abc+100@gmail.com"};

		String[] invalidMails= {"abc","abc@.com.my","abc123@gmail.a","abc123@.com.com",".abc@abc.com","abc()*@gmail.com","abc@%*.com","abc..2002@gmail.com"
				,"abc.@gmail.com","abc@abc@gmail.com","abc@gmail.com.1a",".abc@gmail.com.aa.au"};


		int allValidMails=1,allInvalidMails=1;


		for(int index=0;index<validMails.length;index++)
		{

			String mailID=validMails[index];
			Pattern pattern = Pattern.compile(regularExpression);
			Matcher matcher = pattern.matcher(mailID);
			boolean matchFound = matcher.find();

			if(matchFound) 
			{
				continue;
			} 
			else 
			{
				System.out.println(mailID+": This mail should be valid");
				allValidMails=0;
			}
		}
		
		System.out.println("--------------------");

		for(int index=0;index<invalidMails.length;index++)
		{

			String mailID=invalidMails[index];
			Pattern pattern = Pattern.compile(regularExpression);
			Matcher matcher = pattern.matcher(mailID);
			boolean matchFound = matcher.find();

			if(matchFound)
			{
				System.out.println(mailID+": This mail should  not be valid");
				allInvalidMails=0;
			} 
			else 
			{
				continue;

			}
		}
		

		if(allValidMails==1)
		{
			System.out.println("All valid mail id verified");
		}

		if(allInvalidMails==1)
		{
			System.out.println("All Invalid mail id verified");
		}


		


	}
}