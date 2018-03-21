package graph;

import tree.AVLNode;
import tree.AVLTree;

/**
 * Created by M.Sharaf on 21/03/2018.
 */
public class Main {
    public static void main(String[] args) {
        AVLTree tree = new AVLTree();
        for (int i = 0; i < 1000; i++) {
            tree.insert(i);
        }

        BSTDrawer<AVLNode> drawer = new BSTDrawer<AVLNode>() {

            @Override
            public AVLNode getLeftChild(AVLNode node) {
                return node.left;
            }

            @Override
            public AVLNode getRightChild(AVLNode node) {
                return node.right;
            }

            @Override
            public Comparable getValue(AVLNode node) {
                return node.getValue();
            }
        };

    }
}
