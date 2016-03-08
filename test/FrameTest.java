import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by clement on 08/03/2016.
 */
public class FrameTest {

    @Test
    public void testGetScore_lancer_1() throws Exception {
        Frame frame = new Frame(5,6,false,false);
        assertEquals(5, frame.getScore_lancer_1());
    }

    @Test
    public void testGetScore_lancer1Spare(){
        Frame frame = new Frame(5,6,true,false);
        assertEquals(5,frame.getScore_lancer_1());
    }

    @Test
    public void testGetScore_lancer1Strike(){
        Frame frame = new Frame(5, 6, false, true);
        assertEquals(10,frame.getScore_lancer_1());
    }

    @Test
    public void testGetScore_lancer_2() throws Exception {

    }

    @Test
    public void testIsSpare() throws Exception {

    }

    @Test
    public void testIsStrike() throws Exception {

    }

    @Test
    public void testCalculScore() throws Exception {

    }
}