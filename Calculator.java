// A simple calculator code that keeps taking input from the user (integer and mathematical operation alternatively) until '=' is inputted.

import java.util.*;
class Calculator
{
    public static void main(String args[])
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("Welcome to the Calculator.");
        System.out.println("Please enter an INTEGER value followed by a mathematical operation");
        float res=ob.nextFloat();
        char ch=ob.next().charAt(0);
        while(ch!= '=')
        { 
            if(ch==' ')
            {
               ch=ob.next().charAt(0);
            }
            if (ch=='=')
            {
                continue;
            }
            float y=ob.nextFloat();
            switch (ch)
            {
                case '+':
                res=res+y;
                ch=' ';
                break;
             
                case '-':
                res=res-y;
                ch=' ';
                break;
             
                case '*':
                res=res*y;
                ch=' ';
                break; 
             
                case '/':
                res=res/y;
                ch=' ';
                break;
            }
        }
        System.out.println(res);
    }
}
