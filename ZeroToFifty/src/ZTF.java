
/**
 * Zero To Fifty project allows user to enter an arbitrary number of integers
 * between 0 and 50 and prints all of the values entered one or more times.
 *
 * Mark Schuberth
 * February 7th, 2017
 */
import java.util.Scanner;

public class ZTF
{
     public static void main (String[] args)
        {
         //initializes an array of up to 50 integers
         int input = 0;
         int[] numbers = new int[51];
         int other = 0;
         //scans each integer
         Scanner scan = new Scanner (System.in);
         
         System.out.println("Please enter a number between 0-50: ");
         System.out.println("press x to stop entering numbers");
         //allows for up to 50 integers between 0 and 50
         while (scan.hasNextInt())
         {
            input = scan.nextInt();
            if(input < 0 || input > 50)
            {
              other++;
            }
            else 
            {
            	  numbers[input] = numbers[input] + 1;
            }
         }
         for(int i = 0; i < 51; i++)
         {
        	 	System.out.println(i + ":" + numbers[i]);
         }
         System.out.println("The numbers that were out of range: ");
         System.out.print(other);
        }
  }
 
   