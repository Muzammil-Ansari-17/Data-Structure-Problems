package Dsa_Practice.Others;


public class BST {
    public Node root;

    public BST(){
        this.root = null;
    }

    public Node myinsert(Node root, int data){
        if(root == null){
            root = new Node(data);
            return root;
        }
        if(root.data > data){
            root.left = myinsert(root.left,data);
        }
        else{
            root.right = myinsert(root.right,data);
        }
        return root;
    }

    public void insert(int data){
       root = myinsert(root,data);
    }


    public void mysearch(Node root ,int item){
        if(root == null){
            System.out.println("Item not found");
            return;
        }
        if(root.data == item){
            System.out.println("item found");
            return;
        }
        if(item > root.data){
            mysearch(root.right,item);
        }
        if(item < root.data){
            mysearch(root.left , item);
        }
    }

    public void search(int item){
        mysearch(root,item);
    }

    public Node mydelete(Node root ,int item){
        if(root == null){
            System.out.println("Item not found");
            return null;
        }
        else if (root.data > item ) {
            root.left = mydelete(root.left,item);
        }
        else if(root.data < item){
            root.right = mydelete(root.right,item);
        }
        else{
            if(root.left == null && root.right == null){
                return null;
            }
            else if (root.right == null) {
                return root.left;
            }
            else if (root.left == null) {
                return root.right;
            }
            else {
                Node IS = inorderSucessor(root.right);
                root.data = IS.data;

                root.right = mydelete(root.right, IS.data);
            }
        }
        return root;
    }

    public void delete(int item){
       root = mydelete(root,item);
    }

    public Node inorderSucessor(Node root){
        while (root.left != null){
            root = root.left;
        }
        return root;
    }

    public void inorder(Node root){
        if(root != null){
            inorder(root.left);
            System.out.print(" "+root.data);
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        BST obj = new BST();
        obj.insert(22);
        obj.insert(12);
        obj.insert(42);
        obj.insert(1);
        obj.insert(62);
        obj.insert(8);
        obj.inorder(obj.root);

        System.out.println();
        obj.search(1);

        System.out.println();
        obj.delete(99);

        System.out.println();
        obj.inorder(obj.root);


    }
}
