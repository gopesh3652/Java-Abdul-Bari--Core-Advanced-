// odd or even
// person is young or not
// grades for given marks

import java.util.Scanner;

public class Sc1 {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    // odd or even
    System.out.println("Enter number: ");
    int n = sc.nextInt();
    if (n % 2 == 0) {
      System.out.println("Even");
    } else {
      System.out.println("Odd");
    }

    // young or not
    System.out.println("Enter age: ");
    int age = sc.nextInt();
    if(age >= 14 && age <= 55) {
        System.out.println("Young");
    }
    else {
        System.out.println("Not Young");
    }

    // Student grade
    // if else criteria
  }
}
