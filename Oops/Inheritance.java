/* Question: 
Write the following code in your editor below:

-A class named Arithmetic with a method named add that takes  integers as parameters and returns an integer denoting their sum.
-A class named Adder that inherits from a superclass named Arithmetic.
Your classes should not be public*/


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Inheritance{
    public static void main(String []args){

        Adder a = new Adder();
    
        System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());	
        System.out.print(a.add(10,32) + " " + a.add(10,3) + " " + a.add(10,10) + "\n");
     }
}

abstract class Arithmetic{
    public abstract int add(int a, int b); //abstract methods do not specify a body
    {
    }
} 

 
 class Adder extends Arithmetic{
     public int add(int a, int b){
        return a + b;
    }
}


