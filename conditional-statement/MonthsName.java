/**
Ask the user to enter the number of the month & print the name of the month. For eg - For ‘1’ print ‘January’, ‘2’ print ‘February’ & so on.
*/

import java.util.Scanner;
public class MonthsName{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of month: ");
    int num = sc.nextInt();
    switch(num){
      case 1 : System.out.println("January");
        break;
      case 2 : System.out.println("February");
        break;
      case 3 : System.out.println("March");
        break;
      case 4 : System.out.println("April");
        break;
      case 5 : System.out.println("May");
        break;
      case 6 : System.out.println("June");
        break;
      case 7 : System.out.println("July");
        break;
      case 8 : System.out.println("August");
        break;
      case 9 : System.out.println("September");
        break;
      case 10 : System.out.println("October");
        break;
      case 11 : System.out.println("November");
        break;
      case 12 : System.out.println("December");
        break;
      default : System.out.println("Not Valid");
    }
  }
        
    
