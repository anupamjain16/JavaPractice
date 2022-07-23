package DesignPattern;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class main {

	public static void main(String[] args) {

		SingltonDP s = SingltonDP.getInstance();
		SingltonDP s2 = SingltonDP.getInstance();
		SingltonDP s3 = SingltonDP.getInstance();
		
		
		/// EXECUTOR SERVICS
		
		int CourOCunt = Runtime.getRuntime().availableProcessors();
		System.out.println(CourOCunt);
		ExecutorService service = Executors.newFixedThreadPool(CourOCunt);
		//service.execute(); ///new tassk

	}

}
