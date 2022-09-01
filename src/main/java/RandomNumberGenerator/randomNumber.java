package RandomNumberGenerator;

import java.util.Random;

public class randomNumber {

	public static void main(String[] args) {	
	
int i,a=0,smallest=500;
Random rnum = new Random();

//Generate 500 Random Numbers and Nth Smallest Number

   for (i = 0; i <=500;i++)
   {
   a=(rnum.nextInt(500));
   System.out.println(a);
   
   if (a<smallest) 
  	 smallest=a;
   
   }
  System.out.println("The smallest Numbr is"+smallest); 
}
}