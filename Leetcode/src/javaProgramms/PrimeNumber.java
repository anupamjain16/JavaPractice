package javaProgramms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrimeNumber {

	public static void main(String[] args) {

		// print all prime no 1 to 100 using strasm;

		// int n = 20;

		// System.out.println(isPrime(n));

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 10, 11, 12, 13);

		// prime no with strams
		List list2 = list.stream().filter(PrimeNumber::isPrime).collect(Collectors.toList());

		System.out.println(list2);

	}

	private static boolean isPrime(int n) {

		for (int i = 2; i * i < n; i++) {

			if (n % i == 0) {

				return false;
			}

		}
		return true;

	}

}
