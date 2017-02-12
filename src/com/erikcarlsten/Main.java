
package com.erikcarlsten;

import java.util.*;

class Solution {

    private static List<QueryValue> QueryValues;
    private static int numberOfSeries;

    public static void main(String []argh){
        initQueryValuesFromInput();
        outputSeries();
    }

    private static void initQueryValuesFromInput() {
        Scanner in = new Scanner(System.in);

        initNumberOfSeries(in);
        initQueryValueArrayList();
        readAllQueryValues(in);

        in.close();
    }

    private static void initNumberOfSeries(Scanner in) {
        numberOfSeries = in.nextInt();
    }

    private static void initQueryValueArrayList() {
        QueryValues = new ArrayList<>();
    }

    private static void readAllQueryValues(Scanner in) {
        for(int seriesIndex = 0; seriesIndex < numberOfSeries; seriesIndex++){
            QueryValues.add(new QueryValue(in.nextInt(), in.nextInt(), in.nextInt()));
        }
    }

    private static void outputSeries() {
       for (QueryValue queryValue : QueryValues) {
            outputSeriesForQueryValue(queryValue);
        }
    }

    private static void outputSeriesForQueryValue(QueryValue queryValue) {
        for (int i = 0; i < queryValue.getN(); i++) {
            outputSeriesTermForN(queryValue, i);
        }

        System.out.println();
    }

    private static void outputSeriesTermForN(QueryValue queryValue, int n) {
        int sum = calculateSeriesTermForN(queryValue, n);

        if (n > 0) {
            System.out.print(" ");
        }

        System.out.print(sum);
    }

    private static int calculateSeriesTermForN(QueryValue queryValue, int n) {
        int innerTermSum = 0;
        for (int i = 0; i <= n; i++) {
            innerTermSum += (int) Math.pow(2.0, i);
        }
        innerTermSum *= queryValue.getB();

        return queryValue.getA() + innerTermSum;
    }

    private static class QueryValue {

        private int a;
        private int b;
        private int n;

        private QueryValue(int a, int b, int n) {
            this.a = a;
            this.b = b;
            this.n = n;
        }

        int getA() {
            return a;
        }

        int getB() {
            return b;
        }

        int getN() {
            return n;
        }

        @Override
        public String toString() {
            final String stringSeparator = ",";

            return "(a=" + a + stringSeparator + "b=" + b + stringSeparator + "n=" + n + ")";
        }

    }

}
