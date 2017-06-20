/**
 * Created by joseph on 6/17/17.
 *
 *
 Smallest Multiple

 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

 What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

 */
import java.util.ArrayList;

public class Problem5 {
    public static void main(String[] args) {
        int n = 20; // the result should be divisible by all numbers 1 - n
        long product = 1;

        ArrayList<Integer> factors = new ArrayList<>();

        // find the set of prime factors that will result in a number divisible by every number 1 - n
        for(int i = 2; i < n; i++){
            int factor = i;
            for(int j = 0; j < factors.size(); j++){
                // if a number is divisible by a factor already found, that factor need not be considered again
                // ex. 2 * 5 makes 10, but both these numbers were found earlier in this process
                if(i % factors.get(j) == 0){
                    factor = factor / factors.get(j);
                }
            }
            // only include the factors that are greater than 1
            if(factor > 1){
                factors.add(factor);
            }
        }

        // multiply the prime factors together to obtain the final result
        for(int i = 0; i < factors.size(); i++){
            product *= factors.get(i);
        }

        System.out.println(product);
    }
}
