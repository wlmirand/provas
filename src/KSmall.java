import java.util.Stack;

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


    public int kthSmallest2(TreeNode root, int k) {

        int count = 0;
        Stack<TreeNode> stack = new Stack();

        stack.push(root);

        while (count < k) {
            TreeNode topoAtual = stack.peek();
            if (stack.peek().left != null) {
                stack.push(topoAtual.left);
                topoAtual.left = null;

            } else  if (stack.peek().right != null) {
                count++;
                stack.pop();
                stack.push(topoAtual.right);
                topoAtual.right = null;
            } else {
                count++;
                stack.pop();
            }

            if (count == k) {
                return topoAtual.val;
            }
        }

        return 0;
    }
}
