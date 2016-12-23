package com.beanannotation.jsr;

import org.springframework.stereotype.Repository;

@Repository //注解持久层
public class JsrDAO {
	
	public void save() {
		System.out.println("JsrDAO invoked.");
	}
	
}
