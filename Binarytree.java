import java.util.*;
/**
 * Binarytree
 */
public class Binarytree {
     Node root;
           class Node{
            int data;
            Node left,right;
            Node(int val){
                data=val;
                left=right=null;
            }
           }
           Binarytree(int value){
               root=new Node(value);
           }
    public static void preorder(Node root) {
        if(root!=null){
             System.out.print(root.data+" ");
             preorder(root.left);
             preorder(root.right);
        }
    }
    public static void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
    }
    public static void postorder(Node root){
        if(root!=null){
            inorder(root.left);
            inorder(root.right);
            System.out.print(root.data+" ");
        }
    }
   
    public void insertleft(Node r,int val){
        Node newNode=new Node(val);
        r.left=newNode;
    }
    public void insertright(Node r,int val){
        Node newNode=new Node(val);
        r.right=newNode;
    }


}
