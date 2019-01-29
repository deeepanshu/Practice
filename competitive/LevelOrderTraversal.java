import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
        left = null;
        right = null;
    }
}

/*
 * 
 * 3 / \ 9 20 / \ 15 7
 * 
 * [ [3], [20, 9], [15, 7] ]
 */

public class LevelOrderTraversal {
    public static void main(String[] args) {
        // TreeNode a = new TreeNode(3);
        // TreeNode b = new TreeNode(9);
        // TreeNode c = new TreeNode(20);
        // TreeNode d = new TreeNode(15);
        // TreeNode e = new TreeNode(7);
        // a.left = b;
        // a.right = c;
        // b.left = d;
        // b.right = e;
        TreeNode aNode = new TreeNode(20);
        TreeNode bNode = new TreeNode(8);
        TreeNode cNode = new TreeNode(22);
        TreeNode dNode = new TreeNode(4);
        TreeNode eNode = new TreeNode(12);
        TreeNode fNode = new TreeNode(10);
        TreeNode gNode = new TreeNode(14);
        aNode.left = bNode;
        aNode.right = cNode;
        bNode.left = dNode;
        bNode.right = eNode;
        eNode.left = fNode;
        eNode.right = gNode;
        System.out.println("LENGTH: " + zigzagLevelOrder2(aNode).size());
        for (ArrayList<Integer> i : zigzagLevelOrder2(aNode)) {
            for (Integer j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode A) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(A);
        int level = 1;
        while (true) {
            int nodecount = queue.size();
            if (nodecount == 0)
                break;
            ArrayList<Integer> ll = new ArrayList<>();
            while (nodecount > 0) {
                TreeNode a = queue.peek();
                ll.add(a.val);
                queue.remove();
                if (level % 2 == 1) {
                    if (a.right != null)
                        queue.add(a.right);
                    if (a.left != null)
                        queue.add(a.left);
                } else {
                    if (a.left != null)
                        queue.add(a.left);
                    if (a.right != null)
                        queue.add(a.right);
                }
                nodecount--;
            }
            level++;
            list.add(ll);
        }
        return list;
    }

    public static ArrayList<ArrayList<Integer>> zigzagLevelOrder2(TreeNode A) {
        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();
        int f = 0;
        s1.push(A);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        while (true) {
            ArrayList<Integer> ll = new ArrayList<>();
            if (s1.empty() && s2.empty())
                break;
            if (f == 0) {
                while (!s1.empty()) {
                    TreeNode a = s1.pop();
                    ll.add(a.val);
                    // System.out.println(a.val);
                    if (a.left != null)
                        s2.push(a.left);
                    if (a.right != null)
                        s2.push(a.right);
                }
            }
            if (f == 1) {
                while (!s2.empty()) {
                    TreeNode a = s2.pop();
                    ll.add(a.val);
                    // System.out.println(a.val);
                    if (a.right != null)
                        s1.push(a.right);
                    if (a.left != null)
                        s1.push(a.left);
                }
            }
            f = (f + 1) % 2;
            list.add(ll);
        }
        return list;
    }
}