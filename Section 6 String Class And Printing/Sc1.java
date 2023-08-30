// 1. check if the email id is of gmail or not
// 2. find username anddomain name from email


public class Sc1 {
    public static void main(String args[]) {
        // 1.
        String str = "hello@gmail.com";

        System.out.println(str.matches(".*@gmail.*"));
        
        // 2.
        String str1 = "username@yahoomail.com";
        int index = str1.indexOf("@");
        String trimmedUsername = str1.substring(0, str1.indexOf("@"));
        String trimmedDomainName = str1.substring(str1.indexOf("@")+1);
        
        System.out.println("Username is " + trimmedUsername);
        System.out.println("Domain is " + trimmedDomainName);
    }
}
