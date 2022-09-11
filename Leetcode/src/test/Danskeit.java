package test;

public class Danskeit {

	public static void main(String[] args) {

		
		//Q print 
		String str = "aba";

		char[] ch = str.toCharArray();

		int i = 0;
		int N = 10;

		while (str.length() < N) {
			str = str + ch[i];
			i++;
			if (i == ch.length) {
				i = 0;
			}
		}

		System.out.println(str);
		
		int res = Integer.MAX_VALUE;
		
		System.out.println(res);
		
          res = Integer.MIN_VALUE;
		
		System.out.println(res);

	}

}
