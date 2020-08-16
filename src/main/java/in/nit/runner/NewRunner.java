package in.nit.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
@Order
public class NewRunner implements CommandLineRunner {
	
	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("This is my second runner file");
		
	}

}
