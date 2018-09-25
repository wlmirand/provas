import java.util.Arrays;

public class ArrayManipulation {

    /**
     * Starting with a 1-indexed array of zeros and a list of operations,
     * for each operation add a value to each of the array element between two given indices, inclusive.
     * Once all operations have been performed, return the maximum value in your array.
     *
     * For example, the length of your array of zeros N = 10 and your list of queries is as follows:
     * a b k
     * 1 5 3
     * 4 8 7
     * 6 9 1
     *
     * Add the values of 'k' between the indices 'a' and 'b' inclusive:
     * Note the indices are between 1 and N
     * start  -> [0,0,0, 0, 0,0,0,0,0,0]
     * 1st op -> [3,3,3, 3, 3,0,0,0,0,0]
     * 2nd op -> [3,3,3,10,10,7,7,7,0,0]
     * 3rd op -> [3,3,3,10,10,8,8,8,1,0]
     *
     * The largest value after all operation is 10
     *
     * Inputs
     * N   -> length of the Array
     * M   -> number of operations
     * a,b -> index for operations
     * k   -> value for operations
     *
     * Constraints
     * 3 <= N <= 10^7
     * 1 <= M <= 2*10^5
     * 1 <= a <= b <= N
     * 0 <= k <= 10^9
     */
    public long arrayManipulation(int n, int[][] queries) {

        long[] array = new long[n];
        long max = 0;

        for (int[] op : queries) {
            for (int j=op[0]-1 ; j<op[1] ; j++) {
                array[j] += op[2];
                if (array[j] > max) {
                    max = array[j];
                }
            }
        }

        return max;
    }

    public long arrayManipulationOk(int n, int[][] queries) {

        long[] array = new long[n+1];

        for (int[] op : queries) {
            array[op[0]-1] += op[2];
            array[op[1]] -= op[2];
        }

        long max = 0;
        long cumulative = 0;
        for (long val : array) {
            cumulative += val;

            if (cumulative > max) {
                max = cumulative;
            }
        }
        return max;
    }


    public long arrayManipulationTeste(int n, int[][] queries) {
        long[] array = new long[n];

        long maxVal = -1;
        for (int i=0; i<queries.length; i++){
            int a = queries[i][0] - 1;
            int b = queries[i][1] - 1;
            long c = queries[i][2];

            for (int j=a; j<b; j++){
                array[j] += c;
                if (maxVal == -1) maxVal = array[j];
                else if (array[j] > maxVal) maxVal = array[j];
            }
        }

        return maxVal;
    }
}
