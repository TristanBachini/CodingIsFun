public class AVLTree<E extends Comparable<E>> extends BinarySearchTreeWithRotate<E> {
    private boolean increase, decrease;

    @Override
    public boolean insert(E item) {
    	increase = false;
    	root = insert((AVLNode<E>) root, item);
        return addReturn;
    }
    
    private AVLNode<E> insert(AVLNode<E> root, E item) {
    	if(root == null) {
    		addReturn = true;
    		increase = true;
    		return new AVLNode<E>(item);
    	}
    	int res = item.compareTo((E)root.data);
    	
    	if(res == 0) { //duplicate
    		increase = false;
    		addReturn = false;
    	}
    	else if(res < 0) {
    		root.left = insert((AVLNode<E>) root.getLeftChild(), item);
    		
    		if(increase) {
    			decrement(root);
    			if(root.balance < AVLNode.LEFT_HEAVY) {
    				increase = false;
    				return balanceLeft(root);
    			}
    		}
    	}
    	else {
    		root.right = insert((AVLNode<E>) root.getRightChild(), item);
    		
    		if(increase) {
    			increment(root);
    			if(root.balance > AVLNode.RIGHT_HEAVY) {
    				return balanceRight(root);
    			}
    		}
    	}
    	
    	return root;
    }
    
    private void increment(AVLNode<E> node) {
    	node.balance++;
    	increase = node.balance > AVLNode.BALANCED ? true : false;
    	decrease = node.balance > AVLNode.BALANCED ? false: true;
    }
   
    private void decrement(AVLNode<E> node) {
    	node.balance--;

    	if(node.balance == AVLNode.BALANCED) {
    		increase = false;
    	}
    }
    
    private AVLNode<E> balanceLeft(AVLNode<E> root){
    	AVLNode<E> leftChild = (AVLNode<E>) root.getLeftChild();
    	
    	if(leftChild.balance > AVLNode.BALANCED) {
    		AVLNode<E> leftRight = (AVLNode<E>) leftChild.getRightChild();
    		
    		if(leftRight.balance < AVLNode.BALANCED) {//update their balance factors
    			leftChild.balance = leftRight.balance = AVLNode.BALANCED;
    			root.balance = AVLNode.LEFT_HEAVY;
    		}
    		else {
    			leftChild.balance = AVLNode.LEFT_HEAVY;
    			leftRight.balance = root.balance = AVLNode.BALANCED;
    		}
    		root.left = rotateLeft(leftChild); //rotate left on left child of the root
    	}
    	else {
    		leftChild.balance = root.balance = AVLNode.BALANCED;
    	}
    	
    	return (AVLNode<E>) rotateRight(root);
    }
    
    private AVLNode<E> balanceRight(AVLNode<E> root){
    	AVLNode<E> rightChild = (AVLNode<E>) root.getRightChild();
    	
    	if(rightChild.balance < AVLNode.BALANCED) {
    		AVLNode<E> rightLeft = (AVLNode<E>) root.getRightChild();
    		
    		if(rightLeft.balance > AVLNode.BALANCED) {
    			rightChild.balance = rightLeft.balance = AVLNode.BALANCED;
    			root.balance = AVLNode.LEFT_HEAVY;
    		}
    		else if(rightLeft.balance < AVLNode.BALANCED) {
    			rightChild.balance = AVLNode.RIGHT_HEAVY;
    			rightLeft.balance = root.balance = AVLNode.BALANCED;
    		}
    		else {
    			rightChild.balance = rightLeft.balance = root.balance = AVLNode.BALANCED;
    		}
    		increase = false;
    		decrease = true;
    		
    		root.right = rotateRight(rightChild);
    	}
    	else {
    		rightChild.balance = root.balance = AVLNode.BALANCED;
    		increase = false;
    		decrease = true;
    	}
    	
    	return (AVLNode<E>) rotateLeft(root);
    }
    
    
    @Override
    public E delete(E target){     
    	root = delete((AVLNode<E>)root, target);
    	return deleteReturn;
    }

    private AVLNode<E> delete(AVLNode<E> root, E target) {
    	if(root == null) {
    		deleteReturn = null;
    	}
    	else {
    		int res = target.compareTo((E) root.data);
    		
    		if(res == 0) {
    			deleteReturn = (E) root.data;
    			
    			if(root.left == null && root.right == null) return null;
    			
    			else if(root.left == null) {
    				return (AVLNode<E>) root.getRightChild();
    			}
    			else if(root.right == null) {
    				return (AVLNode<E>) root.getLeftChild();
    			}
    			else if(root.left.right == null) {
    				root.data = root.left.data;
    				root.left = root.left.left;
    				increment(root);
    				
    				if(root.balance > AVLNode.RIGHT_HEAVY) {
    					increase = false;
    					return balanceRight(root);
    				}
    			}
    			else {
    				root.data = rightMostNodeDataDelete((AVLNode<E>) root.getLeftChild(), root);
    				
    				if(decrease) {
    					increment(root);
    					if(root.balance > AVLNode.RIGHT_HEAVY) return balanceLeft(root);
    				}
    			}
    		}
    		
    		else if(res < 0) {
    			root.left = delete((AVLNode<E>) root.getLeftChild(), target);
    			
    			if(decrease) {
    				increment(root);
    				
    				if(root.balance > AVLNode.RIGHT_HEAVY) return balanceRight(root);
    			}
    		}
    		
    		else {
    			root.right = delete((AVLNode<E>) root.getRightChild(), target);
    			
    			if(decrease) {
    				decrement(root);
    				
    				if(root.balance < AVLNode.LEFT_HEAVY) return balanceLeft(root);
    			}
    		}
    	}
    	
    	return root;
    }
    
    private E rightMostNodeDataDelete(AVLNode<E> root, AVLNode<E> parent) {
    	if(root.right == null) {
    		E temp = (E) root.data;
    		root = (AVLNode<E>) root.getLeftChild();
    		decrease = false;
    		
    		if(parent.left == null) {
    			decrease = true;
    			decrement(parent);
    		}
    		parent.right = root;
    		return temp;		
    	}
    	
    	return rightMostNodeDataDelete((AVLNode<E>) root.getRightChild(), root);
    }
    
    public String preorder(){
    	return super.preorder();
    }
    
    public String postorder(){
        return super.postorder();
    }

    public String inorder(){
        return super.inorder();
    }

    private class AVLNode<E> extends BinaryTree.BinaryNode {
        private static final int LEFT_HEAVY = -1;
        private static final int RIGHT_HEAVY = 1;
        private static final int BALANCED = 0;
        private int balance;

        /**
         * Constructor for AVLNode
         *
         * @param data
         *            data to be inserted into new AVLNode
         */
        public AVLNode(E data) {
            super(data);
            balance = BALANCED;
        }
        
        @Override
        public String toString() {
            return super.toString() + "(" + balance + ")";
        }

        @Override
        protected BinaryNode getLeftChild() {
            return super.getLeftChild();
        }

        @Override
        protected BinaryNode getRightChild() {
            return super.getRightChild();
        }
    }


}