import java.util.Arrays;

public class ArrayManipulation {

    public long arrayManipulation(int n, int[][] queries) {

        long[] array = new long[n];

        for (int[] op : queries) {
            for (int j=op[0]-1 ; j<op[1] ; j++) {
                array[j] += op[2];
            }
        }

        long max = 0;
        for (long i : array) {
            if (i > max) {
                max = i;
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

        System.out.println(Arrays.toString(array));

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

}
