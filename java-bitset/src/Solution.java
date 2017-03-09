import java.util.BitSet;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int bitSetSize = scanner.nextInt();
        int binaryOperationCount = scanner.nextInt();

        BitSet[] bitSets = new BitSet[2];
        bitSets[0] = new BitSet(bitSetSize);
        bitSets[1] = new BitSet(bitSetSize);

        for (int i = 0; i < binaryOperationCount; i++) {
            String binaryOperationType = scanner.next();
            int arg1 = scanner.nextInt();
            int arg2 = scanner.nextInt();

            switch (binaryOperationType) {
                case "AND":
                    bitSets[arg1 - 1].and(bitSets[arg2 - 1]);
                    break;
                case "OR":
                    bitSets[arg1 - 1].or(bitSets[arg2 - 1]);
                    break;
                case "XOR":
                    bitSets[arg1 - 1].xor(bitSets[arg2 - 1]);
                    break;
                case "FLIP":
                    bitSets[arg1 - 1].flip(arg2);
                    break;
                default:
                    bitSets[arg1 - 1].set(arg2);
                    break;
            }

            System.out.println(bitSets[0].cardinality() + " " + bitSets[1].cardinality());
        }

        scanner.close();

    }
}
