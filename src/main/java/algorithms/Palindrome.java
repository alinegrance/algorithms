package algorithms;

import java.util.stream.Collectors;

public class Palindrome {
    public static boolean isPalindromeUsingReverse(String s){
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        String reverseS = sb.toString();
        return reverseS.equals(s);
    }

    public static boolean isPalindromeUsingIteration(String s){
        boolean isPalindrome = true;

        String filtered = s.chars()
                            .filter(c -> Character.isLetterOrDigit((char)c))
                            .mapToObj(c -> Character.toString((char)c))
                            .collect(Collectors.joining());

        System.out.println(filtered);

        for(int i = 0, j = filtered.length()-1; i <= j; i++, j--){
            if(filtered.charAt(i) != filtered.charAt(j)){
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
    }
}
