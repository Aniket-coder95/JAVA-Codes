package Tree_3_head;
import java.util.*;
public class head {
	public static void main(String[] args) {
		TreeSet<Integer> A =new TreeSet<Integer>();
		A.add(1);
		A.add(5);
		A.add(9);
		A.add(3);
		A.add(0);
		A.add(2);
		A.add(6);
		System.out.println("Initial set is:"+A);
		System.out.println("Head set is:"+A.headSet(6));
		System.out.println("subSet is:"+A.subSet(2, 9));
		System.out.println("tailSet is:"+A.tailSet(6,false));//if no false then starts from 6
	}

}
