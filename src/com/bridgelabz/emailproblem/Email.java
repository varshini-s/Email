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


		
		


	}
}