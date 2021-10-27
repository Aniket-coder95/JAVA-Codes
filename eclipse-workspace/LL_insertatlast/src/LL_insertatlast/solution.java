package LL_insertatlast;

import java.util.Scanner;

public class solution {
	private static list head;
	private static class list{
		int data;
		list next;
		private list(int data) {
			this.data=data;
			this.next=null;
		}
	}
	
	public static void main(String[] args) {
		solution sol = new solution();
		list h0 = new list(1);
		list h1 = new list(6);
		list h2 = new list(4);
		list h3 = new list(9);
		sol.head = h0;
		h0.next=h1;
		h1.next=h2;
		h2.next=h3;
		
		sol.print(head);
		System.out.println("enter the node: ");
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()) {
			int z = scan.nextInt();
			sol.insert(z);
			sol.print(head);
			System.out.println("enter the node: ");
		}
		int z = scan.nextInt();
		sol.insert(z);
		sol.print(head);
	}

	private void insert(int i) {
		list newnode = new list(i);
		if(head == null) {
			head = newnode;
		}
		list c = head;
		while(c.next != null) {
			c= c.next;
		}
		c.next=newnode;
		
	}

	private void print(list head2) {
		if(head2 == null) {
			return;
		}
		list curr = head2;
		while(curr != null) {
			System.out.print(curr.data+" --> ");
			curr=curr.next;
		}
		System.out.print("null \n");
		
	}

}
