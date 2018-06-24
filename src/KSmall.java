import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KSmall {

    static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;

        @Override
        public String toString() {
            return String.valueOf(val);
        }
    }

    int count = 0;
    int k;
    int res;

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
            res = node.val;
        }

        inorder(node.right);
    }

}
