public class Main {
    public static void main(String[] args) {
    	
        BinarySearchTree<Integer> bst = new BinarySearchTree<Integer>();
        bst.insert(21);
        bst.insert(10);
        bst.insert(40);
        bst.insert(42);
        bst.insert(31);
        bst.insert(22);
        bst.insert(35);
        System.out.println("Searching for 31: "+bst.search(31)); //31
        System.out.println("The minimum key is: "+bst.minimum()); //10
        System.out.println("The maximum key is: "+bst.maximum()); //42
        System.out.println("The successor of 10 is: "+bst.successor(10)); //21
        System.out.println("The predecessor of 10 is: "+bst.predecessor(10)); //null
        System.out.println("Successor of 22 is " + bst.successor(22)); //31
        System.out.println("Predecessor of 22 is " + bst.predecessor(22)); //21
        System.out.println("The preorder traversal of bst: "+bst.preorder()); // 21 10 40 31 22 35 42
        System.out.println("The inorder traversal of bst: "+bst.inorder()); // 10 21 22 31 35 40 42
        System.out.println("The postorder traversal of bst: "+bst.postorder()); // 10 22 35 31 42 40 21
        System.out.println("The level order traversal of bst: "+bst.levelorder()); //21 10 40 31 42 22 35

        System.out.println("Deleting 31: " + bst.delete(31)); //31
        System.out.println("Deleting 10: " + bst.delete(10)); //10
        System.out.println("Deleting 35: " + bst.delete(35)); //35
        System.out.println("Deleting 8: " + bst.delete(8)); //null

        System.out.println("Searching for 31: " + bst.search(31)); //null
        System.out.println("Searching for 10: " + bst.search(10)); //null

        
        RedBlackTree<Integer> red = new RedBlackTree<Integer>();
       
        red.insert(100);
        red.insert(110);
        red.insert(120);
        red.insert(130);
        red.insert(140);
        red.insert(150);
        red.insert(160);
        red.insert(170);
        red.insert(180);
        red.insert(190);
        red.insert(200);
        red.insert(210);
        red.insert(220);
        red.insert(90);
        red.insert(80);
        red.insert(70);
        red.insert(60);
        red.insert(50);
        red.insert(40);
        red.insert(30);
        red.insert(20);
        red.insert(10);
        
        System.out.println(red.preorder());
        System.out.println(red.inorder());
        System.out.println(red.postorder()); 
        



      //  System.out.println("The preorder traversal of rbt: "+red.preorder()); // 21 10 40 31 22 35 42

    }
}
