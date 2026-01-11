/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tw2stringhandling;
import java.util.*;

/**
 *
 * @author KSMathad
 */

 

public class TW2StringHandling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String inputLine; String[] allWords;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Sentence : ");
        inputLine=sc.nextLine();
        allWords=inputLine.split(" ");
        for(String s : allWords)
        {
           if(isPalindrome(s,0,s.length()-1))
           {
                System.out.println(s.toUpperCase());
                System.out.println("It is Palindrome");
           }
           else
           {
                System.out.println(reverseString(s).toLowerCase());
                System.out.println("It is not Palindrome");
           }
        }
    }
        
    public static boolean isPalindrome(String myWord, int s, int t )
    {
        if(myWord.charAt(s)== myWord.charAt(t)) {
        if(s<t)
          return  isPalindrome(myWord,s+1,t-1);
        else
            if(s==t) return true;
           
        }
        return false;
    }
    public static String reverseString(String s){
        String rS="";
        for(int i=s.length()-1;i>=0;i--)
           rS=rS+s.charAt(i);
        return rS;
    }

    
}


