import java.util.Scanner;

import java.util.*;
public class AreaOfCircle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of circle");
        int rad = sc.nextInt();
        System.out.println("Area of circle : " + (3.14*rad*rad));
    }
}