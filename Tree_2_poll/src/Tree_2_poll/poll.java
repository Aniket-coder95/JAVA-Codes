package Tree_2_poll;

import java.util.Iterator;
import java.util.TreeSet;

public class poll {
	public static void main(String[] args) {
		TreeSet<Integer> A = new TreeSet<Integer>();
		A.add(12);
		A.add(32);
		A.add(124);
		A.add(143);
		A.add(13);
		A.add(11);
		A.add(124);
		A.add(134);
		System.out.println("Highest Value: "+A.pollFirst());//and remove it
		System.out.println("Lowest Value: "+A.pollLast());//and remove it
		Iterator<Integer> itr = A.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
