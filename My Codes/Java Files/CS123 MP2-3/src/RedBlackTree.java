
public class RedBlackTree<E extends Comparable<E>> extends BinarySearchTreeWithRotate<E>{
	RedBlackNode root;
	RedBlackNode parent;
	RedBlackNode tempRoot;
	int num=0;
	int data = 0;
	int findParentNum = 0;
	
	public RedBlackTree() {
        root = null;
    }
	 public RedBlackTree(RedBlackNode<E> root){
	        this.root = root;
	    }

	    public RedBlackTree(E data, RedBlackTree<E> leftTree, RedBlackTree<E> rightTree){
	        root = new RedBlackNode<E>(data);
	        if (leftTree != null){
	            root.left = leftTree.root; 
	        } else {
	            root.left = null;
	        }
	        if (rightTree != null){
	            root.right = rightTree.root;
	        } else {
	            root.right = null;
	        }
	    }

	    public RedBlackTree<E> getLeftSubtree(){
	        if(root != null && root.left != null){
	            return new RedBlackTree<E>(root.left);
	        } else {
	            return null;
	        }
	    }

	    public RedBlackTree<E> getRightSubtree(){
	        if(root != null && root.right != null){
	            return new RedBlackTree<E>(root.right);

	        } else {
	            return null;
	        }
	    }
	
	 protected RedBlackNode<E> insertSupport(RedBlackNode<E> localRoot, E item){
	        if (localRoot == null){
	            addReturn = true;
	            return new RedBlackNode<E>(item);
	        } else if(item.compareTo(localRoot.data) == 0) {
	            addReturn = false;
	        } else if(item.compareTo(localRoot.data) < 0) {
	            localRoot.left = insertSupport(localRoot.left, item);
	        } else {
	            localRoot.right = insertSupport(localRoot.right, item);
	        }
	        return localRoot;
	    }
	
    @Override
    public boolean insert(E item) { 	
    	root =  insertSupport(root, item);
		data = (int) item;
		
		checkRed(root);

    	
		
		
    	if(root.isRed==true) {
    		root.isRed=false;
    	}

    	
        return addReturn;
    }
    
    public void checkRed(RedBlackNode <E> root) {
    	if(root!=null) {
    		int numPrintTest = 0;
    		if(root!=this.root) {
    			findParent(root, this.root);
    		} 		
    		if(root == this.root) {
    			if(root.right!=null) {
    				if(root.right.isRed==true) {
    					if(root.right.right!=null) {
    						if(root.right.right.isRed==true) {
    							if(root.left!=null) {
    								if(root.left.isRed==true) {
    									root.isRed = false;
        								root.left.isRed = false;
        								root.right.isRed = false;
        								checkRed(this.root);
        							} else if (root.left.isRed==false) {
        								RedBlackNode tempStore = null;
        								int yesNull=0;
        								if(root.right.left !=null) {
        									tempStore = root.right.left;
        								} else {
        									yesNull+=1;
        								}
        								RedBlackNode temp = root.right;
        								temp.left = root;
        								root = temp;
        								root.right = temp.right;
        								root.isRed = false;
        								root.right.isRed = true;
        								root.left.isRed = true;
        								if(tempStore!=null) {
        									root.left.right = tempStore;
        									tempStore = null;
        								}
        								this.root = root;
        								checkRed(this.root);	
        							}
    							} else {
    								RedBlackNode tempStore = null;
    								int yesNull=0;
    								int leftLeftNull=0;
    								int leftRightNull = 0;
    								int rightRightNull = 0;
    								if(root.right.left !=null) {
    									tempStore = root.left.right;
    								} else {
    									yesNull+=1;
    								}
    								if(root.left!=null) {
    									if(root.left.left !=null) {
        									leftLeftNull+=1;
        								}
        								if(root.left.right != null) {
        									leftRightNull+=1;
        								}
    								}
    								if(root.right!=null) {
    									if(root.right.right != null) {
        									rightRightNull +=1;
        								}
    								}
    								
    								RedBlackNode temp = root.right;
    								temp.left = root;
    								root = temp;
    								root.right = temp.right;
    								root.isRed = false;
    								root.right.isRed = true;
    								root.left.isRed = true;
    								if(tempStore!=null) {
    									root.right.left = tempStore;
    									tempStore = null;
    								} else if(yesNull!=0) {
    									root.right.left = null;
    									yesNull =0;
    								}
    								if(leftLeftNull==0) {
    									root.left.left = null;
    									leftLeftNull = 0;
    								}
    								if(leftRightNull==0) {
    									root.left.right=null;
    									leftRightNull = 0;
    								}
    								if(rightRightNull==0) {
    									root.right.right = null;
    									rightRightNull=0;
    								}
    								this.root = root;
    								checkRed(this.root);							
    							}
    						}
    					}
    				}
    			}
    			
    			if(root.left!=null) {
    				if(root.left.isRed==true) {
    					if(root.left.left!=null) {
    						if(root.left.left.isRed==true) {
    							if(root.right!=null) {
    								if(root.right.isRed==true) {
    									root.isRed = false;
        								root.left.isRed = false;
        								root.right.isRed = false;
        								checkRed(this.root);
        							} else if (root.right.isRed==false) {
        								RedBlackNode tempStore = null;
        								int yesNull=0;
        								if(root.left.right !=null) {
        									tempStore = root.left.right;
        								} else {
        									yesNull+=1;
        								}
        								RedBlackNode temp = root.left;
        								temp.right = root;
        								root = temp;
        								root.left = temp.left;
        								root.isRed = false;
        								root.right.isRed = true;
        								root.left.isRed = true;
        								if(tempStore!=null) {
        									root.right.left = tempStore;
        									tempStore = null;
        								}
        								this.root = root;
        								checkRed(this.root);	
        							}
    							} else {
    								RedBlackNode tempStore = null;
    								int yesNull=0;
    								int leftLeftNull=0;
    								int leftRightNull = 0;
    								int rightRightNull = 0;
    								if(root.left.right !=null) {
    									tempStore = root.right.left;
    								} else {
    									yesNull+=1;
    								}
    								if(root.right!=null) {
    									if(root.right.right !=null) {
        									leftLeftNull+=1;
        								}
        								if(root.right.left != null) {
        									leftRightNull+=1;
        								}
    								}
    								if(root.left!=null) {
    									if(root.left.left != null) {
        									rightRightNull +=1;
        								}
    								}
    								
    								RedBlackNode temp = root.left;
    								temp.right = root;
    								root = temp;
    								root.left = temp.left;
    								root.isRed = false;
    								root.right.isRed = true;
    								root.left.isRed = true;
    								if(tempStore!=null) {
    									root.left.right = tempStore;
    									tempStore = null;
    								} else if(yesNull!=0) {
    									root.left.right = null;
    									yesNull =0;
    								}
    								if(leftLeftNull==0) {
    									root.right.right = null;
    									leftLeftNull = 0;
    								}
    								if(leftRightNull==0) {
    									root.right.left=null;
    									leftRightNull = 0;
    								}
    								if(rightRightNull==0) {
    									root.left.left = null;
    									rightRightNull=0;
    								}
    								this.root = root;
    								checkRed(this.root);							
    							}
    						}
    					}
    				}
    			}
    			
    		}
    		if(root!=this.root) {
    			 if(root.right!=null ) {
    				 if(root.right.isRed==true) {
    					 if(root.right.right!=null) {
    						 if(root.right.right.isRed==true) {
    							 if(root.left!=null) {
    								 if(root.left.isRed==true) {
    									 root.isRed = true;
    									 root.left.isRed = false;
    									 root.right.isRed = false;
    									 checkRed(this.root);
    								 }else {
    	    								RedBlackNode oldRoot = root;
    	    								RedBlackNode tempStore = null;
    	    								int yesNull=0;
    	     								int leftLeftNull=0;
    	     								int leftRightNull = 0;
    	     								int rightRightNull = 0;
    	     								if(root.right.left !=null) {
    	     									tempStore = root.right.left;
    	     								} else {
    	     									yesNull+=1;
    	     								}
    	     								if(root.left!=null) {
    	     									if(root.left.left !=null) {
    	         									leftLeftNull+=1;
    	         								}
    	         								if(root.left.right != null) {
    	         									leftRightNull+=1;
    	         								}
    	     								}
    	     								if(root.right!=null) {
    	     									if(root.right.right != null) {
    	         									rightRightNull +=1;
    	         								}
    	     								}
    	     								RedBlackNode temp = root.right;
    	     								temp.left = root;
    	     								temp.right = root.right.right;
    	     								root = temp;
    	     								if(parent.right!=null) {
    	     									if(parent.right==oldRoot) {
    	     										parent.right = root;
    	     									} else if(parent.left !=null) {
    	         									if(parent.left ==oldRoot) {
    	             									parent.left = root;
    	             									}
    	             								}
    	     								} else if(parent.left !=null) {
    	     									if(parent.left ==oldRoot) {
    	     									parent.left = root;
    	     									}
    	     								}
    										 if(tempStore!=null) {
    		    									root.left.right = tempStore;
    		    									tempStore = null;
    		    								} else if(yesNull!=0) {
    		    									root.left.right = null;
    		    									yesNull =0;
    		    								}
    		    								
    		    								if(rightRightNull==0) {
    		    									if(root.right!=null) {
    		    										if(root.right.right!=null) {
    		    	    									root.right.right = null;
    		    	    									rightRightNull=0;
    		    										}
    		    									}
    		    									
    		    								}
    		    								
    		    								root.isRed = false;
    		    								root.right.isRed = true;
    		    								root.left.isRed = true;
    		    								checkRed(this.root);
    	    								 
    									 
    								 }
    							 } else {
    								RedBlackNode oldRoot = root;
    								RedBlackNode tempStore = null;
    								int yesNull=0;
     								int leftLeftNull=0;
     								int leftRightNull = 0;
     								int rightRightNull = 0;
     								if(root.right.left !=null) {
     									tempStore = root.right.left;
     								} else {
     									yesNull+=1;
     								}
     								if(root.left!=null) {
     									if(root.left.left !=null) {
         									leftLeftNull+=1;
         								}
         								if(root.left.right != null) {
         									leftRightNull+=1;
         								}
     								}
     								if(root.right!=null) {
     									if(root.right.right != null) {
         									rightRightNull +=1;
         								}
     								}
     								RedBlackNode temp = root.right;
     								temp.left = root;
     								temp.right = root.right.right;
     								root = temp;
     								if(parent.right!=null) {
     									if(parent.right==oldRoot) {
     										parent.right = root;
     									} else if(parent.left !=null) {
         									if(parent.left ==oldRoot) {
             									parent.left = root;
             									}
             								}
     								} else if(parent.left !=null) {
     									if(parent.left ==oldRoot) {
     									parent.left = root;
     									}
     								}
									 if(tempStore!=null) {
	    									root.left.right = tempStore;
	    									tempStore = null;
	    								} else if(yesNull!=0) {
	    									root.left.right = null;
	    									yesNull =0;
	    								}
	    								if(leftLeftNull==0) {
	    									if(root.left!=null)
	    									{
	    										if(root.left.left!=null) {
	    	    									root.left.left = null;
	    	    									leftLeftNull = 0;
	    										}
	    									}
	    									
	    								}
	    								if(leftRightNull==0) {
	    									if(root.left!=null) {
	    										if(root.left.right!=null) {
	    	    									root.left.right=null;
	    	    									leftRightNull = 0;
	    										}
	    									}
	    									
	    								}
	    								if(rightRightNull==0) {
	    									if(root.right!=null) {
	    										if(root.right.right!=null) {
	    	    									root.right.right = null;
	    	    									rightRightNull=0;
	    										}
	    									}
	    									
	    								}
	    								
	    								root.isRed = false;
	    								root.right.isRed = true;
	    								root.left.isRed = true;
	    								checkRed(this.root);
    								 
    							 }
    						 }
    					 }
    				 }
    			 }
    			 if(root.left!=null ) {
    				 if(root.left.isRed==true) {
    					 if(root.left.left!=null) {
    						 if(root.left.left.isRed==true) {
    							 if(root.right!=null) {
    								 if(root.right.isRed==true) {
    									 root.isRed = true;
    									 root.left.isRed = false;
    									 root.right.isRed = false;
    									 checkRed(this.root);
    								 }else {
    	    								RedBlackNode oldRoot = root;
    	    								RedBlackNode tempStore = null;
    	    								int yesNull=0;
    	     								int leftLeftNull=0;
    	     								int leftRightNull = 0;
    	     								int rightRightNull = 0;
    	     								if(root.left.right !=null) {
    	     									tempStore = root.left.right;
    	     								} else {
    	     									yesNull+=1;
    	     								}
    	     								if(root.right!=null) {
    	     									if(root.right.right !=null) {
    	         									leftLeftNull+=1;
    	         								}
    	         								if(root.right.left != null) {
    	         									leftRightNull+=1;
    	         								}
    	     								}
    	     								if(root.left!=null) {
    	     									if(root.left.left != null) {
    	         									rightRightNull +=1;
    	         								}
    	     								}
    	     								RedBlackNode temp = root.left;
    	     								temp.right = root;
    	     								temp.left = root.left.left;
    	     								root = temp;
    	     								if(parent.left!=null) {
    	     									if(parent.left==oldRoot) {
    	     										parent.left = root;
    	     									} else if(parent.right !=null) {
    	         									if(parent.right ==oldRoot) {
    	             									parent.right = root;
    	             									}
    	             								}
    	     								} else if(parent.right !=null) {
    	     									if(parent.right ==oldRoot) {
    	     									parent.right = root;
    	     									}
    	     								}
    										 if(tempStore!=null) {
    		    									root.right.left = tempStore;
    		    									tempStore = null;
    		    								} else if(yesNull!=0) {
    		    									root.right.left = null;
    		    									yesNull =0;
    		    								}
    		    								
    		    								if(rightRightNull==0) {
    		    									if(root.left!=null) {
    		    										if(root.left.left!=null) {
    		    	    									root.left.left = null;
    		    	    									rightRightNull=0;
    		    										}
    		    									}
    		    									
    		    								}
    		    								
    		    								root.isRed = false;
    		    								root.left.isRed = true;
    		    								root.right.isRed = true;
    		    								checkRed(this.root);
    	    								 
    									 
    								 }
    							 } else {
    								RedBlackNode oldRoot = root;
    								RedBlackNode tempStore = null;
    								int yesNull=0;
     								int leftLeftNull=0;
     								int leftRightNull = 0;
     								int rightRightNull = 0;
     								if(root.left.right !=null) {
     									tempStore = root.left.right;
     								} else {
     									yesNull+=1;
     								}
     								if(root.right!=null) {
     									if(root.right.right !=null) {
         									leftLeftNull+=1;
         								}
         								if(root.right.left != null) {
         									leftRightNull+=1;
         								}
     								}
     								if(root.left!=null) {
     									if(root.left.left != null) {
         									rightRightNull +=1;
         								}
     								}
     								RedBlackNode temp = root.left;
     								temp.right = root;
     								temp.left = root.left.left;
     								root = temp;
     								if(parent.left!=null) {
     									if(parent.left==oldRoot) {
     										parent.left = root;
     									} else if(parent.right !=null) {
         									if(parent.right ==oldRoot) {
             									parent.right = root;
             									}
             								}
     								} else if(parent.right !=null) {
     									if(parent.right ==oldRoot) {
     									parent.right = root;
     									}
     								}
									 if(tempStore!=null) {
	    									root.right.left = tempStore;
	    									tempStore = null;
	    								} else if(yesNull!=0) {
	    									root.right.left = null;
	    									yesNull =0;
	    								}
	    								if(leftLeftNull==0) {
	    									if(root.right!=null)
	    									{
	    										if(root.right.right!=null) {
	    	    									root.right.right = null;
	    	    									leftLeftNull = 0;
	    										}
	    									}
	    									
	    								}
	    								if(leftRightNull==0) {
	    									if(root.right!=null) {
	    										if(root.right.left!=null) {
	    	    									root.right.left=null;
	    	    									leftRightNull = 0;
	    										}
	    									}
	    									
	    								}
	    								if(rightRightNull==0) {
	    									if(root.left!=null) {
	    										if(root.left.left!=null) {
	    	    									root.left.left = null;
	    	    									rightRightNull=0;
	    										}
	    									}
	    									
	    								}
	    								
	    								root.isRed = false;
	    								root.right.isRed = true;
	    								root.left.isRed = true;
	    								checkRed(this.root);
    								 
    							 }
    						 }
    					 }
    				 }
    			 }
    		}
    		
    		parent = null;
    		checkRed(root.left);
    		checkRed(root.right);
    		
    	}


    }
    public void findParent(RedBlackNode <E> localRoot, RedBlackNode <E> root){
    	if(root!=null) {
    		findParentNum = 0;
    		RedBlackNode <E> parent = root;
    		if(parent.right == localRoot || parent.left==localRoot) {
    			if(parent.right == localRoot) {
    				this.parent = parent;
    				findParentNum +=1;
    			} else {
        			this.parent = parent;
        			findParentNum+=1;
    			}

    		}
    		if(findParentNum==0) {
    			findParent(localRoot,root.left);
        		findParent(localRoot,root.right);
    		}
    		
    	}
    }

   
    
    @Override
    public String preorder() {
    	
    	StringBuilder preorderTraversal = new StringBuilder();
        preorderSupport(root, preorderTraversal);
        return preorderTraversal.toString() ;
    }

    public void preorderSupport(RedBlackNode<E> root, StringBuilder rbpreorder){
    	if (root != null) {
            rbpreorder.append(root + " ");
            preorderSupport(root.getLeft(), rbpreorder);
            preorderSupport(root.getRight(), rbpreorder);
        }
    }

    public String postorder(){
    	 StringBuilder postorderTraversal = new StringBuilder();
         postorderSupport(root, postorderTraversal);
         return postorderTraversal.toString();
    }
    
    public void postorderSupport(RedBlackNode<E> root, StringBuilder postorder) {
        if(root != null) {
            postorderSupport(root.getLeft(), postorder);
            postorderSupport(root.getRight(), postorder);
            postorder.append(root + " ");
        }

    }

    public String inorder(){
    	StringBuilder inorderTraversal = new StringBuilder();
        inorderSupport(root, inorderTraversal);
        return inorderTraversal.toString();
    }
    public void inorderSupport(RedBlackNode<E> root, StringBuilder inorder) {
        if(root != null) {
            inorderSupport(root.getLeft(), inorder);
            inorder.append(root + " ");
            inorderSupport(root.getRight(), inorder);
        }
    }
    
 /*   
    public void deleteRB(E data) {
    	RedBlackNode k = new RedBlackNode(data);
    	remove(k);
    }
    
    public RedBlackNode<E> treeMinimum(RedBlackNode<E> node){

		// while there is a smaller key, keep going left
		while (node.left!=null) {
			node = node.left;
		}	
		return node;
	}
    
    public RedBlackNode<E> treeSuccessor(RedBlackNode<E> x){

		// if x.left is not nil, call treeMinimum(x.right) and
		// return it's value
		if (x.left!=null ) {
			return treeMinimum(x.right);
		}	

		parent=null;
		findParent(x,this.root);
		//y is parent of x
		

		// while x is it's parent's right child...
		while (parent!=null && x == parent.right){
			// Keep moving up in the tree
			x = parent;
			findParent(parent,this.root);
		}
		// Return successor
		return parent;
	}
    public void remove(RedBlackNode<E> v){

		RedBlackNode<E> z = searchRBNode(v.data);

		// Declare variables
		RedBlackNode<E> x = null;
		RedBlackNode<E> y = null;
		// if either one of z's children is nil, then we must remove z
		if (z.left==null || z.right==null) {
			y = z;
		}
		// else we must remove the successor of z
		else {
			y = treeSuccessor(z);
		}

		// Let x be the left or right child of y (y can only have one child)
		if (y.left!=null) {
			x = y.left;
		}
		else {
			x = y.right;
		}

		parent=null;
		RedBlackNode xParent;
		RedBlackNode yParent;
		findParentNum = 0;
		findParent(x,this.root);
		xParent=this.parent;
		int findParentNumX = findParentNum;
		findParent(y,this.root);
		yParent=this.parent;
		int findParentNumY = findParentNum;
		// link x's parent to y's parent
		xParent = yParent;

		// If y's parent is nil, then x is the root
		if (findParentNumY==0) {
			root = x;	
		}

		// else if y is a left child, set x to be y's left sibling
		else if (yParent.left!=null && yParent.left == y) {
			yParent.left = x;
		}
		// else if y is a right child, set x to be y's right sibling
		else if (yParent.right!=null && yParent.right == y) {
			yParent.right = x;
		}	
		// if y != z, trasfer y's satellite data into z.
		if (y != z){
			z.data = y.data;
		}

		// Update the numLeft and numRight numbers which might need
		// updating due to the deletion of z.key.
		fixNodeData(x,y);

		// If y's color is black, it is a violation of the
		// RedBlackTree properties so call removeFixup()
		if (y.isRed == false)
			removeFixup(x);
	}
    
    private void fixNodeData(RedBlackNode<E> x, RedBlackNode<E> y){

		// Initialize two variables which will help us traverse the tree
		RedBlackNode<E> current = null;
		RedBlackNode<E> track = null;
		RedBlackNode yParent;
		RedBlackNode xParent;
		int findParentNumX;
		int findParentNumY;
		// if x is nil, then we will start updating at y.parent
		// Set track to y, y.parent's child
		if (x==null){
			parent=null;
			findParentNum = 0;
			findParent(y,this.root);
			yParent=this.parent;
			findParentNumY = findParentNum;
			current = yParent;
			track = y;
		}

		// if x is not nil, then we start updating at x.parent
		// Set track to x, x.parent's child
		else{
			parent=null;
			findParentNum = 0;
			findParent(x,this.root);
			xParent=this.parent;
			findParentNumX = findParentNum;
			current = xParent;
			track = x;
		}

		// while we haven't reached the root
		while (current!=null){
			// if the node we deleted has a different key than
			// the current node

			// update track and current
			track = current;
			parent=null;
			findParentNum = 0;
			findParent(y,this.root);
			current = this.parent;

		}

	}
    
    private void rightRotate(RedBlackNode<E> y){

		// Call rightRotateFixup to adjust numRight and numLeft values


        // Perform the rotate as described in the course text.
        RedBlackNode<E> x = y.left;
        RedBlackNode<E> xParent;
        RedBlackNode<E> yParent;
        y.left = x.right;

        // Check for existence of x.right
        if (x.right!=null) {
        	parent=null;
        	findParent(x.right,this.root);
        	parent=y;
        }
        parent=null;
        findParent(x,this.root);
        xParent=this.parent;
        parent=null;
        findParent(y,this.root);
        yParent=this.parent;
        
        xParent = yParent;

        // y.parent is nil
        if (yParent==null) {
        	 root = x;
        }
           

        // y is a right child of it's parent.
        else if (yParent.right == y) {
        	yParent.right=x;
        }

        // y is a left child of it's parent.
        else {
        	yParent.left = x;
        }
        
        x.right = y;

        yParent = x;

	}
    
    private void leftRotate(RedBlackNode<E> x){

		// Call leftRotateFixup() which updates the numLeft
		// and numRight values.

		// Perform the left rotate as described in the algorithm
		// in the course text.
		RedBlackNode<E> y;
		RedBlackNode yLeftParent;
		RedBlackNode xLeftParent;
		y = x.right;
		x.right = y.left;

		// Check for existence of y.left and make pointer changes
		if (y.left!=null) {
			parent=null;
			findParent(y.left,this.root);
			yLeftParent=this.parent;
			yLeftParent=x;
		}
		
		parent=null;
		RedBlackNode xParent;
		RedBlackNode yParent;
		findParentNum = 0;
		findParent(x,this.root);
		xParent=this.parent;
		int findParentNumX = findParentNum;
		findParent(y,this.root);
		yParent=this.parent;
		int findParentNumY = findParentNum;
		yParent = xParent;

		// x's parent is nul
		if (xParent==null) {
			root = y;
		}
		// x is the left child of it's parent
		else if (xParent.left == x) {
			xParent.left = y;
		}

		// x is the right child of it's parent.
		else {
			xParent.right = y;
		}
			

		// Finish of the leftRotate
		y.left = x;
		xParent = y;
	}

	public RedBlackNode<E> searchRBNode(E key){
		// Initialize a pointer to the root to traverse the tree
		RedBlackNode<E> current = root;

		// While we haven't reached the end of the tree
		while (current!=null){

			// If we have found a node with a key equal to key
			if (current.data.equals(key))

				// return that node and exit search(int)
				return current;

			// go left or right based on value of current and key
			else if (current.data.compareTo(key) < 0)
				current = current.right;

			// go left or right based on value of current and key
			else
				current = current.left;
		}

		// we have not found a node whose key is "key"
		return current;


	}
	
	private void removeFixup(RedBlackNode<E> x){

		RedBlackNode<E> w;

		// While we haven't fixed the tree completely...
		while (x != root && x.isRed == false){
			// if x is it's parent's left child
			parent = null;
			RedBlackNode xParent;
			findParent(x,this.root);
			xParent = this.parent;
			if (x == xParent.left){

				// set w = x's sibling
				w = xParent.right;

				// Case 1, w's color is red.
				if (w.isRed == true){
					w.isRed = false;
					xParent.isRed = true;
					leftRotate(xParent);
					w = xParent.right;
				}

				// Case 2, both of w's children are black
				if (w.left.isRed == false &&
							w.right.isRed == false){
					w.isRed = true;
					x = xParent;
				}
				// Case 3 / Case 4
				else{
					// Case 3, w's right child is black
					if (w.right.isRed == false){
						w.left.isRed = false;
						w.isRed = true;
						rightRotate(w);
						w = xParent.right;
					}
					// Case 4, w = black, w.right = red
					w.isRed = xParent.isRed;
					xParent.isRed = false;
					w.right.isRed = false;
					leftRotate(xParent);
					x = root;
				}
			}
			// if x is it's parent's right child
			else{

				// set w to x's sibling
				w = xParent.left;

				// Case 1, w's color is red
				if (w.isRed == true){
					w.isRed = false;
					xParent.isRed = true;
					rightRotate(xParent);
					w = xParent.left;
				}

				// Case 2, both of w's children are black
				if (w.right.isRed == false &&
							w.left.isRed == false){
					w.isRed = true;
					x = xParent;
				}

				// Case 3 / Case 4
				else{
					// Case 3, w's left child is black
					 if (w.left.isRed == false){
						w.right.isRed = false;
						w.isRed = true;
						leftRotate(w);
						w = xParent.left;
					}

					// Case 4, w = black, and w.left = red
					w.isRed = xParent.isRed;
					xParent.isRed = false;
					w.left.isRed = false;
					rightRotate(xParent);
					x = root;
				}
			}
		}// end while

		// set x to black to ensure there is no violation of
		// RedBlack tree Properties
		x.isRed = false;
	}
	*/

    private class RedBlackNode<E> extends BinaryNode<E> {
        public boolean isRed;
        public int num;
        RedBlackNode <E> LeftChild;


        
        public RedBlackNode(E data) {
        	super(data);
        	isRed = true;
        }

        @Override
        public String toString() {
            
 /*           if(isRed){
                return "Red : " + super.toString();
            } else {
                return "Black : " + super.toString();
            }*/
             
        	
        	
            String color = isRed ? "(red)" : "(black)";
            return super.toString() + color;
        }
        /** Reference to the left child */
        protected RedBlackNode<E> left;
        /** Reference to the right child */
        protected RedBlackNode<E> right;
        //Constructors


        /**
         * Construct a node with given data and no
         * children.
         * @param data the data to store in this node.
         */
        // Methods

        /**
         * Return a string representation of the node.
         * @return A string representation of the data fields
         */

        protected RedBlackNode<E> getLeft(){
            return left;
        }
        protected RedBlackNode<E> getRight(){
            return right;
        }
    }


}
