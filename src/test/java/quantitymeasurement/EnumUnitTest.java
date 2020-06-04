package quantitymeasurement;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EnumUnitTest {

    @Test
    public void givenFeetUnit_shouldReturnInchValue() {
        double value = Unit.FEET.getConversionValue();
        assertEquals(12,value,0.0);
    }

    @Test
    public void givenInchUnit_shouldReturnInchValue() {
        double value = Unit.INCH.getConversionValue();
        assertEquals(1,value,0.0);
    }

    @Test
    public void givenYardUnit_shouldReturnInchValue() {
        double value = Unit.YARD.getConversionValue();
        assertEquals(36,value,0.0);
    }

}
