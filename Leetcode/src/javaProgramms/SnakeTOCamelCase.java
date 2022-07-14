package javaProgramms;

////   convert  snake case to camel case.
//
public class SnakeTOCamelCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "HackerEarth";
		System.out.println(tocamel(str));

	}

	public static String tocamel(String str) {
		String Result = "";
		
		char c = str.charAt(0);
		
		if (Character.isUpperCase(c) == true)
		{
			Result = Result + Character.toLowerCase(c);
		}
		

		for (int i = 1; i < str.length(); i++) {

			char ch = str.charAt(i);

			if (Character.isUpperCase(ch) == true) {
				Result = Result + "_";
				Result = Result + Character.toLowerCase(ch);
			} else {
				Result = Result + str.charAt(i);
			}

		}

		return Result;
	}

}
