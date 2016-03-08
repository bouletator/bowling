import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by 21504999 on 07/03/2016.
 */
public class Main {

    @Test
    public void Test_01()
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


        System.out.println(lf.calculScore());
    }

    @Test
    public void Test_02()
    {
        ListFrame lf = new ListFrame();

        lf.add(new Frame(10, 0));
        lf.add(new Frame(10, 0));
        lf.add(new Frame(10, 0));
        lf.add(new Frame(10, 0));
        lf.add(new Frame(10, 0));
        lf.add(new Frame(10, 0));
        lf.add(new Frame(10, 0));
        lf.add(new Frame(10, 0));
        lf.add(new Frame(10, 0));
        lf.add(new Frame(10, 0));
        lf.add(new Frame(10, 0));
        lf.add(new Frame(10, 0));


        System.out.println(lf.calculScore());
    }

    @Test
    public void Test_03()
    {
        ListFrame lf = new ListFrame();

        lf.add(new Frame(5, 5));
        lf.add(new Frame(5, 5));
        lf.add(new Frame(5, 5));
        lf.add(new Frame(5, 5));
        lf.add(new Frame(5, 5));
        lf.add(new Frame(5, 5));
        lf.add(new Frame(5, 5));
        lf.add(new Frame(5, 5));
        lf.add(new Frame(5, 5));
        lf.add(new Frame(5, 5));
        lf.add(new Frame(5, 0));

        System.out.println(lf.calculScore());
    }
}
