import java.util.*;
import java.lang.*;
class BookShelf 
{
    int slots;


   	 BookShelf(int a)
   	 {
   		slots = a;
     }
}


class Book 
{
	
	String bookname;	
	Book(String bn)
	{
		bookname = bn;
	} 

	HashSet<Integer> storeBook ( String b ,int s ,HashSet<Integer> book)
	{
		//System.out.println(book.isEmpty());
			
		if(book.isEmpty())
		{
			book.add(s);
			System.out.println("stores succesfully");
			return book;
		}		
		
		if(s > 7)
		{
			System.out.println("the slot has exceeded the bookshelf size");
		}
		else if(book.contains(s))
		{
			System.out.println("the slot is already occupied");
		}else
		{
			book.add(s);
			System.out.println("stores succesfully");
		}
		return book;
	}
// takes a bookshelf object and modifies the slots data structure in the object 
// as b.slots[slot] = book.name
		


	public static void main(String[] args) 
	{
		BookShelf b = new BookShelf(7);
		HashSet<Integer> book = new HashSet<Integer>(7);
		//Book bb = new Book();
		//int x  = b.slots;
		Book book1 =new Book("storm and the silence");
		book = book1.storeBook( "storm and the silence", 1 , book);


		Book book2 =new Book("Harry potter");
		//System.out.println("check 0");
		//System.out.println(book);
		book = book2.storeBook( "Harry potter", 2 , book);
		//System.out.println("check 2");

		Book book3 =new Book("The Davinci code ");
		book = book3.storeBook( "The Davinci code ", 2 , book);

		Book book4 =new Book("Art of war");
		book = book4.storeBook( "Art of war", 8 ,book);


	}

}
