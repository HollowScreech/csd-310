/*Derick Waugh
 * Mod 8 
 * Nov 2022
 */

import java.util.Scanner;
import java.text.DecimalFormat;


public class dwaughMod8 { 
    
    public static void main(string[] args) {

        /* yearlyService(no parameters) - Will return the standard service charge. */
        function.new yearlyService() {
            return 500;
        }
        /* yearlyService(one parameter) - Will return the standard service charge with an added oil change fee. */
        function.new yearlyService(oilChange) {
            return 500 + oilChange;
        }
        /* yearlyService(two parameters) - Will return the standard service charge with an added oil change fee and a tire rotation charge. */
        function.new yearlyService(oilChange, tireRotation) {
            return 500 + oilChange + tireRotation;
        }
        /* yearlyService(three parameters) - Will return the standard service charge with an added oil change fee, a tire rotation charge, along with a coupon amount that will be deducted from the total cost. */
        function.new yearlyService(oilChange, tireRotation, coupon) {
            return 500 + oilChange + tireRotation - coupon;
        }
        /* Write a main method that will test each of these methods two times. */
        function main() {
            console.log(yearlyService());
            console.log(yearlyService(100));
            console.log(yearlyService(100, 50));
            console.log(yearlyService(100, 50, 25));
        };

    }
}
