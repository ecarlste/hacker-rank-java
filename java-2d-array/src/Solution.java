import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }

        System.out.println(findMaxHourglassSumFor2DArray(arr));
    }

    static int findMaxHourglassSumFor2DArray(int[][] array) {
        int maxHourglassSum = Integer.MIN_VALUE;

        for (int row = 1; row < array.length - 1; row++) {
            for (int column = 1; column < array.length - 1; column++) {
                maxHourglassSum = setMaxHourglassSumIfCurrentSumLarger(array, maxHourglassSum, row, column);
            }
        }

        return maxHourglassSum;
    }

    private static int setMaxHourglassSumIfCurrentSumLarger(int[][] array, int maxHourglassSum, int row, int column) {
        int hourglassSum = getHourglassSumFor2DArrayByIndex(array, row, column);
        if (hourglassSum > maxHourglassSum) {
            maxHourglassSum = hourglassSum;
        }
        return maxHourglassSum;
    }

    static int getHourglassSumFor2DArrayByIndex(int[][] array, int row, int column) {
        int hourglassSum = array[row][column];

        for (int i = column - 1; i <= column + 1; i++) {
            hourglassSum += array[row - 1][i];
            hourglassSum += array[row + 1][i];
        }

        return hourglassSum;
    }
}
