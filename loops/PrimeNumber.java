/**
Print if a number is prime or not (Input n from the user). 
*/

import java.util.*;
public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int count = 0; 
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                count++;
            }
        }
        if(count == 2) {
            System.out.println("Prime number");
        } else {
            System.out.println("Not prime");
        }
    }
}

 /**
 import java.util.*;
public class pr{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        boolean isPrime = true;
        for(int i = 2; i<=n/2; i++){
            if(n % i == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            if(n==1){
                System.out.println("This is neither prime nor composite");
            }else{
                System.out.println("This is prime number");
            }
            }else{
                System.out.println("This is not a prime number");
            }
        }
    }
*/

/**
import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your nmuber");
        int num = input.nextInt();
        boolean isPrime = isPrime(num);
        if(isPrime){
            System.out.println("Your number is Prime");
        }else{
            System.out.println("Your number is not prime");
        }
    }
    public static boolean isPrime(int num){
        int i= 2;
        while (i< num){
            if (num % i == 0){
                return false;
            }
            i++;
        }
        return true;
    }
}
*/

  
