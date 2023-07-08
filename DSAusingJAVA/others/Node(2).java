
package tree_input;
public class Node {
    /* The Node class consists of three data members, the information, reference to the right child, and reference to the left child. */
        public String info;
        public Node lchild;
        public Node rchild;

        public Node(String i, Node l, Node r) /* Constructor for the
        Node class */
        {
            info = i;
            lchild = l;
            rchild = r;
        }
    }    

