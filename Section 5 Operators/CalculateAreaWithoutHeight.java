import java.util.Scanner;

public class CalculateAreaWithoutHeight {
    public static void main(String args[]) {
            int side_1, side_2, side_3;
            double semiPerimeter, area;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the side of the triangle : ");
            side_1 = sc.nextInt();
            side_2 = sc.nextInt();
            side_3 = sc.nextInt();
            semiPerimeter = (side_1+side_2+side_3)/2d;
            area = Math.sqrt(semiPerimeter*(semiPerimeter-side_1)*(semiPerimeter-side_2)*(semiPerimeter-side_3));
            System.out.println("Area of trinamgle is : " + area);
    }
}
