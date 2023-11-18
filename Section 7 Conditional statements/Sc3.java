import java.util.Scanner;
// Find the type of website and protocol of website

public class SC3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter url: ");
        String url = sc.nextLine();
        String protocol = url.substring(0, url.indexOf(":"));

        // Type of protocol
        System.out.println("Type of protocol: ");
        switch (protocol) {
            case "http" -> System.out.println("Hyper Text Transfer Protocol");
            case "ftp" -> System.out.println("File Transfer Protocol");
            case "https" -> System.out.println("Secured http");
        }
        // Type of website
        String ext = url.substring(url.lastIndexOf("."));
        switch (ext) {
            case "com" -> System.out.println("Commercial");
            case "org" -> System.out.println("organization");
            case "gov" -> System.out.println("government");
        }
    }
}
