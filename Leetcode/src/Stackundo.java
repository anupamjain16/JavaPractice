import java.util.Stack;

public class Stackundo {

	public static void main(String[] args) {


			 Stack<String> operation = new Stack<String>();
			 
			 operation.push("write A");

			 operation.push("write B");

			 operation.push("write C");

			 operation.push("write D");

			 operation.push("write E");
			 
			 System.out.println(operation.pop());

	}

}
