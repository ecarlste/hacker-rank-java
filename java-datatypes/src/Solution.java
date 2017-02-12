
import java.util.*;

class Solution {

    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++)
        {
            try
            {
                long x = sc.nextLong();
                outputPrimitiveFitEligibility(x);
            }
            catch(Exception e)
            {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }
        }
    }

    private static void outputPrimitiveFitEligibility(long x) {
        System.out.println(x + " can be fitted in:");
        outputFitEligibilityForByte(x);
        outputFitEligibilityForShort(x);
        outputFitEligibilityForInt(x);
        System.out.println("* long");
    }

    private static void outputFitEligibilityForByte(long x) {
        if (x >= Byte.MIN_VALUE && x <= Byte.MAX_VALUE) {
            System.out.println("* byte");
        }
    }

    private static void outputFitEligibilityForShort(long x) {
        if (x >= Short.MIN_VALUE && x <= Short.MAX_VALUE) {
            System.out.println("* short");
        }
    }

    private static void outputFitEligibilityForInt(long x) {
        if (x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE) {
            System.out.println("* int");
        }
    }

}
