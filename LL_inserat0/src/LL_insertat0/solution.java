package LL_insertat0;

import java.util.Scanner;

public class solution {
	private static list head;
	private static class list{
		int data;
		list next;
		public list(int data) {
			this.data=data;
			this.next=null;
		}
	}
	
	public static void main(String[] args) {
		
		solution sol=new solution();
		list h1 =new list(3);
		list h2 =new list(4);
		list h3 =new list(5);
		sol.head = h1;
		h1.next = h2;
		h2.next = h3;
		sol.display(head);
		System.out.print("enter the node to insert at start: ");
		Scanner scan =new Scanner(System.in);
		while(scan.hasNext()) {
			int x =scan.nextInt();
			sol.insertnode(x);
			sol.display(head);
			System.out.print("enter the node to insert: ");
		}
		
	}

	private void display(list head2) {
		if(head2 ==null) {
			return;
		}
		list c=head2;
		while(c != null) {
			System.out.print(c.data+" --> ");
			c=c.next;
		}
		System.out.print("null  \n");
	}

	private void insertnode(int i) {
		list h0 =new list(i);
		h0.next=head;
		head = h0;
	}

}
