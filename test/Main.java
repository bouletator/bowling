import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by 21504999 on 07/03/2016.
 */
public class Main {
    @Test
    public void main()
    {
        ListFrame lf = new ListFrame();

      /* lf.add(new Frame(8, 1, false, false));
       lf.add(new Frame(9, 1, false, false));
       lf.add(new Frame(10, 0, false, true));
       lf.add(new Frame(10, 0, false, true));
       lf.add(new Frame(8, 1, false, false));
       lf.add(new Frame(7, 2, false, false));
       lf.add(new Frame(10, 0, false, true));
       lf.add(new Frame(10, 0, false, true));
       lf.add(new Frame(10, 0, false, true));
       lf.add(new Frame(8, 9, false, false));*/

/*        lf.add(new Frame(9, 0, false, false));
        lf.add(new Frame(9, 0, false, false));
        lf.add(new Frame(9, 0, false, false));
        lf.add(new Frame(9, 0, false, false));
        lf.add(new Frame(9, 0, false, false));
        lf.add(new Frame(9, 0, false, false));
        lf.add(new Frame(9, 0, false, false));
        lf.add(new Frame(9, 0, false, false));
        lf.add(new Frame(9, 0, false, false));
        lf.add(new Frame(9, 0, false, false));*/

/*        lf.add(new Frame(10, 0, false, true));
        lf.add(new Frame(10, 0, false, true));
        lf.add(new Frame(10, 0, false, true));
        lf.add(new Frame(10, 0, false, true));
        lf.add(new Frame(10, 0, false, true));
        lf.add(new Frame(10, 0, false, true));
        lf.add(new Frame(10, 0, false, true));
        lf.add(new Frame(10, 0, false, true));
        lf.add(new Frame(10, 0, false, true));
        lf.add(new Frame(10, 0, false, true));
        lf.add(new Frame(10, 0, false, false));*/

        lf.add(new Frame(5, 0, true, false));
        lf.add(new Frame(5, 0, true, false));
        lf.add(new Frame(5, 0, true, false));
        lf.add(new Frame(5, 0, true, false));
        lf.add(new Frame(5, 0, true, false));
        lf.add(new Frame(5, 0, true, false));
        lf.add(new Frame(5, 0, true, false));
        lf.add(new Frame(5, 0, true, false));
        lf.add(new Frame(5, 0, true, false));
        lf.add(new Frame(5, 0, false, false));

        System.out.println(lf.calculScore());
    }
}
