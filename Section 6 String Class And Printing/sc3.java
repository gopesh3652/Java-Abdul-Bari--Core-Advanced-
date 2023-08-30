// remove special character from a string
// remove extra space from string
// find number of words in a string

public class sc3 {
    public static void main(String args[]) {
        // special characters
        String str1 = "*&bk()34";
        String withoutSpecialChar = str1.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println("String Without special characters: " + withoutSpecialChar);

        // extra space
        String str2 = "*&   b   k(  )3  4";
        String withoutExtraSpace = str1.replaceAll("\\s+", " ");
        System.out.println("Not working..........");   
        System.out.println("String Without Extra Space: " + withoutExtraSpace);   

        // count number of words
        String sentence = "Hello Everyonr how are you.";
        String words[] = sentence.split("\\s");
        System.out.println("Length of string is: " + words.length);
    }
}