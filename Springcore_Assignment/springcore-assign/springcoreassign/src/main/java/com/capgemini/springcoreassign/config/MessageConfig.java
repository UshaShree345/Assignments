package com.capgemini.springcoreassign.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.capgemini.springcoreassign.bean.MessageBean;
import com.capgemini.springcoreassign.bean.UserBean;
@Configuration
public class MessageConfig {
	
	@Bean
	public MessageBean getMessageBean() {
		
		MessageBean messagebean = new MessageBean();
		messagebean.setId(26);
		
		return messagebean;
	}
	
	@Bean
	public UserBean getUserBean() {
		
		UserBean userbean = new UserBean();
		userbean.setId(26);
		userbean.setName("Usha");
		return userbean;
		
	}
	
	@Bean
	@Primary
	public UserBean getUserBean1() {
		
		UserBean userbean1 = new UserBean();
		userbean1.setId(27);
		userbean1.setName("sony");
		return userbean1;
		
	}


}
