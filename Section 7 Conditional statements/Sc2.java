// Find radix of a number

import java.util.Scanner;

public class SC2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    /*/*   String num;
        num = sc.nextLine();
        if(num.matches("[01]+")) {
            System.out.println("Binary");
        }
        else if(num.matches("[0-7]+")){
            System.out.println("Octal");
        }
        else if(num.matches("[0-9]+")){
            System.out.println("Decimal");
        }
        else if(num.matches("[a-f0-9A-F]+")) {
            System.out.println("Hexa Decimal");
        }
        else {
            System.out.println("Not a valid number");
        }
    */

    // Leap Year
    // Edge case --> 1600, 2000, 2400 --> Leap year
    // Not leap year --> 1700, 1800, 1900
    
    System.out.println("Enter year: ");
    int year = sc.nextInt();
    if (year % 4 == 0) {
      if (year % 100 == 0) {
        if (year % 400 == 0) {
          System.out.println("Leap Year");
        } else {
          System.out.println("Not a Leap Year");
        }
      } else {
        System.out.println("Leap Year");
      }
    } else {
      System.out.println("Not a leap year");
    }
  }
}
