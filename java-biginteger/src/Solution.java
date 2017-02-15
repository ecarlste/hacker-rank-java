import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

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