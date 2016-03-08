import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by clement on 08/03/2016.
 */
public class FrameTest {

    @Test
    public void testGetScore_lancer_1() throws Exception {
        Frame frame = new Frame(5,6);
        assertEquals(5, frame.getScore_lancer_1());
    }

    @Test
    public void testGetScore_lancer1Spare(){
        Frame frame = new Frame(5,5);
        assertEquals(5,frame.getScore_lancer_1());
    }

    @Test
    public void testGetScore_lancer1Strike(){
        Frame frame = new Frame(10, 6);
        assertEquals(10,frame.getScore_lancer_1());
    }

    @Test
    public void testGetScore_lancer_2() throws Exception {
        Frame frame = new Frame(5,6);
        assertEquals(6, frame.getScore_lancer_2());
    }

    @Test
    public void testIsSpare() throws Exception {
        Frame frame = new Frame(5,5);
        assert frame.isSpare();
    }

    @Test
    public void testIsStrike() throws Exception {
        Frame frame = new Frame(10,0);
        assert frame.isStrike();
    }

    @Test
    public void testCalculScore() throws Exception {
        Frame frame = new Frame(5,0);
        assertEquals(5, frame.calculScore());
    }

    @Test
    public void testCalculScoreSpare(){
        Frame frame = new Frame(5,5);
        assertEquals(10, frame.calculScore());
    }

    @Test
    public void testCalculScoreStrike(){
        Frame frame = new Frame(10,0);
        assertEquals(10, frame.calculScore());
    }
}