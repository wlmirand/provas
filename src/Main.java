public class Main {

    public static void main(String[] args) {
        //testeKSmall();
        //testeBuySellStock();
        testeArrayManipulation();
    }

    private static void testeArrayManipulation() {
        ArrayManipulation am = new ArrayManipulation();

        /*
        int numElem = 5;
        int[][] ops = {
                {1,2,100},
                {2,5,100},
                {3,4,100}
        };
        */


        int numElem = 10;
        int[][] ops = {
                {1,5,3},
                {4,8,7},
                {6,9,1}
        };

        long res = am.arrayManipulationOk(numElem, ops);
        System.out.println(res);
    }

    private static void testeBuySellStock() {
        BuySellStock bss = new BuySellStock();

        //int[] vetor = {7,1,5,3,6,4};
        //int[] vetor = {7,1,5,3,16,4};
        int[] vetor = {1,1,2,3,4,5};
        //int[] vetor = {1,2,3,4,5};
        //int[] vetor = {7,6,4,3,1};

        int profit = bss.maxProfit(vetor);
        System.out.println(profit);
    }

    private static void testeKSmall() {
        KSmall.TreeNode root = new KSmall.TreeNode();
        root.val = 5;

        root.right = new KSmall.TreeNode();
        root.right.val = 6;

        root.left = new KSmall.TreeNode();
        root.left.val = 3;

        root.left.right = new KSmall.TreeNode();
        root.left.right.val = 4;

        root.left.left = new KSmall.TreeNode();
        root.left.left.val = 2;

        root.left.left.left = new KSmall.TreeNode();
        root.left.left.left.val = 1;

        KSmall ksm = new KSmall();

        int res = ksm.kthSmallest(root, 3);
        System.out.println(res);
    }
}
