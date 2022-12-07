/*Derick Waugh
 * Mod 7
 * Nov 2022
 * 
 * Password creator
 */


import java.util.Scanner;

public class dwaughMod7 {
    
public static final int PASSWORD_LENGTH = 8;

public static void main(String[] args) {

        Scanner input = new Scanner(System.in); //give the user password instructions
        System.out.print(
                "1. A password must have at least eight characters.\n" +
                "2. A password must contain only letters and numbers.\n" +
                "3. A password must contain one uppercase character \n" +
                "4. A password must contain one lowercase character \n" +
                "  " +
                "Please enter a password: ");
        String s = input.nextLine();

        if (is_Valid_Password(s)) {
            System.out.println("Password accepted: " + s); //Password confirmation
        } else {
            System.out.println("Invalid password: " + s);  //Password denial
        }

    }

    //Password check
    public static boolean is_Valid_Password(String password) {

        if (password.length() < PASSWORD_LENGTH) return false;

        int charCount = 0;
        int numCount = 0;
        for (int i = 0; i < password.length(); i++) {

            char ch = password.charAt(i);

            if (is_Numeric(ch)) numCount++;
            else if (is_Letter(ch)) charCount++;
            else return false;
        }


        return (charCount >= 2 && numCount >= 2);
    }
//Letters
    public static boolean is_Letter(char ch) {
        ch = Character.toUpperCase(ch);
        return (ch >= 'A' && ch <= 'Z');
    }

//Numbers
    public static boolean is_Numeric(char ch) {

        return (ch >= '0' && ch <= '9');
    }

}

//help from https://www.w3resource.com/