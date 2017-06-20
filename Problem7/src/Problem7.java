/**
 * Created by joseph on 6/18/17.
 *
 *
 10001st prime

 By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

 What is the 10001st prime number?

 */
import java.util.ArrayList;
import java.lang.Math;

public class Problem7 {
    public static void main(String[] args) {
        int n = 10001;

        ArrayList<Long> primes = new ArrayList<>();
        primes.add((long)2);

        for(int i = 1; i < n; i++){
            for(long j = primes.get(i - 1) + 1; j > 0; j++){
                if(isPrime(primes, j)){
                    primes.add(j);
                    break;
                }
            }
        }

        System.out.println(primes.get(primes.size() - 1));
    }

    public static boolean isPrime(ArrayList<Long> primes, long number){
        boolean isPrime = true;

        for(int i = 0; primes.get(i) <= Math.sqrt(number); i++){

            if(number % primes.get(i) == 0){
                isPrime = false;
                break;
            }
        }

        return isPrime;
    }
}
