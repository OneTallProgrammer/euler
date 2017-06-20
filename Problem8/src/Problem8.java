/**
 * Created by joseph on 6/20/17.
 *
 *

 Largest product in a seris

 The four adjacent digits in the 1000-digit number that have the greatest product are 9 × 9 × 8 × 9 = 5832.

    number is in number.txt

 Find the thirteen adjacent digits in the 1000-digit number that have the greatest product. What is the value of this product?

 */
import java.util.*;
import java.io.*;

public class Problem8 {
    public static void main(String[] args) {

        String filePath = "resources/number.txt";

        ArrayList<Integer> digits = readInNumber(filePath);
        int n = 13;
        long product = 1;
        long largestProduct = 1;

        for(int head = 0; head + n < digits.size(); head++){
            product = 1;

            for(int i = head; i < head + n; i++){
                product *= digits.get(i);
            }

            if(product > largestProduct){
                largestProduct = product;
            }
        }

        System.out.println(largestProduct);





    }

    public static ArrayList<Integer> readInNumber(String filePath){
        File number = new File(filePath);
        ArrayList<Integer> digits = new ArrayList<>();

        try {
            Scanner sc = new Scanner(number);
            sc.useDelimiter("");
            while(sc.hasNextInt()){
                digits.add(sc.nextInt());
            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }

        for(int i = 0; i < digits.size(); i++){
            System.out.println(digits.get(i));
        }

        return digits;
    }
}
