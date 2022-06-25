package interviews;

/// static of parent , statick of child , init constuctor of a ,  init constuctor of b


class classLogic {

	{
		System.out.println("In A init block");
	}
	static {
		System.out.println("In A static block");
	}

	classLogic() {
		System.out.println("In A constructor");
	}

}

class B extends classLogic {
	{
		System.out.println("In B init block");
	}
	static {
		System.out.println("In B static block");
	}

	B() {
		System.out.println("In B constructor");
	}
}


class A {
	  
	  public int x = 5;
	  
	  protected void method1() {
	    System.out.println("In A method1");
	  }
	}

	class D extends A {
	  
	  public int x = 15;
	  
	  public void method1() {
	    System.out.println("In B method1");
	  }
	}

