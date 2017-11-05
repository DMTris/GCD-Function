/*
*   Project :   GCD Function, based off a flowchart
*   Author  :   Chris Langdale
*   File    :   GCDFunction.java
*   Date    :   05/11/17 (05/11/17)
*   Description :   Create a program that performs the greatest common divisor function.  Use a flowchart from a previous assignment as a reference.
*/
package gcdfunction;

import java.util.Scanner;

//class GCDFunction with a main, to calculate a GCD from two integers
public class GCDFunction
{
    //declate variables
    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args)
    {
        System.out.println("Enter the first number:");
        int firstNum = input.nextInt();
        
        System.out.println("Enter the second number:");
        int secondNum = input.nextInt();
        
        System.out.println("The GCD is " + gcdCalc(firstNum, secondNum));
        
    }//end of main
    
    //public static method to calculate GCD, called in main
    public static int gcdCalc(int valueOne, int valueTwo)
    {
        while (valueOne != valueTwo)
        {
            if (valueOne > valueTwo)
            {
                valueOne = valueOne - valueTwo;
            }//end of if
            else
            {
                valueTwo = valueTwo - valueOne;
            }//end of else
            
        }//end of while
        
        return valueOne;
        
    }//end of gcdCalc method
    
}//end of class
