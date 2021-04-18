package com.techno.loud.springExample;

import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class ClassicalMusic implements Music {
	
	@PostConstruct
	public void doMyInit() {
		System.out.println("init");
	}
	
	@PreDestroy
	public void doMyDestroy() {
		System.out.println("destroy");
	}
	
    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
