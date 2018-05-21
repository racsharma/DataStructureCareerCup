package com.java.careercup.example;

public class SimpleBST {
	Node root;
	
	public SimpleBST()
	{
		root = null;
	}
    
	public void insert(int key)
	{
		root = insertRec(root, key);
		inOrder();
	}
	
	void inOrder()
	{
		inOrderRec(root);
	}
	void inOrderRec(Node root)
	{
		if(root!=null)
		{
			inOrderRec(root.left);
			System.out.println(root.data);
			inOrderRec(root.right);
		}
	}
	Node insertRec(Node root, int key)
	{
		// if the tree is empty , return a new node
		if(root==null)
		{
			root = new Node(key);
			return root;
		}
		// otherwise recur down the tree
		if(key < root.data)
		{
			root.left = insertRec(root.left,key);
		}
		else if(key > root.data)
		{
			root.right = insertRec(root.right, key);
		}
		/*return the node(unchanged) pointer*/
		return root;
	}
 
	public static void main (String args[])
	{
		SimpleBST binarySearchTree = new SimpleBST();
		binarySearchTree.insert(20);
		binarySearchTree.insert(30);
		binarySearchTree.insert(70);
		binarySearchTree.insert(90);
		binarySearchTree.insert(37);
		binarySearchTree.insert(27);
		
	}
}
