package com.toothless.binaysearchtree;

public class Node {

	public int value;
	public Node right,left;

	
	public Node(int value, Node right, Node left) {
		this.value = value;
		this.right = right;
		this.left = left;

	}

	public Node() {
		// TODO Auto-generated constructor stub
		
		this.right = null;
		this.left = null;
		this.value = 0;
	}

}
