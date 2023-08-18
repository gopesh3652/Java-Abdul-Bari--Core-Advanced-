import java.util.Scanner;

class CalculateArea {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double base, height, area;
        System.out.println("Enter the dimension of base and height : ");
        base = sc.nextDouble();
        height = sc.nextDouble();
        area = (base*height)/2;
        System.out.println("Area of the triangle is : " + area);
    }
}