import junit.framework.TestCase;

public class MainTest extends TestCase {


    public void testHelloAndras() {

        Main m = new Main(); // man kan fjerne dette grundet af at jeg har gjort hello static, lader det være grundet af at
                            // det virker forkert at fjerne det, eftersom du har skrevet det :/

        assertEquals("Hello András", m.hello("András"));
        //fyfy, de skal være ens, der må ikke være "!" ekstra i testen :D

    }
            //var det virkeligt kun at fjerne "!" ?,
            // ville være mere korrekt hvis de ikke var der i forvejen :/

    public void testHelloEmptyString() {

        Main m = new Main();

        assertEquals("Hello World", m.hello(""));
    }
}