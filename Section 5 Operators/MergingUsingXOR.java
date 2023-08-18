// storing to number in a single variable and accessing them
// using bitwise merging and masking

public class MergingUsingXOR {
    public static void main(String args[]) {
        byte a = 9, b = 12;
        byte c;
        c = (byte)(a << 4);  //as the ans will be in int so thats why we are typecasting it to byte
        c = (byte)(c | b);
        System.out.println((c&0b11110000)>>4);
        System.out.println(c&0b00001111);
    }
}