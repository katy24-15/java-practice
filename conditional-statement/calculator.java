/**
Make a Calculator. Take 2 numbers (a & b) from the user and an operation as follows : 
1 : + (Addition) a + b
2 : - (Subtraction) a - b
3 : * (Multiplication) a * b
4 : / (Division) a / b
5 : % (Modulo or remainder) a % b
Calculate the result according to the operation given and display it to the user.
*/

import java.util.Scanner;
public class calculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a and b and operator");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int operator = sc.nextInt();
        /**
            1-->+
            2-->-
            3-->*
            4-->/
            5-->%
            */
    switch(operator){
        case 1 : System.out.println(a+b);
            break;
        case 2 : System.out.println(a-b);
            break;
        case 3 : System.out.println(a*b);
            break;
        case 4 :if(b==0){
            System.out.println("Invalid Division");
        }else{
            System.out.println(a/b);
        }
            break;
        case 5 :if(b==0){
            System.out.println("Invalid Division");
        }else{
            System.out.println(a%b);
        }
            break;
        default: System.out.println("Invalid Operator");
    }
    }
}


