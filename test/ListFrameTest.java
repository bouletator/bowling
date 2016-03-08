import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by clement on 08/03/2016.
 */
public class ListFrameTest {

    @Test
    public void testCalculScore() throws Exception {
        ListFrame lf = new ListFrame();
        lf.add(new Frame(9, 0));
        lf.add(new Frame(9, 0));
        lf.add(new Frame(9, 0));
        lf.add(new Frame(9, 0));
        lf.add(new Frame(9, 0));
        lf.add(new Frame(9, 0));
        lf.add(new Frame(9, 0));
        lf.add(new Frame(9, 0));
        lf.add(new Frame(9, 0));
        lf.add(new Frame(9, 0));
        assertEquals(10, lf.calculScore());

    }

    @Test
    public void testCalculScoreOnlySpare(){

    }
}