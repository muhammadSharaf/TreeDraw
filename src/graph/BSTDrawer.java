package graph;

/**
 * Created by M.Sharaf on 21/03/2018.
 */
abstract class BSTDrawer<T> {
    private int height = 0;

    public abstract T getLeftChild(T node);
    public abstract T getRightChild(T node);
    public abstract Comparable getValue(T node);

    public final void setHeight(int height){
        this.height = height;
    }

    public final void drawTree (T root){
        if (height == 0){
            throw new RuntimeException("Tree Height is not set or equal to ZERO");
        }
        traverse(root);
    }

    private void traverse (T node){
        if (node == null)
            return;

        traverse(getLeftChild(node));
        System.out.printf((getValue(node)).toString());
        traverse(getRightChild(node));
    }
}
