import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        double r1, r2;
        System.out.println("Enter the values of a, b, and c in  expression ax^2+bx+c respectively : ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        System.out.println("Your expression is " + a + "x^2 + " + b + "x + " + c);
        r1 = (-b + Math.sqrt((b*b) - (4*a*c)))/(2*a);
        r2 = (-b - Math.sqrt((b*b) - (4*a*c)))/(2*a);
        System.out.println("Roots are r1 = " + r1 + " and r2 = " + r2);
        System.out.println("Your expression is (x + (" + r1 + ") )(x + (" + r2 + ") )" );   
    }
}
