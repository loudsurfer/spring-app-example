package com.techno.loud.springExample;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.techno.loud.springExample")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

}
