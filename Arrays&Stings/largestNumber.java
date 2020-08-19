/*To find the Largest Number in the Array*/

import java.util.*;
public class largestNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int limit,largeNumber,j;

        //limit
        System.out.println("Enter the limit:");
        limit = sc.nextInt();

        //Array of Numbers
        int[] numbers = new int[limit];
        System.out.println("Enter the Numbers:");
        for(j=0; j<limit; j++){
            numbers[j] = sc.nextInt(); 
        }

        //Finds the Largest Number in the Array
        largeNumber = numbers[0];
        for(j=0; j<limit; j++){
            if(largeNumber < numbers[j]){
                largeNumber = numbers[j];
            }
        }
    //Prints the Largest Number in Array
    System.out.println("The Largest Number is : "+ largeNumber);
    }
}