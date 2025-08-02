/**
Make a program that takes the radius of a circle as input, calculates its radius and area and prints it as output to the user.
*/

import java.util.Scanner;
public class AreaOfCircle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of circle");
        int rad = sc.nextInt();
        System.out.println("Area of circle : " + (3.14*rad*rad));
    }

}
