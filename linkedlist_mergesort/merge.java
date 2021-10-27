import java.util.*;
class linkedlist
{
	node Head;
	static class node
	{
		int data;
		node next;
		node(int a)
		{
			data = a;
			next = null;
		}
	}
	void printList(node Head)
	{
		node x = Head;
		while(x!=null)
		{
			System.out.print(x.data+"-->");
			x=x.next;
		}
		System.out.print("null");
		System.out.println();
	}
	node getMid(node h)
	{
		if(h==null)
			return h;
		node slowptr = h;
		node fastptr = h.next;
		while(fastptr!=null)
		{
			fastptr=fastptr.next;
			if(fastptr!=null)
			{
				slowptr=slowptr.next;
				fastptr=fastptr.next;
			}
		}
		return slowptr;
	}
	node sortedlist(node a, node b)
	{
		node result = null;
		if(a == null)
			return b;
		if(b == null)
			return a;
		if(a.data<=b.data)
		{
			result=a;
			result.next = sortedlist(a.next, b);
		}else
		{
			result=b;
			result.next = sortedlist(a, b.next);
		}
		return result;
	}

	node mergesort(node h)
	{
		if(h == null)
			return h;
		if(h.next == null)
			return h;
		node middle = getMid(h);
		node ntomiddle = middle.next;
		middle.next=null;

		node left = mergesort(h);
		node right = mergesort(ntomiddle);

		node sorted = sortedlist(left,right);
		return sorted;



	}
	public static void main(String[] args) 
	{
		linkedlist ll = new linkedlist();
		node h = new node(9);
		node f = new node(7);
		node s = new node(2);
		node t = new node(5);
		node fo = new node(6);
		ll.Head = h;
		ll.Head.next=f;
		ll.Head.next.next = s;
		ll.Head.next.next.next = t;
		ll.Head.next.next.next.next = fo;

		System.out.println("Unsorted list:");
		ll.printList(ll.Head);

		ll.Head=ll.mergesort(ll.Head);
		System.out.println("Sorted list is:");
		ll.printList(ll.Head);
	}
}