package soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by zj on 2016/12/7.
 */
@Component
public class CDPlayer implements MediaPlayer {
    private CompactDisc cd;
    @Autowired
    public CDPlayer(CompactDisc cd){
        this.cd = cd;
    }
    @Override
    public void play() {
        cd.play();
    }
}
