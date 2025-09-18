public class ReverseString {
    public static void main(String[] args) {
        String text = "Java";
        String rev = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            rev += text.charAt(i);
        }
        System.out.println("Reversed: " + rev);
    }
}
