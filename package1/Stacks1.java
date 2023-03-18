package package1;
import java.util.*;
public class Stacks1 {

	public static void main(String[] args) {
		Stack st = new Stack();
		st.push("A");
		st.push('B');
		st.push(3);
		st.push(null);
		
		Iterator itr = st.iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		
		
	}

}
//stack is sub class of vector(c)
//its follows LIFO
//methods of Stack-
	//push-> add element in the stack
	//pop-> delete and return head element
	//peek-> ready to removing (head element)
	//empty()-> check if the stack is empty or not
