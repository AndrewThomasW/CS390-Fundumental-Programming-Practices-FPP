/**
 * Created by hp on 9/18/2019.
 */
public class Main {
    public static void main(String[] args){
        MyBST bst = new MyBST();

        bst.insert(15);
        bst.insert(12);
        bst.insert(9);
        bst.insert(56);
        bst.insert(1);
        bst.insert(16);
        bst.insert(19);
        bst.insert(22);
        bst.insert(3);
        bst.insert(100);
        bst.insert(2);
        bst.insert(25);


        //bst.printTree();
        System.out.println("number of nodes = " + bst.countNodes());
        System.out.println("number of leaves = " + bst.countLeaves());
    }
}
