/**
 * Created by 21504999 on 07/03/2016.
 */
public class Frame {

    private int score_lancer_1;
    private int score_lancer_2;
    private boolean spare;
    private boolean strike;

    Frame(int lancer_1, int lancer_2, boolean spare, boolean strike)
    {
        this.score_lancer_1 = lancer_1;
        this.score_lancer_2 = lancer_2;
        this.spare = spare;
        this.strike = strike;
    }

    public int getScore_lancer_1() {
        return score_lancer_1;
    }

    public int getScore_lancer_2() {
        return score_lancer_2;
    }

    public boolean isSpare() {
        return spare;
    }

    public boolean isStrike() {
        return strike;
    }

    public int calculScore()
    {
        return this.score_lancer_1 + this.score_lancer_2;
    }
}
