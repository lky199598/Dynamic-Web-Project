package com.beanannotation.javabased;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

@Configuration
@ImportResource("classpath:config.xml")
public class StoreConfig
{
	/*@Value("${url}")
	private String url;
	
	@Value("${jdbc.userName}")
	private String userName;
	
	@Value("${password}")
	private String password;
	
	@Bean
	public MyDriverManager myDriverManager()
	{
		return new MyDriverManager(url, userName, password);
	}*/
/*		
	@Bean(name = "storeString")
	@Scope(value ="prototype")
	public Store getStringStore()
	{
		return new StringStore();
	}*/
	
	@Autowired
	private Store<String> s1;
	
	@Autowired
	private Store<Integer> s2;
	
	@Bean
	public IntegerStore integerStore()
	{
		return new IntegerStore();
	}
	
	@Bean
	public StringStore stringStore()
	{
		return new StringStore();
	}
	  
	@Bean(name="stringStoreTest")
	public Store stringStoreTest()
	{ 
		System.out.println(s1.getClass().getName());
		System.out.println(s2.getClass().getName());
		return new StringStore();
	}
	
		
}
