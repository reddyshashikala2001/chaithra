public class Palindrome {
    public static void main(String[] args) {
        String word = "madam";
        String rev = new StringBuilder(word).reverse().toString();
        if (word.equals(rev))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
