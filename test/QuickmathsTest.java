import org.junit.Test;

import static org.junit.Assert.*;

public class QuickmathsTest {

    @Test
    public void sum() {

        Quickmaths q = new Quickmaths();

        assertEquals(100, q.sum(50, 50));
        assertEquals(100000, q.sum(99999, 1));
        assertEquals(0, q.sum(0, 0));
        assertEquals(-3, q.sum(-3, 0));
        assertEquals(-100000, q.sum(-99999, -1));

    }

    @Test
    public void gennemsnit() {

        Quickmaths q = new Quickmaths();
        assertEquals(3.5, q.gennemsnit(3, 4), 0.00000000001);
    }


}