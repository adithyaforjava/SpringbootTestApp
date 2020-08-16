package in.nit.runner;

import org.springframework.boot.CommandLineRunner;

public class MessageRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
        
		int k;
		for(k=0;k<=10;k++) {
			System.out.println("Value of K"+k);
		
		}

	}

}
