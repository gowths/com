package com.toothless.binaysearchtree;

public class BinarySearchTree {

	Node root = null;
	// root= null;

	public void insert(int data) {
		
		root = insert(root, data);
	}

	public Node insert(Node node, int data) {

		if (null == node) {
			node = new Node(data, null, null);

		} else {

			if (node.value > data) {
				// insert towards the left
				node.left = insert(node.left, data);
			}
			if (node.value <= data) {
				// insert towards the right
				node.right = insert(node.right, data);
			}

		}

		return node;

	}

	public boolean search(int data) {
		
		boolean found = false;
		found = search(root, data);
		return found;
	}

	public boolean search(Node node, int data) {

		boolean found = false;

		if (node != null) {
			if (data > node.value) {
				node = node.right;
			} else if (data < node.value) {
				node = node.left;
			} else {
				found = true;
				return found;
			}

			found = search(node, data);
		}
		return found;
	}
	
	
	public void inorder(){

		inorder(root);
	   				
	}
	
	public void inorder (Node node){
		
		if(node != null){
			
			inorder(node.left);
			System.out.println(node.value);
			inorder(node.right);	
		}
		
		return;
	}
	
	
	
	
	//same as for post order and pre order!!
	
	
	
	
	
	
	
	
	
	
	
	

}
