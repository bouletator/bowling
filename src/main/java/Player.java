import java.util.List;

/**
 * Created by clement on 07/03/2016.
 */
public class Player {

    private List<Frame> listFrames;

    public Player(List<Frame> f){
        listFrames = f;
    }

    public int getScore(){
        int sum = 0;
        int strike = 0;
        int nbFrameAfterStrike = 0;
        int spare = 0;
        int nbFrameAfterSpare = 0;
        for(Frame f : listFrames){
            if(f.isStrike()){
                nbFrameAfterStrike = 0;
            }
        }
        return sum;
    }
}
