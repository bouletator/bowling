import java.util.ArrayList;

/**
 * Created by 21504999 on 08/03/2016.
 */
public class ListFrame {
    private ArrayList<Frame> list;


    public ListFrame()
    {
        this.list = new ArrayList<Frame>(10);
    }

    public void add(Frame f)
    {
        this.list.add(f);
    }




    public int calculScore()
    {
        int score = 0;

        for(int i =0; i < this.list.size(); i++)
        {
            if(this.list.get(i).isStrike())
            {
                if(this.list.get(i+1).isStrike() || this.list.get(i+1).isSpare())
                    score += this.list.get(i).calculScore() + this.list.get(i+1).calculScore() + this.list.get(i+2).getScore_lancer_1();
                else
                    score += this.list.get(i).calculScore() + this.list.get(i+1).calculScore();
            }
            else if(this.list.get(i).isSpare())
            {
                if(this.list.get(i+1).isStrike() || this.list.get(i+1).isSpare())
                    score += this.list.get(i).calculScore() + 5;
                else
                    score += this.list.get(i).calculScore() + this.list.get(i+1).getScore_lancer_1();
            }
            else score += this.list.get(i).calculScore();
        }

        return score;
    }
}
