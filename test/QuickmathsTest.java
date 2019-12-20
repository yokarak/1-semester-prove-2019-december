import org.junit.Test;

import static org.junit.Assert.*;

public class QuickmathsTest {

    @Test
    public void testSum() {
      assertEquals(10,Quickmaths.sum(5,5));
      //det at metoderne er static gør test meget hurtigere, og forhindre mig i at skulle skrive en masse
    }

    @Test
    public void testGennemsnit() {
        assertEquals(7.0, Quickmaths.gennemsnit( 3,  12),0.1);
        //eftersom det er integers, så kan man kun dele lige over
    }

}