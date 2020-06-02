package quantitymeasurement;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EnumUnitTest {

    @Test
    public void givenFeetUnit_shouldReturnInchValue() {
        double value = Unit.FEET.inchConversionValue;
        assertEquals(12,value,0.0);
    }

    @Test
    public void givenInchUnit_shouldReturnInchValue() {
        double value = Unit.INCH.inchConversionValue;
        assertEquals(1,value,0.0);
    }

}
