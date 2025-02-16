package soundsystem;

import org.springframework.stereotype.Component;

@Component("5911")
public class SidhuMoosewala implements CompactDisk{

	private String title = "Levels";
	private String artist = "Subhdeep Singh Sidhu";
	public void play() {
		System.out.println("Playing " + title + " by " + artist);
		
	}

}
