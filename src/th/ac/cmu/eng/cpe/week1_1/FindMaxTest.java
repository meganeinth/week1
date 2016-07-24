package th.ac.cmu.eng.cpe.week1_1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by pruet on 24/7/2559.
 */
public class FindMaxTest {
    private FindMax fm;
    @Before
    public void setUp() throws Exception {
        fm = new FindMax();
    }

    @Test
    public void execAccending() throws Exception {
        assertEquals(8, fm.exec(new int[]{1, 2, 3, 4, 5, 6, 7, 8}));
    }

    @Test
    public void execDescending() throws Exception {
        assertEquals(8, fm.exec(new int[]{8, 7, 6, 5, 4, 3, 2, 1}));
    }

    @Test
    public void execRandom() throws Exception {
        assertEquals(8, fm.exec(new int[]{3, 5, 8, 2, 4, 3, 6, 7}));
    }
}