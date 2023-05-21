class Node
{
    public int iData; // data item (key)
    public double dData; // data item
    public Node leftChild; // this node’s left child
    public Node rightChild; // this node’s right child
    public void displayNode() // display ourself
    {
        System.out.print('{');
        System.out.print(iData);
        System.out.print(", ");
        System.out.print(dData);
        System.out.print("} ");
    }

    public void insert(int id, double dd) {
        Node newNode = new Node(); // make new node
        newNode.iData = id; // insert data
        Node root = new Node();
        newNode.dData = dd;
        if (root == null) // no node in root
            root = newNode;
        else // root occupied
        {
            Node current = new Node(); // start at root
            Node parent;
            while (true) // (exits internally)
            {
                parent = current;
                if (id < current.iData) // go left?
                {
                    current = current.leftChild;
                    if (current == null) // if end of the line,
                    { // insert on left
                        parent.leftChild = newNode;
                        return;
                    }
                } //
                else // or go right?
                {
                    current = current.rightChild;
                    if (current == null) // if end of the line
                    { // insert on right
                        parent.rightChild = newNode;
                        return;
                    }
                } // end else go right
            } // end while
        } // end else not root
    } //
    public Node find(int key) // find node with given key
    {
        Node current = new Node(); // start at root
        while(current.iData != key)
        {
            if(key < current.iData)
                current = current.leftChild;
            else // or go right?
                current = current.rightChild;
            if(current == null)
            return null; }
        return current;
    } // end find()

    public boolean delete(int key) // delete node with given key
    {
        Node root = new Node();
        Node current = root;
        Node parent = root;
        boolean isLeftChild = true;
        while(current.iData != key) // search for node
        {
            parent = current;
            if(key < current.iData) // go left?
            {
                isLeftChild = true;
                current = current.leftChild;
            }
            else // or go right?
            {
                isLeftChild = false;
                current = current.rightChild;
            }
            if(current == null) // end of the line,
                return false; // didn’t find it
        } // end while
        if(current.leftChild==null &&
                current.rightChild==null)
        {
            if(current == root) // if root,
                root = null; // tree is empty
            else if(isLeftChild)
                parent.leftChild = null; // disconnect
            else // from parent
                parent.rightChild = null;
        }
        else if(current.rightChild==null)

        if(current == root)
            root = current.leftChild;
        else if(isLeftChild)
            parent.leftChild = current.leftChild;
        else
            parent.rightChild = current.leftChild;
else if(current.leftChild==null)
        if(current == root)
            root = current.rightChild;
        else if(isLeftChild)
            parent.leftChild = current.rightChild;
        else
            parent.rightChild = current.rightChild;
    else {
        Node successor = new Node();
// connect parent of current to successor instead
        if(current == root)
            root = successor;
        else if(isLeftChild)
            parent.leftChild = successor;
        else
            parent.rightChild = successor;
        successor.leftChild = current.leftChild;
    } // end else two children
        return true;
    } // end delete
} // end class Node


