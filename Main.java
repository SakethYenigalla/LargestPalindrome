import java.util.Scanner;
import java.lang.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        LargestPalindrome largestPalindrome = new LargestPalindrome();
        String result = largestPalindrome.find(sc.next());
        System.out.println("Largest Palindrome from a give String:  " + result);
    }
}
