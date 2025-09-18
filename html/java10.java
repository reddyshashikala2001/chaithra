import java.util.*;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int secret = (int)(Math.random() * 10) + 1;
        System.out.print("Guess a number (1-10): ");
        int guess = sc.nextInt();
        if (guess == secret)
            System.out.println("Correct! 🎉");
        else
            System.out.println("Wrong! The number was " + secret);
    }
}
