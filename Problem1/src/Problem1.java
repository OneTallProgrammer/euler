/**
 * Created by joseph on 6/16/17.
 *
 *
 Multiples of 3 and 5

 If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
 The sum of these multiples is 23.

 Find the sum of all the multiples of 3 or 5 below 1000.

 */
public class Problem1 {
    public static void main(String[] args) {
        int sum = 0;
        int upperLim = 1000;

        for(int i = 0; i < upperLim; i++){
            if(i % 3 == 0 || i % 5 == 0){
                sum += i;
            }
        }

        System.out.println("Total: " + sum);
    }
}
