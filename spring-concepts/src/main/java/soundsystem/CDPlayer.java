package soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("sonydx101")
public class CDPlayer {

	private CompactDisk cd;

	public void play(CompactDisk cd) {
		cd.play();
	}

}
