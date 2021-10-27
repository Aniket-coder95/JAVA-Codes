package linkList;

public class solution {
	private static list head;
	private static class list{
		private int data;
		private list next;
		
		public list(int data) {
			this.data=data;
			this.next = null;
		}
		
	}
	public static void main(String[] args) {
		solution sol = new solution();
		list head0 = new list(5);
		list head1 = new list(6);
		list head2 = new list(7);
		list head3 = new list(9);
		list head4 = new list(2);
		sol.head=head0;
		head.next= head1;
		head1.next = head2;
		head2.next=head3;
		head3.next=head4;
		
		sol.display(head);

	}
	private void display(list h2) {
		if(h2 == null) {
			return;
		}
		list current=h2;
		while(current !=null) {
			System.out.print(current.data+"---->");
			current=current.next;
		}
		System.out.print("null");// TODO Auto-generated method stub
		
	}

}
