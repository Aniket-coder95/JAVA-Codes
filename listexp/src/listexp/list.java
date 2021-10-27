package listexp;
import java.util.*;
public class list {
	public static void main(String[] args) {
		String[] things1 = {"cream","bread","vegies","rusk","plus"};
		List<String> list1 = new LinkedList<String>();
		
		for (String x: things1) {
			list1.add(x);
		}
		
		String[] things2= {"chair","cooler","fan","utelsils","table"};
		List<String> list2 = new LinkedList<String>();
		for (String y: things2) {
			list2.add(y);
		}
		
		list1.addAll(list2);
		list2 = null;
		
		printlist(list1);
		removestuff(list1 , 2 , 8);
		printlist(list1);
		reverselist(list1);
	}
	private static void printlist(List<String> l ) {
		for(String b: l) {
			System.out.printf(" %s", b);
		}
		System.out.println();
	}
	
	private static void removestuff(List <String> l , int from,  int to){
		l.subList(from, to).clear();
	}
	
	private static void reverselist(List<String> l) {
		ListIterator<String> me = l.listIterator(l.size());
		while(me.hasPrevious()) {
			System.out.printf(" %s ", me.previous());		}
	}
	
}
