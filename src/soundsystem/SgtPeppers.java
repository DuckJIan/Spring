package soundsystem;

import org.springframework.stereotype.Component;

/**
 * Created by zj on 2016/12/7.
 */
@Component
public class SgtPeppers implements CompactDisc{
    private String title = "Sgt. Pepperi Lonely Hearts Club Band";
    private String artist = "The Beatles";
    @Override
    public void play() {
        System.out.println("Playing " + title + " by  " + artist);
    }
}
