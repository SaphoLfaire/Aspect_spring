package fr.dta.annotation_spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.support.AbstractApplicationContext;

import fr.dta.annotation_spring.controlleur.MyController;
import fr.dta.annotation_spring.services.MyService;

/**
 * Hello world!
 *
 */
@Configuration
@ComponentScan
@EnableAspectJAutoProxy
public class App 
{
	
	public App(){
		System.out.println("Start created");
	}
    public static void main( String[] args )
    {
    	AbstractApplicationContext context = new AnnotationConfigApplicationContext(App.class);
        
        MyService my =  context.getBean(MyService.class);
        MyController control = context.getBean(MyController.class);
        
        control.getMyService();
        MyService serv = control.getMyService();
        
        control.doTheJob("mon controler ");
        my.getClass();
        try {
        	control.delete(1, 0);
            control.delete(1, 1);
        }
        catch (ArithmeticException e) {
        	System.out.println("division par 0");
        }
        
                
        my.doTheJob("job done !");
        context.close();
    }
}
