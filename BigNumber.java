/**
 * This program ask user for digit inputs up to 40 digits and varify the input.
 */

import java.util.Scanner;

public class BigNumber {
    
    /**
     * The main method ask for input, pass the input to a method, get the varification and display result.
     */
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a positive integer number up to 40 digits: ");
        String numStr = scan.nextLine();

        //Check if the input is empty
        if(numStr.length() == 0){
            System.out.println("Your input can't be empty.");
        }
        //Check if they are all digits
        else if(!isDigit(numStr)){
            System.out.println("Your input is incorrect.");
            System.out.println("Expecting all digit characters.");
        }       
        //Check if the length is up to 40    
        else if(numStr.length() > 40){
            System.out.println("Your input is incorrect.");
            System.out.println("Expecting up to 40 digit number.");
        }
        else
            System.out.println("Your input is correct");
    }

    //A method to check if every char is a digit
    public static boolean isDigit(String str){
        
        for(int i = 0; i < str.length(); i++){

            char ch = str.charAt(i);
            if(ch < '0' || ch > '9'){
                return false;
            }
        }
        return true;
    }

}
