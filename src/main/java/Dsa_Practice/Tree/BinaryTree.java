package Dsa_Practice.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

    public Node root;

    public BinaryTree() {
        this.root = null;
    }

//    Tree Traversals (Pre, Mid, Post, Level)
//    ⭐ 1. PREORDER (Root → Left → Right)

    public void preOrderTT(Node node) {
        if (node == null) {
            return;
        } else {
            System.out.print(node.data + " ");
            preOrderTT(node.left);
            preOrderTT(node.right);
        }
    }

    //    ⭐ 2. INORDER (Left → Root → Right)
    public void inOrder(Node node) {
        if (node == null) {
            return;
        } else {
            inOrder(node.left);
            System.out.print(node.data + " ");
            inOrder(node.right);
        }
    }

    //    ⭐ 3. POSTORDER (Left → Right → Root)
    public void postOrder(Node node) {
        if (node == null) {
            return;
        } else {
            postOrder(node.left);
            postOrder(node.right);
            System.out.print(node.data + " ");
        }
    }

    //    ⭐ 4. LevelOrder (Print Nodes Row By Row)
    public void LevelOrder(Node node) {
        if (node == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node current = q.remove();
            if (current == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(current.data + " ");
                if (current.left != null) {
                    q.add(current.left);
                }
                if (current.right != null) {
                    q.add(current.right);
                }
            }
        }
    }

    //    Count Of Nodes
    public int CountNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int leftNode = CountNodes(root.left);
        int rightNode = CountNodes(root.right);

        return leftNode + rightNode + 1;
    }

    //    Sum of Nodes
    public int SumNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int leftSum = SumNodes(root.left);
        int rightSum = SumNodes(root.right);

        return leftSum + rightSum + root.data;
    }

    //    Height of Tree
    public int HeightOfTree(Node root) {
        int maxHeight = 0;
        if (root == null) {
            return 0;
        } else {
            int leftHeight = HeightOfTree(root.left);
            int rightHeight = HeightOfTree(root.right);

            if (leftHeight > rightHeight) {
                maxHeight = leftHeight + 1;
            } else {
                maxHeight = rightHeight + 1;
            }
        }
        return maxHeight;
    }

}
