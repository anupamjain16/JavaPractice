package test;

public class Main {

	/// we have to user super keyword in constructor of child classs and call the parent class
	// contructor
	
	
	public static void main(String[] args) {

		class A {

			int a;

			public A(int i) {

				this.a = i;
				System.out.println("A contr called");
			}

		}

		class B extends A {

			int b;

			public B(int i, int b) {
				super(i);
				this.b = b;
				System.out.println("B contr called");
			}

		}

		A a = new B(2, 3);

	}

}
