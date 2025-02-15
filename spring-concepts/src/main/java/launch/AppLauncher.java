package launch;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import beans.Account;
import beans.Customer;

public class AppLauncher {
	
	public static void main(String[] args) {
		System.out.println("Self creating application beans");
		Account selfAccount = new Account("Savings");
		Customer selfCustomer = new Customer("Gagandeep Singh", selfAccount);
		System.out.println("Customer Name is - "+ selfCustomer.getName() + " and Account active is - " + selfCustomer.getAccount().getAccountTypeName());
		
		
		System.out.println("Spring creating application beans");
		ApplicationContext context = new AnnotationConfigApplicationContext(config.AppConfig.class);
		Customer springCustomer = (Customer) context.getBean("customer");
		System.out.println("Customer Name is - "+ springCustomer.getName() + " and Account active is - " + springCustomer.getAccount().getAccountTypeName());
		
		
	
	}

}
