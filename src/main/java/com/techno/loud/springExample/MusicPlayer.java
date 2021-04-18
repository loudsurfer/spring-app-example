package com.techno.loud.springExample;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {

	@Value("${musicPlayer.name}")
	private String name;
	@Value("${musicPlayer.volume}")
	private Integer volume;
	
	private Music music1;
	private Music music2;
	
	
	
	public String getName() {
		return name;
	}

	public Integer getVolume() {
		return volume;
	}

	public MusicPlayer(@Qualifier("rockMusic") Music music1,@Qualifier("classicalMusic") Music music2) {
		this.music1 = music1;
		this.music2 = music2;
	}
	

    public String playMusic() {
        return "Playing: " + music1.getSong() + ", " + music2.getSong();
    }
    
    
}
