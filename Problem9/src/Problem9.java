/**
 * Created by joseph on 6/22/17.
 *
 *
 Special Pythagorean triplet

 A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
 a^2 + b^2 = c^2

 For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.

 There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 Find the product abc.

 */
public class Problem9 {
    public static void main(String[] args) {
        int sum = 1000;
        int a = 0;
        int b = 0;
        int c = 0;

        /*
            Using the mathematical fact that for any Pythagorean triple
            a = m^2 - n^2
            b = 2mn
            c = m^2 + m^2
            The addition of these for any sum s is
            2m^2 + 2mn = s or equivalently m(m + n) = s / 2
         */
        for(int m = 1; m < sum / 2; m++){
            for(int n = 1; n < m; n++){
                if(m*(m + n) == sum / 2){
                    a = m * m - n * n;
                    b = 2*m*n;
                    c = m * m + n * n;
                    break;
                }
                else if(m * (m + n) > sum / 2){
                    break;
                }
            }
        }

        System.out.println("a = " + a + "\n" +
                           "b = " + b + "\n" +
                           "c = " + c + "\n" +
                           "a * b * c = " + a * b * c);
    }
}
