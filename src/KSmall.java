import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class KSmall {

    /**
     * Given a binary search tree, write a function kthSmallest to find the kth smallest element in it.
     */

    /**
     * Tree Node structure
     */
    static class TreeNode {
        public int value;
        public TreeNode left;
        public TreeNode right;

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }

    int count = 0;
    int k;
    int res;

    /**
     * Implementacao Recursiva
     */
    public int kthSmallest(TreeNode root, int k) {

        this.k = k;
        inorder(root);

        return res;
    }

    public void inorder(TreeNode node) {
        if (node == null) {
            return;
        }

        inorder(node.left);

        count++;
        if (k == count) {
            res = node.value;
        }

        inorder(node.right);
    }

    /**
     * Implementacao iterativa
     */
    public int kthSmallest2(TreeNode root, int k) {

        int count = 0;
        Stack<TreeNode> stack = new Stack();

        stack.push(root);

        while (count < k) {
            TreeNode topoAtual = stack.peek();
            if (stack.peek().left != null) {
                stack.push(topoAtual.left);
                topoAtual.left = null;
            } else if (stack.peek().right != null) {
                count++;
                stack.pop();
                stack.push(topoAtual.right);
                topoAtual.right = null;
            } else {
                count++;
                stack.pop();
            }

            if (count == k) {
                return topoAtual.value;
            }
        }

        return 0;
    }

    int cont = 0;
    int myK = 0;
    int myVal = -1;

    public int kthSmallestTeste(TreeNode root, int k) {
        //val.add(root.val);
        myK = k;
        addValue(root);

        return myVal;
    }

    public void addValue(TreeNode obj){
        if (obj.left != null) {
            addValue(obj.left);
        }

        cont++;
        if (cont == myK) {
            myVal = obj.value;
            return;
        }

        if (obj.right != null) {
            addValue(obj.right);
        }
    }
}
