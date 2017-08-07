/**
 * Created by joseph on 6/22/17.
 *
 *
 Summation of Primes

 The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

 Find the sum of all the primes below two million.

 */
import java.lang.Math;
import java.util.ArrayList;

public class Problem10 {
    public static void main(String[] args) {
        int max = 100000000;
        long summation = 2;
        ArrayList<Integer> knownPrimes = new ArrayList<>();
        knownPrimes.add(2);

        for(int i = 3; i < max; i += 2){
            if(isPrime(i, knownPrimes)){
                knownPrimes.add(i);
                System.out.println(i);
                summation += i;
            }
        }

        System.out.println("Sum: " + summation);
    }

    public static boolean isPrime(int number, ArrayList<Integer> knownPrimes){
        boolean isPrime = true;

        for(int i = 0; knownPrimes.get(i) <= Math.sqrt(number); i++){
            if(number % knownPrimes.get(i) == 0){
                return false;
            }
        }

        return isPrime;
    }
}
