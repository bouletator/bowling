import java.util.ArrayList;

/**
 * Created by 21504999 on 07/03/2016.
 */
public class Frame {

    private int score_lancer_1;
    private int score_lancer_2;
    private int score_lancer_3;

    Frame(int lancer_1, int lancer_2)
    {
        this.score_lancer_1 = lancer_1;
        this.score_lancer_2 = lancer_2;
    }

    Frame(int lancer_1, int lancer_2, int lancer_3)
    {
        this.score_lancer_1 = lancer_1;
        this.score_lancer_2 = lancer_2;
        this.score_lancer_3 = lancer_3;
    }

    public int getScore_lancer_1() {
        return score_lancer_1;
    }

    public int getScore_lancer_2() {
        return score_lancer_2;
    }

    public int getScore_lancer_3() {
        return score_lancer_3;
    }

    public boolean isSpare() {
        return (this.score_lancer_1 + this.score_lancer_2) == 10;
    }

    public boolean isStrike() {
        return this.score_lancer_1 == 10;
    }

    public int calculScore()
    {
        if(this.isStrike() || this.isSpare()) return 10;
        else return this.score_lancer_1 + this.score_lancer_2;
    }
}
