package com.instantmessage.springboot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.instantmessage.springboot.services.EmailService;
import com.instantmessage.springboot.services.NotificationService;
import com.instantmessage.springboot.services.TextService;

@Configuration
public class AppConfig {

	@Bean
	public EmailService emailService() {
		return new EmailService();
	}
	
	@Bean
	public TextService textService(){
		return new TextService();
	}
	
	//injecting the dependency
	@Bean
	public NotificationService notification() {
		NotificationService ns = new NotificationService();
		ns.setEmailService(emailService());
		ns.setTextService(textService());
		return ns;
	}		
}
