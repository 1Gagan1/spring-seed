package soundsystem;

import org.springframework.stereotype.Component;

@Component("karan")
public class KaranAujla implements CompactDisk{

	private String title = "Why they";
	private String artist = "Karan Aujla";
	public void play() {
		System.out.println("Playing " + title + " by " + artist);
		
	}

}
