package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import beans.Account;
import beans.Customer;

@Configuration
public class AppConfig {
	
	@Bean
	public Account account() {
		return new Account("Saving");
	}
	@Bean
	public Customer customer() {
		return new Customer("Gagandeep Singh", account());
	}
	

}
