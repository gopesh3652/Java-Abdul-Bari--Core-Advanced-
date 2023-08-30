// If an number is binary or not
// hexa or not
// date in thr formst --> (dd/mm/yyyy)

public class Sc2 {
    public static void main(String args[]) {
        // check for binary
        int bin = 1001001;
        String str = String.valueOf(bin);
        System.out.println(str.matches("[01]*"));

        // check for hex
        int hex = 0xab12983;
        String str1 = String.valueOf(hex);
        System.out.println(str1.matches("[A-F0-9]*"));

        // check for date
        String date = "01/10/2003";
        System.out.println(date.matches("[0-3][0-9]/[0|1][0-9]/[0-9]{4}"));
    }
}
