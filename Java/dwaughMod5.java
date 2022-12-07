/*Derick Waugh
 * Mod 5
 * Nov 2022
 */


public class dwaughMod5 {

    public static void main(String[] args) {
        int lines = 7; //how many lines we want to double
        String str = "%4s"; //learned that this gives a 4 space spacing
        for (int i = 1; i <= lines; i++)
        {
            for (int j = 0; j < lines - i; j++) //lines - i
            {
        
                System.out.printf(str, " ");
            }
        
            for (int k = 1; k != i; k++)
            {
                // k = 2 ^ (k - 1)
                String str1 = "" + (int)(Math.pow(2, k - 1)); 
                System.out.printf(str, str1);
            }
            for (int l = i; l >= 1; l--)
            {
                // 1 = 2 ^ (l - 1)
                String str2 = "" + (int)(Math.pow(2, l - 1));
                System.out.printf(str, str2);
            }
            System.out.println(); //adds a new line inbetween each line
        }
    }
}