package LL_delatlast;

public class Delsol {
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
		Delsol sol = new Delsol();
		list h1 = new list(3);
		list h2 = new list(45);
		list h3 = new list(23);
		list h4 = new list(64);
		
		sol.head=h1;
		h1.next = h2;
		h2.next = h3;
		h3.next = h4;
		
		sol.print(head);
		while (head != null) {
			sol.del();
			sol.print(head);
		}
		//sol.del1();
		//sol.print(head);
	}
	private void del() {
		list curr = head;
		list prev = null;
		while(curr.next != null) {
			prev = curr;
			curr = curr.next;
		}
		prev.next = null;
	}
	private void print(list head2) {
		if(head2 == null) {
			return;
		}
		list curr = head2;
		while(curr != null) {
			System.out.print(curr.data+" >--> ");
			curr = curr.next;
		}
		System.out.print("\n");
		
	}
	private void del1() {
		list temp = head;
		head = head.next;
		temp.next = null;
		
	}


}
