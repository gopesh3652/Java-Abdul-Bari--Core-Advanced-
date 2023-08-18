import java.util.*;

public class AreaAndVolumeOfCuboid {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int length, breadth, height;
        double  totalArea, volume;
        System.out.println("Enter the lenght, breadth and height of cuboid respectively : ");
        length = sc.nextInt();
        breadth = sc.nextInt();
        height = sc.nextInt();
        totalArea = 2 * ( (length*breadth) + (breadth*height) + (height*length) );
        volume = length * breadth * height;
        System.out.println("Total area is : " + totalArea);
        System.out.println("Volume is : " + volume);
    }
}
