package com.techno.loud.springExample;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.SystemPropertyUtils;

public class TestSpring {
    public static void main(String[] args) {
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
    			SpringConfig.class
    	);
        
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());
        
        ClassicalMusic classicalMusic1 = context.getBean("classicalMusic", ClassicalMusic.class);

        context.close();
    }
}
