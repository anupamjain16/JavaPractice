package leetcode.arrays;

///Fiboachhi with  recursion
public class Fibonacci {

	public static void main(String[] args) {

		System.out.println(fibo(10));
	}

	public static int fibo(int n) {

		if (n < 2)
			return n;

		return fibo(n - 1) + fibo(n - 2);

	}
}
