/**
 * Created by joseph on 6/16/17.
 */

import java.lang.Math;

public class Problem3 {
    public static void main(String[] args) {
        long number = 9223372036854755807L;
        //System.out.println(isPrime(2322476001719L));

        System.out.println(getLargestPrimeFactor(number));
    }

    public static boolean isPrime(long number){
        boolean isPrime = true;

        if(number % 2 == 0){
            return false;
        }
        for(int i = 3; i <= Math.sqrt(number); i+=2){
            if(number % i == 0){
                isPrime = false;
                break;
            }
        }

        return isPrime;
    }

    public static long getLargestPrimeFactor(long number){
        if(number % 2 == 0){
            number = number / 2;
        }
        for(int i = 3; i < Math.sqrt(number); i += 2){
            if(isPrime(i)){
                if(number % i == 0){

                    number = number / i;
                    System.out.println("Small Factor: " + i + " Large Factor: " + number);
                    i -= 2;
                }
            }
        }

        return number;
    }
}
