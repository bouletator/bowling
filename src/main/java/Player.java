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
        boolean strike = false;
        int nbFrameAfterStrike = 0;
        boolean spare = false;
        int totalStrike = 0;
        for(Frame f : listFrames){
            if(f.isStrike()){
                nbFrameAfterStrike = 0;
                strike = true;
            }
            else if (f.isSpare()){
                spare = true;
            }
            else {
                if (spare) {
                    sum += 10 + f.getScore_lancer_1();
                    spare = false;
                }
                if (strike && nbFrameAfterStrike == 2) {
                    sum += 10 + totalStrike + f.getScore_lancer_1();
                    strike = false;
                    totalStrike = 0;
                    nbFrameAfterStrike = 0;
                } else if (strike && nbFrameAfterStrike == 1) {
                    totalStrike = f.getScore_lancer_1();
                    nbFrameAfterStrike += 1;
                } else if (strike){
                    totalStrike = f.getScore_lancer_1();
                    nbFrameAfterStrike += 1;
                }
                sum += f.calculScore();
            }
        }
        return sum;
    }
}
