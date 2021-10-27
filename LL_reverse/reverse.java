//package LL_reverse;
public class reverse {
	private static list head;
	private static class list{
		int data;
		list link;
		public list(int data) {
			this.data=data;
			this.link=null;
		}
	}
	public static void main(String[] args) {
		reverse sol = new reverse();
		list h1 = new list(3);
		list h2 = new list(45);
		list h3 = new list(23);
		list h4 = new list(64);
		
		sol.head=h1;
		h1.link = h2;
		h2.link = h3;
		h3.link = h4;
		
		sol.print(head);
		list head1 = sol.rev(head);
		sol.print(head1);
	}
	private list rev(list hd) {
		
		list prev =null,curr = hd , next=null;
		while(curr != null) {
			next=curr.link;
			curr.link = prev;
			prev = curr;
			curr = next;
		}
		return prev;
		
		
	}
	private void print(list head2) {
		if(head2 == null) {
			return;
		}
		list curr = head2;
		while(curr != null) {
			System.out.print(curr.data+" >--> ");
			curr = curr.link;
		}
		System.out.print("null \n");
		
	}

}
