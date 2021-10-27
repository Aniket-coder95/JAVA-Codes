import java.util.LinkedList;
import java.util.Queue;
class solution
{
	node root;
	static class node
	{
		int data;
		node left;
		node right; 
		node(int d)
		{
			data=d;
		}
	}
/************************************************************************/
	/*******Finding height of the Tree*************/
/************************************************************************/
	int findheight(node root)
	{
		int height = 0;
		if(root==null)
			return 0;
		Queue<node> q = new LinkedList<node>();
		q.add(root);

		while(true)
		{
			int nodecount = q.size();
			node newnode = q.peek();
			if(nodecount == 0)
			{
				return height;
			}
			height++;
			while(nodecount >0)
			{
				q.remove();
				if(newnode.left !=null)
					q.add(newnode.left);
				if(newnode.right != null)
					q.add(newnode.right);
				nodecount--;
			}
		}
	}
/************************************************************************/
	/****************Print the Tree*************/
/************************************************************************/
	void printtree(node root, int level)
	{
		for(int i=0 ; i<=level ; i++)
		{
			printme(root,i);
		}
	}
	void printme(node root , int level)
	{
		if(level == 0 && root == null)
			System.out.print("null ");
		else if(level ==0 )
			System.out.print(root.data+" ");
		else if (level>0) 
		{
			printme(root.left, level-1);
			printme(root.right, level-1);	
		}
	}


/************************************************************************/
	/*************Creating nodes of the Tree*************/
/************************************************************************/
	public static void main(String[] args)
	{
		solution sol = new solution();
		
		node h2 = new node(2);
		node h3 = new node(3);
		node h4 = new node(4);
		node h5 = new node(5);
		node h7 = new node(7);
/************************************************************************/
	/***************Creating connections between nodes*************/
/************************************************************************/
		sol.root = h5;
		sol.root.left  = h3;
		sol.root.right = h7;
		sol.root.left.left  = h2;
		sol.root.left.right = h4;
/************************************************************************/
	/*************Finding height of the Tree*************/
/************************************************************************/
		int height = sol.findheight(sol.root);
		System.out.println("height is : "+(height-1));

/************************************************************************/
	/****************Print the Tree*************/
/************************************************************************/
		sol.printtree(sol.root,(height-1));
	}
}