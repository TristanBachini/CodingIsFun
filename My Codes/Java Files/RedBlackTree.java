public class RedBlackTree<E extends Comparable<E>> extends BinarySearchTreeWithRotate<E>{
	RedBlackNode root;
	RedBlackNode parent;
	RedBlackNode tempRoot;
	RedBlackNode leaf;
	protected RedBlackNode<E> deleteReturn;
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
    
    public void deleteRB(E target) {
    	RedBlackNode <E> toDelete = new RedBlackNode(target);
    	deleteSupportRB(toDelete,this.root);
    }
    public void deleteRightMostNode(RedBlackNode <E> leaf,RedBlackNode <E> root) {
    	if(leaf.right==null) {
    		//contains all diff cases
    		root.data = leaf.data;
    		System.out.println(root);
    		System.out.println(leaf);
    		System.out.println(root.left);
    		System.out.println(root.right);
    		System.out.println(root.left);
    		root.left = null;
    		// case 1
    		if(leaf.isRed) {
    		}
    		
    	} else {
    		deleteRightMostNode(leaf.right, root);
    	}
    }
    public void deleteLeftMostNode(RedBlackNode <E> leaf,RedBlackNode <E> root) {
    	if(leaf.left==null) {
    		//contains all diff cases
    		System.out.println("it works "+leaf+""+root);
    	} else {
    		deleteLeftMostNode(leaf.left, root);
    	}
    }
    
    public void deleteSupportRB(RedBlackNode <E> localRoot, RedBlackNode <E> root) {
    	if(root!=null) {
    		if(root.data==localRoot.data) {
    			if(root.left!=null) {
    				deleteRightMostNode(root.left,localRoot);
    			} else if(root.right !=null) {
    				deleteLeftMostNode(root.right,localRoot);
    			} else {
    				//contains all diff cases
    				System.out.println("It works");
    			}
    			
    		} else if ((int)root.data!=(int)localRoot.data) {
    			deleteSupportRB(localRoot,root.left);
    			deleteSupportRB(localRoot,root.right);
    		}
    	}
    }


    private class RedBlackNode<E> extends BinaryNode<E> {
        public boolean isRed;
        public int num;

        
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
