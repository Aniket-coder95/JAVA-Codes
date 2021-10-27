import java.util.*;
import java.lang.*;
import java.io.*;
public class porder {
	private static node root;
	private static class node{
		private node left;
		private node right;
		private int data;
		
		public node(int data) {
			this.data = data;
		}
	}
	//Scanner scan = new Scanner(System.in);
	public void createbt() {
		node first = new node(6);
		node snd = new node(3);
		node thrd = new node(9);
		node forth = new node(2);
		
		root = first;
		root.left = snd;
		root.right =thrd;
		root.left.left =forth;
	}
public void preOrder(node root) {
	if(root == null) {
		return;
	}
	System.out.print(root.data+" ");
	preOrder(root.left);
	preOrder(root.right);
		
	}
public void postOrder(node root) {
	if(root == null) {
		return;
	}
	//System.out.print(root.data+" ");
	preOrder(root.left);
	preOrder(root.right);
	System.out.print(root.data+" ");
		
	}
	
public static void main(String[] args) {
	porder bt = new porder();
	bt.createbt();
	System.out.print("preorder is: ");
	bt.preOrder(bt.root);
	System.out.print("\n ");
	System.out.print("postorder is: ");
	bt.postOrder(bt.root);
	
	
	
}  
} 