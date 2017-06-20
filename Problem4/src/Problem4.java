/**
 * Created by joseph on 6/17/17.
 *
 *
 Largest Palindrome Product

 A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is
 9009 = 91 × 99.

 Find the largest palindrome made from the product of two 3-digit numbers.

 */
public class Problem4 {

    public static void main(String[] args) {
        long largestPal = 0;
        long factor1 = 0;
        long factor2 = 0;

        long upperLim = 9999999;
        long lowerLim = 1000000;

        // iterate through factor 1
        for (long i = upperLim; i >= lowerLim; i--) {
            // if product can't possibly be greater than largest palindrome recorded
            if(i * upperLim < largestPal){
                break;
            }

            // iterate through factor 2
            for (long j = upperLim; j >= i; j--) {
                String IntString = Long.toString(i * j);
                if(i * j < largestPal){
                    break;
                }

                // if current product is a palindrome, check to see if it's the largest so far
                if (isPalindrome(IntString)) {
                    if(i * j > largestPal){
                        factor1 = i;
                        factor2 = j;
                        largestPal = i * j;
                    }
                    break;
                }
            }
        }

        System.out.println("Factor 1: " + factor1 +
                           "\nFactor 2: " + factor2 +
                           "\nPalindrome: " + largestPal);
    }


    public static boolean isPalindrome(String number){
        String[] digits = number.split("(?!^)");

        boolean isPalindrome = true;

        // check pairs starting with front digit and back digit until middle of number is reached
        int front = 0;
        int back = digits.length - 1;

        while(front < back){

            // if a pair of digits don't match, it's not a palindrome
            if(!digits[front].equals(digits[back])){
                isPalindrome = false;
                break;
            }

            front++;
            back--;

        }

        return isPalindrome;
    }
}
