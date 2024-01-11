package DesignPattern;

//Enhanced Double-Checked Locking (EDCL):

public class SingltonDP {

	private volatile static SingltonDP Instance;

	public   static synchronized SingltonDP getInstance() {

		if (Instance == null)

		{
			Instance = new SingltonDP();
			
			System.out.println("obj created");

		}

		return Instance;
	}

	private SingltonDP() {

		System.out.println("contructor called");
	}

	
	
}



