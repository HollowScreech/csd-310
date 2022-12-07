/* Derick Waugh
 * Mod 2 Water Temp
 * Oct. 2022
 */

 /*
 Q = waterMass ( finalTemperature – initialTemperature ) x 4184
waterMass is water weight in kilograms
finalTemperature and initialTemperature are temperatures in Celsius
 */

import java.util.Scanner;
public class dwaughMod2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);	
// needs a new Scanner object.
        System.out.println("I can calculate the amount of energy needed to heat water from an initial temperature to a final temperature in Celcius.");
        System.out.println("All you have to do is input the amount of water you want, your starting temperature, and then your final temperature you would like.");
        System.out.println("");

        System.out.println("For example, if we take the average initial temperature of water which is 20");
        System.out.println("And we want boiling water, which has a temperature of 100.");
        System.out.println("And this is for our tea kettle, which would be 1.7kg of water");
        System.out.println("It would take 569,024 joules of energy to reach boiling!");
        System.out.println("");

        System.out.println("Now you try!");
        System.out.println("");

//Added breaks in the lines so everything doesn't run together
//User enters the following variables. 
        System.out.print("Please enter the amount of water in kilograms >>: ");
        double kilograms = input.nextDouble();

        System.out.print("Enter the initial temperature >>: ");
        double initialTemperature = input.nextDouble();

        System.out.print("Enter the final temperature >>: ");
        double finalTemperature = input.nextDouble();
    
        double Q = kilograms * (finalTemperature - initialTemperature) * 4184;
    
// Displays the results for the user
        System.out.println("The energy needed is " + Q + " joules");
    }
    
}
