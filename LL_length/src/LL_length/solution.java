package LL_length;
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
		solution sol =new solution();
		list h1=new list(12);
		list h2=new list(14);
		list h3=new list(16);
		list h5=new list(13);
		list h6=new list(17);
		list h7=new list(19);
		list h8=new list(9);
		list h9=new list(22);
		list h10=new list(32);
		list h11=new list(21);
		
		
		sol.head= h1;
		h1.next =h2;
		h2.next =h3;
	
		h3.next =h5;
		h5.next =h6;
		h6.next =h7;
		h7.next =h8;
		h8.next =h9;
		h9.next =h10;
		h10.next =h11;
		
		
		sol.length(head);
		
	}

	private void length(list head2) {
		if(head2 == null) {
			return;
		}
		int count=0;
		list a=head2;
		while(a != null) {
			count++;
			a=a.next;
		}
		System.out.println(count);
	}

}
