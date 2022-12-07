/*Derick Waugh
 * Mod 9
 * Dec 2022
 */


import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;


public class dwaughMod9 {

    public static void main(String[] args) {
        System.out.println("Let me do some calculations for you!");
        System.out.println("I can tell you the average & sum of any 20 numbers you enter!");
        System.out.println("All is ask is that you use whole numbers. No decimals or commas please!");
        System.out.println("So pick a number! ANY number from 0 - 999,999,999!");
        //Give the user a personalized touch

        Scanner scanner = new Scanner(System.in);
        //Setting up a list of numbers that will be used for the calculations
        List<Integer> list = new ArrayList<>();
        while (list.size() < 20) {
            System.out.println("Please type a number >>: ");
            int newNumber = scanner.nextInt();
            list.add(newNumber);
        }
        //convert the list of numbers to an array.
        Object array[]=list.toArray();
        
        //Set up a bunch of variables to be used.
        int max = (int) array[0];
        int min = (int) array[0];
        int sum = 0;
        double average = 0.0;
        
        for (int i=0;i<array.length;i++) {
            if ((int)array[i] > max) {max=(int) array[i];}
            if ((int)array[i] < min) {min=(int) array[i];}
            sum += (int)array[i];
        }
        //time to calculate the numbers!
        average = sum/20;
        System.out.println("The maximum number you entered is: "+ max);
        System.out.println("The smallest number you entered was "+min);
        System.out.println("The sum of all the numbers you typed were "+sum);
        System.out.println("The average of all of the numbers were: "+average);
        System.out.println("That was fun! Let's do this again sometime!");

    }
    
}
