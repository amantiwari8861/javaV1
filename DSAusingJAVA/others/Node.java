package tree_input;

 class Node
    {
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