import java.util.ArrayList;

public class BinarySearchTree<E extends Comparable<E>> extends BinaryTree<E> implements SearchTree<E> {

    protected boolean addReturn;
    protected E deleteReturn;
    public BinaryNode<E> root;


	public boolean insert(E item) {
        root = insertSupport(root, item);
        return addReturn;
        
    }

    protected BinaryNode<E> insertSupport(BinaryNode<E> localRoot, E item){
        if (localRoot == null){
            addReturn = true;
            return new BinaryNode<E>(item);
        } else if(item.compareTo(localRoot.data) == 0) {
            addReturn = false;
        } else if(item.compareTo(localRoot.data) < 0) {
            localRoot.left = insertSupport(localRoot.left, item);
        } else {
            localRoot.right = insertSupport(localRoot.right, item);
        }
        return localRoot;
    }

    public boolean exists(E target) {
        return search(target) != null;
    }

    public E search(E target) {
        return searchSupport(root, target);
    }

    private E searchSupport(BinaryNode<E> localRoot, E target) {
        if (localRoot == null) {
            return null;
        }
        //
        int comparisonResults = target.compareTo(localRoot.data);
        if (comparisonResults == 0)
            return localRoot.data;
        else if (comparisonResults < 0)
            return searchSupport(localRoot.left, target);
        else
            return searchSupport(localRoot.right, target);

    }

    public E delete(E target) {
        root = deleteSupport(root, target);
        return deleteReturn;

    }

    private BinaryNode<E> deleteSupport(BinaryNode<E> localRoot, E target){
        if(localRoot == null){
            deleteReturn = null;
        } else {
            int comparisonResults = target.compareTo(localRoot.data);
            if (comparisonResults == 0) {
                deleteReturn = localRoot.data;
                if (localRoot.left == null && localRoot.right == null) {
                    return null;
                } else if (localRoot.left == null){
                    return localRoot.right;
                } else if (localRoot.right == null){
                    return localRoot.left;
                } else {
                    if (localRoot.left.right == null) {
                        localRoot.left.right = localRoot.right;
                        return localRoot.left;
                    }

                    localRoot.data = rightMostBinaryNodeDataDelete(localRoot, localRoot.left);

                }
            }
            else if(comparisonResults < 0){
                localRoot.left = deleteSupport(localRoot.left, target);
            } else {
                localRoot.right = deleteSupport(localRoot.right, target);
            }
        }
        return localRoot;
    }

    protected E rightMostBinaryNodeDataDelete(BinaryNode<E> root, BinaryNode<E> parentRoot) {
        if (root.right == null){
            root.right = root.left;
            return root.data;
        } else {
            return rightMostBinaryNodeDataDelete(root.right, root);
        }
    }

    public boolean remove(E target){
        return (delete(target) != null);
    }

    public String preorder(){
        StringBuilder preorderTraversal = new StringBuilder();
        preorderSupport(root, preorderTraversal);
        return preorderTraversal.toString();
    }

    protected void preorderSupport(BinaryNode<E> root, StringBuilder preorder){
        if (root != null) {
            preorder.append(root + " ");
            preorderSupport(root.getLeftChild(), preorder);
            preorderSupport(root.getRightChild(), preorder);
        }
    }

    public String inorder() {
        StringBuilder inorderTraversal = new StringBuilder();
        inorderSupport(root, inorderTraversal);
        return inorderTraversal.toString();
    } // end inorder

    public void inorderSupport(BinaryNode<E> root, StringBuilder inorder) {
        if(root != null) {
            inorderSupport(root.getLeftChild(), inorder);
            inorder.append(root + " ");
            inorderSupport(root.getRightChild(), inorder);
        }
    }
    /**
     * Returns a postorder representation of the binary search tree
     *
     * @return postorder string of the binary search tree
     */
    //Complete this method
    public String postorder() {
        StringBuilder postorderTraversal = new StringBuilder();
        postorderSupport(root, postorderTraversal);
        return postorderTraversal.toString();
        //return "";
    } // end postorder

    public void postorderSupport(BinaryNode<E> root, StringBuilder postorder) {
        if(root != null) {
            postorderSupport(root.getLeftChild(), postorder);
            postorderSupport(root.getRightChild(), postorder);
            postorder.append(root + " ");
        }

    }
    public String levelorder(){
        StringBuilder levelorderTraversal = new StringBuilder();
        String levelorder;
        levelorder = levelorderSupport(root, levelorderTraversal);
        return levelorder;
    }

    public String levelorderSupport(BinaryNode<E> root, StringBuilder levelorder){    
        if(root != null) {
        	int height = getHeight(root);
        	
        	for(int i = 0; i <= height; i++) {
        		levelOrderSupp(root, i + 1, levelorder);
        	}
        }
    	
        return levelorder.toString();
    }
    
    private void levelOrderSupp(BinaryNode<E> root, int level, StringBuilder levelorder) {
    	if(root == null) return;
    	
    	if(level == 1) {
    		levelorder.append(root.data + " ");
    		return;
    	}
    	
    	levelOrderSupp(root.getLeftChild(), level - 1, levelorder);
    	levelOrderSupp(root.getRightChild(), level - 1, levelorder);
    }
    public int getHeight(BinaryNode<E> root) {
    	if(root == null) {
    		return -1;
    	}
    	
    	return max(getHeight(root.getLeftChild()), getHeight(root.getRightChild())) + 1;
    }
    private int max(int a, int b) {
    	return a > b ? a : b;
    }

    public BinaryNode<E> minimum(){
    	return minSupport(root);
    }
    
    private BinaryNode<E> minSupport(BinaryNode<E> root) {
    	BinaryNode<E> min = root;
    	if(min != null) {
    		while(min.getLeftChild() != null) {
    			min = min.getLeftChild();
    		}
    	}
    	
    	return min;
    }
    public BinaryNode<E> maximum(){
   	 return maxSupport(root);
   }
   
   private BinaryNode<E> maxSupport(BinaryNode<E> root) {
   	BinaryNode<E> max = root;
   	
   	if(max != null) {
   		while(max.getRightChild() != null) {
   			max = max.getRightChild();
   		}
   	}
   	return max;
   }
    
    

    public BinaryNode<E> successor(E target){
    	return sucSupport(root, null, target);
    }
    
    private BinaryNode<E> sucSupport(BinaryNode<E> root, BinaryNode<E> suc, E target){
    	if(root == null) return null;
    	
    	if(root.data.compareTo(target) == 0) {
    		if(root.getRightChild() != null) {
    			return minSupport(root.getRightChild());
    		}
    	}
    	else if(root.data.compareTo(target) > 0) {
    		suc = root;
    		return sucSupport(root.getLeftChild(), suc, target);
    	}
    	else {
    		return sucSupport(root.getRightChild(), suc, target);
    	}
    	return suc;
    }


    public BinaryNode<E> predecessor(E target){
    	return predSupport(root, null, target);
    }
    
    private BinaryNode<E> predSupport(BinaryNode<E> root, BinaryNode<E> pred, E target){	
    	if(root == null) return null;
    	
    	if(root.data.compareTo(target) == 0) {
    		if(root.getLeftChild() != null) {
    			return maxSupport(root.getLeftChild());
    		}
    	}
    	else if(root.data.compareTo(target) < 0) {
    		pred = root;
    		return predSupport(root.getRightChild(), pred, target);
    	}
    	else {
    		return predSupport(root.getLeftChild(), pred, target);
    	}
    	return pred;
    }



}
