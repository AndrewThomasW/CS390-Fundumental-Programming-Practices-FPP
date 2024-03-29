/**
 * Created by hp on 9/18/2019.
 */
public class MyBST {
    /**The tree root.*/
    private BinaryNode root;

    public MyBST() {
        root = null;
    }
    /**
     * Prints the values in the nodes of the tree
     * in sorted order.
     */
    public void printTree() {
        if (root == null)
            System.out.println("Empty tree");
        else
            //printTree(root);
            //printTreePreOrder(root);
            printTreePostOrder(root);

    }
    private void printTree(BinaryNode t) {
        if (t != null) {
            printTree(t.left);
            System.out.println(t.element);
            printTree(t.right);
        } // An INORDER Traversal
    }

    public void printTreePreOrder(BinaryNode t){

        if(t != null) {
            System.out.println(t.element);
            printTreePreOrder(t.left);
            printTreePreOrder(t.right);
        }
    }
    public void printTreePostOrder(BinaryNode t){
        if(t != null){
            //LRV
            printTreePostOrder(t.left);
            printTreePostOrder(t.right);
            System.out.println(t.element);
        }
    }

    public int countNodes(){


        return countNodes(root);

    }
    private int countNodes(BinaryNode n){
        if(n == null){
            return 0;
        }

         return 1 + countNodes(n.left)+ countNodes(n.right);

    }

    public int countLeaves(){
        return countLeaves(root);
    }
    private int countLeaves(BinaryNode n) {

        if (n == null) return 0;
        if(n.left == null && n.right == null) return 1;

        return countLeaves(n.left) + countLeaves(n.right);
    }

//Assume the data in the Node is an Integer.

    public void insert(Integer x) {
        if (root == null) {
            root = new BinaryNode(x, null, null);
            return;
        }

        BinaryNode n = root;
        boolean inserted = false;

        while (!inserted) {
            if (x.compareTo(n.element) < 0) {
                //space found on the left
                if (n.left == null) {
                    n.left = new BinaryNode(x, null, null);
                    inserted = true;
                }
                //keep looking for a place to insert (a null)
                else {
                    n = n.left;
                }
            } else if (x.compareTo(n.element) > 0) {
                //space found on the right
                if (n.right == null) {
                    n.right = new BinaryNode(x, null, null);
                    inserted = true;
                }
                //keep looking for a place to insert (a null)
                else {
                    n = n.right;
                }
            }
        }

    }
    private class BinaryNode {
        //fields
        private Integer element;// The data in the node
        private BinaryNode left;      // Left child
        private BinaryNode right;     // Right child

        // Constructors
        BinaryNode(Integer theElement) {
            this(theElement, null, null);
        }

        BinaryNode(Integer element,
                   BinaryNode left,
                   BinaryNode right) {
            this.element = element;
            this.left = left;
            this.right = right;
        }


    }
}
































