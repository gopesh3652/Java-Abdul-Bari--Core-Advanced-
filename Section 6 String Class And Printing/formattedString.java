
public class formattedString {
    public static void main(String args[]) {
        int x = 10;
        float y  = 12.5f;
        char z = 'A';
        String str = "Hello World";

        // conversion
        System.out.printf(" \n %d %f %c %s  \n", x, y, z, str);

        // argument_index$
        System.out.printf("\n %1$d %3$c %3$c %4$s %2$f \n", x, y, z, str);

        // width 
        System.out.printf("\n%5d\n", x);
        
        //  flags --> used to fill spaces
        System.out.printf("\n%05d\n", x);

        int a = -10;

        System.out.printf("\n%(5d\n", a);
        
        // .precision
        float b = 12.46f;
        System.out.printf("\n%.2f\n", b);
        float d = 123.45f;
        System.out.printf("\n%6f\n", d);
        System.out.printf("\n%6.2f\n", d);

    }
}
