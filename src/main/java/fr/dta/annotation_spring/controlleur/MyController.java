package fr.dta.annotation_spring.controlleur;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import fr.dta.annotation_spring.services.MyService;

@Controller
public class MyController {
	
	@Autowired
	private MyService myService;

	public MyService getMyService() {
		return myService;
	}

	public void setMyService(MyService myService) {
		this.myService = myService;
	}
	
	public void doTheJob(String string) {
		myService.doTheJob(string);
	}
	
	public void delete(int a, int b) {
		
		
			System.out.println(a/b);
		
		
	}

	
	
}
