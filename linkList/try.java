import java.util.*;
import java.util.Scanner;
class linkedlist
{
	node Head;
	static class node
	{
		int data;
		node next;
		node(int D)
		{
			data = D;
			next = null;
		}
	}
	void Print(node h) //***print all the nodes from given node***
	{
		System.out.println("****************************************************");
		node x = h;
		while(x != null)
		{
			System.out.print(x.data+" --> ");
			x = x.next;
		}
		System.out.print("null \n");
		System.out.println("****************************************************");
		System.out.println();
		System.out.println();
		System.out.println();

	}
	node last() //***Printing last node of linked list***
	{
		node x = Head;
		while(x.next != null)
		{
			x=x.next;
		}
		return x;
	}
	void addnewNode(node NEW) //*** Adding new node at last of list***
	{
		node x = Head;
		while(x.next != null)
		{
			x=x.next;
		}
		x.next = NEW;
	}
	void addAfter(node newnode,node gnode)
	{
		System.out.println("****************************************************");
		System.out.println("Newly Created Linkedlist after adding new node is:");
		node x = Head;
		while(x.data != gnode.data) //finding given node
		{
			x=x.next;
			//System.out.println("hello check "+x.data);
		}
		node link = x.next;
		x.next=newnode;
		newnode.next=link;

	}
	void addBefore(node n_node, node g_node)
	{
		System.out.println("****************************************************");
		System.out.println("Newly Created Linkedlist after adding new node is:");
		node x = Head;
		node prev = x;
		while(x.data != g_node.data) //finding given node
		{
			prev = x;
			x = x.next;
			//System.out.println("hello check "+x.data);
		}
		node link = prev.next;
		prev.next = n_node;
		n_node.next = link;
	}
	void deletenode(node gnode)
	{
		System.out.println("****************************************************");
		System.out.println("Newly Created Linkedlist after deletion of node is:");
		node x = Head;
		node prev = x;
		while(x.data != gnode.data) //finding given node
		{
			prev=x;
			x=x.next;
			//System.out.println("hello check "+x.data);
		}
		
		prev.next=x.next;
		
	}
	void LtoH()
	{
		System.out.println("After making last node as head node");
		node h=Head;
		node hlink = Head.next;
		node x = Head;
		node prev = x;
		if(x.next ==null)
			return;
		while(x.next != null) //finding given node
		{
			prev=x;
			x=x.next;
			//System.out.println("hello prev "+prev.data);
			//System.out.println("hello x "+x.data);
		}
		prev.next=null;
		x.next=Head;
		Head=x;
	}
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		linkedlist ll = new linkedlist();
		node head = new node(5);
		node first = new node(6);
		node second = new node(7);
		node third = new node(8);
		node fourth = new node(9);
		ll.Head=head;
		ll.Head.next = first;
		ll.Head.next.next=second;
		ll.Head.next.next.next=third;
		ll.Head.next.next.next.next=fourth;	
		System.out.println("Created Linkedlist is:");
		ll.Print(ll.Head);
		//***Printing last node of linked list***
		node last = ll.last();
		System.out.println("Last node is: ");
		ll.Print(last);
		//*** Adding new node at last of list***
		node NEW =new node(11);
		ll.addnewNode(NEW);
		ll.Print(ll.Head);
		//***adding new node after given node*** 
		node newnode =new node(12);
		node gnode = new node(8);
		ll.addAfter(newnode, gnode);
		ll.Print(ll.Head);
		//***delete a given node**
		node givnode = new node(6);
		ll.deletenode(givnode);
		ll.Print(ll.Head);
		//***adding new node before given node*** 
		node n_node =new node(78);
		node g_node = new node(8);
		ll.addBefore(n_node, g_node);
		ll.Print(ll.Head);
		//***move last node to first node........
		ll.LtoH();
		ll.Print(ll.Head);
	}
}
