package in.nit.adithya.controller;

import java.util.Random;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class MessageRestController {
	
	 @GetMapping("/show")
	 public ResponseEntity<String> showMsg(){
		 
		 ResponseEntity<String> res = null;
		 
		 int id = new Random().nextInt(100);
		 try {
			 
			 if(id<=0) {
				 
					res = new ResponseEntity<String>("Invalid User Requeest", HttpStatus.BAD_REQUEST);
				 } else {
					 
					 res = new ResponseEntity<String>("Request OK", HttpStatus.CREATED);
				
				 }
			 
		 }catch (Exception e) {
			 
			 e.printStackTrace();
			 res = new ResponseEntity<String>("INternal Server Error", HttpStatus.INTERNAL_SERVER_ERROR);
		
		}
	
		 return res;
	 }

}
