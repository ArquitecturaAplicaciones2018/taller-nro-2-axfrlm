import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class TestRational {
    Rational r = new Rational(1,2);
    Rational r2 = new Rational(1,4);

    public TestRational() {

    }

    @Test
    public void isLessThanTest() {

        assertEquals(false, r.isLessThan(r2));
    }

    @Test
    public void getGreaterTest() {

        assertEquals("1/2",r.getGreater(r2).toString());
    }
    @Test
    public void plusTest() {

        assertEquals("3/4", r.plus(r2).toString());
    }
    @Test
    public void minusTest() {
        assertEquals("1/4", r.minus(r2).toString());
    }
    @Test
    public void timesTest() {
        assertEquals("1/8", r.times(r2).toString());
    }
    @Test
    public void dividesTest() {
        assertEquals("2", r.divides(r2).toString());
    }


}
