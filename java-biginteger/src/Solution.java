import java.math.BigInteger;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger firstBigInteger = new BigInteger(scanner.next());
        BigInteger secondBigInteger = new BigInteger(scanner.next());

        BigInteger bigIntegerSum = firstBigInteger.add(secondBigInteger);
        BigInteger bigIntegerProduct = firstBigInteger.multiply(secondBigInteger);

        System.out.println(bigIntegerSum);
        System.out.println(bigIntegerProduct);

        scanner.close();
    }

}