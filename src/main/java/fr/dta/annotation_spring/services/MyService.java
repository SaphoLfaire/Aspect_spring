package fr.dta.annotation_spring.services;

import org.springframework.stereotype.Service;


@Service
public class MyService {
	
	public MyService() {
		System.out.println("My sysout");
	}
	
	public void doTheJob (String string) {
		System.out.println("do the job !");
		System.out.println(string);
	}

}
