import java.util.BitSet;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BitSet[] bitSets = buildBitSetsFromScanner(scanner);
        scanProcessAndPrintResultsForAllBitSetOperations(scanner, bitSets);
        scanner.close();
    }

    private static void scanProcessAndPrintResultsForAllBitSetOperations(Scanner scanner, BitSet[] bitSets) {
        int binaryOperationCount = scanner.nextInt();

        for (int i = 0; i < binaryOperationCount; i++) {
            Solution.BinaryOperation binaryOperation = buildBinaryOperationFromScanner(scanner);

            performBinaryOperationOnBitSets(binaryOperation, bitSets);

            System.out.println(bitSets[0].cardinality() + " " + bitSets[1].cardinality());
        }
    }

    private static BitSet[] buildBitSetsFromScanner(Scanner scanner) {
        int bitSetSize = scanner.nextInt();

        BitSet[] bitSets = new BitSet[2];
        bitSets[0] = new BitSet(bitSetSize);
        bitSets[1] = new BitSet(bitSetSize);
        return bitSets;
    }

    private static Solution.BinaryOperation buildBinaryOperationFromScanner(Scanner scanner) {
        String binaryOperationType = scanner.next();
        int arg1 = scanner.nextInt();
        int arg2 = scanner.nextInt();

        return new Solution.BinaryOperation(binaryOperationType, arg1, arg2);
    }

    private static void performBinaryOperationOnBitSets(Solution.BinaryOperation binaryOperation, BitSet[] bitSets) {
        switch (binaryOperation.getBinaryOperationType()) {
            case "AND":
                bitSets[binaryOperation.getArg1() - 1].and(bitSets[binaryOperation.getArg2() - 1]);
                break;
            case "OR":
                bitSets[binaryOperation.getArg1() - 1].or(bitSets[binaryOperation.getArg2() - 1]);
                break;
            case "XOR":
                bitSets[binaryOperation.getArg1() - 1].xor(bitSets[binaryOperation.getArg2() - 1]);
                break;
            case "FLIP":
                bitSets[binaryOperation.getArg1() - 1].flip(binaryOperation.getArg2());
                break;
            default:
                bitSets[binaryOperation.getArg1() - 1].set(binaryOperation.getArg2());
                break;
        }
    }

    private static class BinaryOperation {
        private String binaryOperationType;
        private int arg1;
        private int arg2;

        BinaryOperation(String binaryOperationType, int arg1, int arg2) {
            this.binaryOperationType = binaryOperationType;
            this.arg1 = arg1;
            this.arg2 = arg2;
        }

        String getBinaryOperationType() {
            return binaryOperationType;
        }

        int getArg1() {
            return arg1;
        }

        int getArg2() {
            return arg2;
        }

    }
}
