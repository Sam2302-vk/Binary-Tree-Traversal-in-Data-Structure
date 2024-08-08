import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Binarytree tree=new Binarytree(10);
        tree.insertright(tree.root,5);
        tree.insertright(tree.root.right,15);
        tree.insertleft(tree.root,3);
        tree.insertright(tree.root.right.right,8);
        tree.insertleft(tree.root.left,12);



        Binarytree.preorder(tree.root);
        System.out.println();
        Binarytree.inorder(tree.root);
        System.out.println();
        Binarytree.postorder(tree.root);
        System.out.println();
    }
}
