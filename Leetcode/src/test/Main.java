package test;

public class Main {

	/// we have to user super keyword in constructor of child classs and call the parent class
	// contructor
	
	
	public static void main(String[] args) {

		class A {

			int a;

			public A(int i) throws NullPointerException {

				this.a = i;
				System.out.println("A contr called");
			}
			
			
			public void area() throws Exception
			{  
				
				try {
					int i = 5/0;
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}

		}

		class B extends A {

			int b;

			public B(int i, int b) {
				super(i);
				this.b = b;
				System.out.println("B contr called");
			}

			@Override
			 public void area()  throws Exception
			 {
				
			 
			 
			 }; 
			 
			
		}

		A a = new B(2, 3);

	}

}
