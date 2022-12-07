/*Derick Waugh
 * Mod 10
 * Dec 2022
 * Dealing with arrays
 */


public class dwaughMod10 {

    public static void main(String [] args) {



        /* Write four overloaded methods that return the average of an array with the following headers: */
        /* public static int average(int[] array) */
        /* public static double average(double[] array) */
        /* public static int average(ArrayList<Integer> list) */
        /* public static double average(ArrayList<Double> list) */
        /* Write a test program that prompts the user to enter ten double values, invokes this method, and displays the average value. */
        function average(array) {
            var sum = 0;
            for (var i = 0; i < array.length; i++) {
            sum += array[i];
            }
            return sum / array.length;
        }
        function average(array) {
            var sum = 0;
            for (var i = 0; i < array.length; i++) {
            sum += array[i];
            }
            return sum / array.length;
        }
        function average(list) {
            var sum = 0;
            for (var i = 0; i < list.length; i++) {
            sum += list[i];
            }
            return sum / list.length;
        }
        function average(list) {
            var sum = 0;
            for (var i = 0; i < list.length; i++) {
            sum += list[i];
            }
            return sum / list.length;
        }
        var array = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
        var array2 = [1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9, 10.1];
        var list = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
        var list2 = [1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9, 10.1];
        console.log(average(array));
        console.log(average(array2));
        console.log(average(list));
        console.log(average(list2));
        /* public static short average(short [] array) */
        /* public static int average(int [] array) */
        
        /* public static long average(long [] array) */
        
        /* public static double average(double [] array) */
        
        /* Write a test program that invokes each of these methods and then displays the average value returned along with a display of the original array elements. Ensure the display is easy to read and understandable. Lastly, each array sent into the methods must be of different sizes to ensure the method code is correctly written. */

        
    }
    
}
