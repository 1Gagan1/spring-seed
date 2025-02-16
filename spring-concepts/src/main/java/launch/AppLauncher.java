package launch;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import beans.Account;
import beans.Customer;
import soundsystem.CDPlayer;
import soundsystem.CompactDisk;
import soundsystem.SidhuMoosewala;

public class AppLauncher {
	
	public static void main(String[] args) {
		System.out.println("Self creating application beans");
		Account selfAccount = new Account("Savings");
		Customer selfCustomer = new Customer("Gagandeep Singh", selfAccount);
		System.out.println("Customer Name is - "+ selfCustomer.getName() + " and Account active is - " + selfCustomer.getAccount().getAccountTypeName());
		
		
		System.out.println("Spring creating application beans");
		ApplicationContext accountApp = new AnnotationConfigApplicationContext(config.AppConfig.class);
		Customer springCustomer = (Customer) accountApp.getBean("customer");
		System.out.println("Customer Name is - "+ springCustomer.getName() + " and Account active is - " + springCustomer.getAccount().getAccountTypeName());
		
		
		ApplicationContext musicApp = new AnnotationConfigApplicationContext(config.CDPlayerConfig.class);
		CompactDisk sidhu = (CompactDisk) musicApp.getBean("5911");
		CompactDisk karan = (CompactDisk) musicApp.getBean("karan");
		CDPlayer sonydx101 = (CDPlayer) musicApp.getBean("sonydx101");
		// springDisk.play();
		sonydx101.play(sidhu);
		sonydx101.play(karan);
		// System.out.println(Arrays.asList(contex2.getBeanDefinitionNames()));
		
	
	}

}
