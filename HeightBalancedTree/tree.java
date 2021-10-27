import java.util.*;
class BinaryTree
{
	node root;
	static class node
	{
		int data;
		node left;
		node right;
		node(int rootdata)
		{
			data = rootdata;
			left = null;
			right = null;
		}
	}

	void printtree(node r)
	{
		if(r == null)
			return;
		System.out.print(r.data+"  ");
		printtree(r.left);
		printtree(r.right);
	}

	int treeheight(node rt)
	{
		Queue<node> que = new LinkedList<node>();
		int height = -1;
		if(rt == null)
		{
			return 0;
		}
		que.add(rt);
		while(true)
		{
			int treecount = que.size();
			if(treecount == 0)
			{
				;
				return height;
			}	
			height++;

			while(treecount>0)
			{
				node newnode =que.peek();
				que.remove();
				if(newnode.left != null)
					que.add(newnode.left);
				if(newnode.right != null)
					que.add(newnode.right);
				treecount--;
			}
		}
		//return height;
		
	}


	public static void main(String[] args)
	{
		BinaryTree bt = new BinaryTree();

		node h12 = new node(12);
		node h10 = new node(10);
		node h11 = new node(11);
		node h9 = new node(9);
		node h14 = new node(14);
		node h13 = new node(13);
		node h15 = new node(15);
		node h16 = new node(16);
		node h17 = new node(17);
		//node h18 = new node(18);

		bt.root = h12;
		bt.root.left = h10;
		bt.root.left.left = h9;
		bt.root.left.right = h11;
		bt.root.right = h14;
		bt.root.right.left=h13;
		bt.root.right.right=h15;
		bt.root.right.right.right=h16;
		bt.root.right.right.right.right=h17;
		//bt.root.right.right.right.right.right=h18;
		System.out.println("preorder of the given tree is : ");
		bt.printtree(bt.root);

		int h =bt.treeheight(bt.root);
		System.out.println();
		System.out.println("Height: "+h);

		bt.balanced(bt.root);
		
	}

	void balanced(node ro)
	{
		boolean ret =false;
		int balanceheight;
		BinaryTree bt = new BinaryTree();
		Queue<node> q = new LinkedList<node>();
		q.add(ro);
		
		while(!q.isEmpty())
		{
			balanceheight = 0;
			node x = q.peek();
			int a = bt.treeheight(x.left);
			//System.out.println("left height: "+(a+1));
			int b = bt.treeheight(x.right);
			//System.out.println("right height: "+(b+1));
			if(a>=b)
			{
				balanceheight = a-b;
				//System.out.println("if "+balanceheight);
			}else
			{
				balanceheight = b-a;
				//System.out.println("else "+balanceheight);
			}
			if(balanceheight >1)
			{
				ret=false;
				System.out.println("Not balanced");
				return;
			}else
			{
				ret=true;
			}
			if(x.left != null)
				q.add(x.left);
			if(x.right != null)
				q.add(x.right);
			q.remove(); 
			//System.out.println();
		}
		System.out.println("Is a balanced tree");
	}

	
}
