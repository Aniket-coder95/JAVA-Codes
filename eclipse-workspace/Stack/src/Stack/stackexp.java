package Stack;

import java.util.Stack;

public class stackexp {
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<Integer>();
		//st.push("{"); for this <Comparable>
		st.push(432);
		st.push(342);
		st.push(4435);
		st.push(142);
		st.push(4452);
		st.push(424);
		st.pop();
		System.out.println("peek: "+st.peek());
		System.out.println("size: "+st.size());
		System.out.println("is empty"+st.isEmpty());
		System.out.println("search 4435 from top: "+st.search(4435));
		System.out.println(st);
	}

}
