package javaProgramms;

public class EnumsUse {

	// private finnal static constants
	// cant extend anything
	// can implements
	// used to creat our own data type

	enum Weeks{

		Monday, tue, wed, fri, sat, sun;

		Weeks() {
			System.out.println("inside the contructor " + this);
		}
	}

	public static void main(String[] args) {

		Weeks week = Weeks.tue;

		System.out.println(week.ordinal());

		System.out.println(week);

	}

}
