package interviews;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// B ob = new B();

		A ob1 = new D();
		ob1.method1();
		System.out.println(ob1.x);

		String story = "It was a hot summer day. A crow felt very thirsty. He flew here and there in search of water. He could not find water anywhere. As he was flying over a park, he saw a jug with little water in it. The water in the jug was so low that its beak could not  touch it.  He was a  clever crow. He picked up small pieces of stones and put them in a  pitcher. The level of the water started rising. He continued putting pieces of stones in the jug when he saw that water level had risen high up. He drank the water  and flew away.";

		String[] words = story.split(" ");

		System.out.println(words);
		Arrays.sort(words);
		System.out.println(words);
		
		
		
		
		// Different words

		
		
		
//		for (int i = 0; i < words.length; i++) {
//			for (int j = i + 1; j < words.length; j++) {
//				if (words[i] != words[j]) {
//
//				}
//
//			}
//		}

	}
}