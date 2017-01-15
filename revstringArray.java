/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures;

import java.util.*;

/**
 *
 * @author Timo
 */
public class revstringArray {

    /**
     * @param args the command line arguments
     */
    
    public static String reverseWords(String str) {

        str = "be in present";
        //seattle in stuck am i

        char[] c = str.toCharArray();
        int left, right = 0;
        right = c.length - 1;

        char tempChar;
        for (left = 0; left < right; left++, right--) {

            tempChar = c[left];
            c[left] = c[right]; //swap the values
            c[right] = tempChar;

        }
        System.out.println(str);
        for (char c1 : c) {
            System.out.print(c1);
        }

        return str;
    }

    

    public static void main(String[] args) {
        // TODO code application logic here

        //call the method reverse words in a string
        String userInput = "I AM STUCK IN SEATTLE";
        String callWord = reverseWords(userInput);

          
    }

}
