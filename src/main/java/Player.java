import java.util.List;

/**
 * Created by clement on 07/03/2016.
 */
public class Player {

    private ListFrame listFrames;

    public Player(ListFrame f){
        listFrames = f;
    }

    public int getScore(){
        return listFrames.calculScore();
    }
}
