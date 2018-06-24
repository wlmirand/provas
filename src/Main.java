public class Main {

    public static void main(String[] args) {
        testeKSmall();
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
