package demo;

import java.util.*; // Header files
import java.io.*;

public class Captcha
{
        
	public String generateCaptcha()
    	{ 
		
		char ans;
        	Random random = new Random();         
        	int length = 5; 
        	StringBuffer captchaStringBuffer = new StringBuffer(); 
        	for (int i = 0; i < length; i++)
        	{ 
           		 int captchaNumber = (Math.abs(random.nextInt()) % 60);// Captcha number generation formula    
			 System.out.println("Random number is:"+random.nextInt()); // Print random no.
			 System.out.println("Captcha number is:"+captchaNumber);// Print captcha no.
           		 int charNumber = 0; 
           		 if (captchaNumber < 26)
            		 { 
                   		 charNumber = 65 + captchaNumber;   //ASCII converation of genrated captcha number.
                  	 } 
                  	 else if (captchaNumber < 52)
            		 { 
                       		 charNumber = 97 + (captchaNumber - 26); //ASCII converation of genrated captcha number. 
                 	 } 
                   	 else
            		 { 
                    		charNumber = 48 + (captchaNumber - 52); //ASCII converation of genrated captcha number.
                   	 } 
                   		captchaStringBuffer.append((char)charNumber); // captcha saved in buffer
              	} 
     		return captchaStringBuffer.toString(); 
         }

    	
		public static void main(String[] args)throws IOException
   	{ 
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
    		int n =0;
    		do
			{
    			Captcha captcha = new Captcha();    //object of captcha class
    			String str = captcha.generateCaptcha();
    			
			
			System.out.println("Randomly Selected Captcha string is : "+str); // Printing captcha String
        		DataInputStream in=new DataInputStream(System.in);
        		String name;
			
        		System.out.println("Enter Captcha String name : ");   
        		name=br.readLine();
		        if(str.equalsIgnoreCase(name))// Ingoring case of captcha
            		{
           			 System.out.println("Both strings are same....");
           			 n=1;
        		}
        		else
        		{
            			System.out.println("Both strings are not same....");
     			}		
			}
			while(n==0);
              		
    	}
	
}
