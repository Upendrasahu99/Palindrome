

import java.util.ArrayList;
import java.util.Locale;

public class Palindrome {
    String input;

    public Palindrome(String input) {
        this.input = input;
    }

    public void checkPalindrome() {
        int count = 0;
        for (int i = 0; i < input.length() / 2; i++) {
            if (input.toLowerCase().charAt(i) == input.toLowerCase().charAt(input.length() - 1 - i)) {
                count++;
            }
        }
        if (count == input.length() / 2) {
            System.out.println("Given input is a Palindrome");
        } else {
            System.out.println("Given input is not a Palindrome");
        }
    }

    public static void main(String[] args) {
        Palindrome input1 = new Palindrome("Tata");
        input1.checkPalindrome();
    }
}
