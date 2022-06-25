package DesignPattern;

public class SingltonDP {

	private static SingltonDP Instance;

	public static SingltonDP getInstance() {

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



