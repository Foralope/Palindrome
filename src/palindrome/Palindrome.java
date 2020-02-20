/*
 * William Z.
 * This is a program that will take a word that the user inputs and print out whether or not it is a palindrome.
 */

package palindrome;
import javax.swing.*;
/**
 *
 * @author wizwa9381
 */
public class Palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables.
        String userInput = "";
        String reversed = "";
        boolean trueOrFalse = false;
        //Getting user input
        userInput = JOptionPane.showInputDialog("Feed me a word to discover if it is a palindrome or not.");
        //Reversing it using charAt in a for loop.
        for(int i = userInput.length() - 1; i >= 0; i--) {
            reversed = reversed + userInput.charAt(i);
        }
        //Comparing whether or not the strings match.
        for(int ii = 0; ii < userInput.length(); ii++) {
            trueOrFalse = (int)userInput.charAt(ii) == (int)reversed.charAt(ii);
        }
        //Telling them their word in reverse and whether or not it is a palindrome.
        JOptionPane.showMessageDialog(null,"Your word in reverse is: "+reversed);
        if (trueOrFalse == true) {
            JOptionPane.showMessageDialog(null,"Your word was a palindrome.");
        } else {
            JOptionPane.showMessageDialog(null,"Your word was not a palindrome.");
        }

    }
    
}
