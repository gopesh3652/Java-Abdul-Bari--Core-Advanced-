public class methodsForStringCreation {
    public static void main(String args[]) {
        // string literal
        String str1 = "hello";
        System.out.println(str1);

        // string object
        String str2 = new String("Java");
        System.out.println(str2);

        // character array
        char c[] = {'A', 'B', 'C'};
        String str3 = new String(c);
        System.out.println(str3);
        
        // Byte array
        byte b[] = {65, 66, 67, 68};
        String str4 = new String(b);
        System.out.println(str4);
        
        
        String str5 = new String(b, 1, 2);
        System.out.println(str5);
        
        // Sting pool checking by compairing references
        // true --> means thy have same reference
        String st = "Java";
        String yt = "Java";
        System.out.println(st == yt);
    }
}