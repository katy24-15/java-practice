/**
Make a program that prints the table of a number that is input by the user. 
*/

import java.util.Scanner;
public class table{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number you want the table of: ");
    int n = sc.nextInt();
    for(int i = 1; i <= 10; i++){
      System.out.println(n*i);
    }
  }
}
