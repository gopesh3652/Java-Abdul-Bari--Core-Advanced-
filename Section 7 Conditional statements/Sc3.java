import java.util.Scanner;

// Find the type of website and protocol of website

public class Sc3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter url: ");
        String url = sc.nextLine();
        String protocol = url.substring(0, url.indexOf(":"));

        // Typeo of protocol
        System.out.println("Type of protocol: ");
        if(protocol.equals("http")){
            System.out.println("Hyper Text Transfer Protocol");
        }
        else if(protocol.equals("ftp")) {
            System.out.println("File Transfer Protocol");
        }
        else if(protocol.equals("https")) {
            System.out.println("Secured http");
        }

        // Type of website
        String ext = url.substring(url.lastIndexOf(".")+1z);
        if(ext.equals("com")){
            System.out.println("Commercial");
        }
        else if(ext.equals("org")) {
            System.out.println("organization");
        }
        else if(ext.equals("gov")) {
            System.out.println("government");
        }
    }
}
