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

    @Test
    public void givenCentimetreUnit_shouldReturnInchValue() {
        double value = Unit.CENTIMETRE.getConversionValue();
        assertEquals(0.39,value,0.01);
    }

    @Test
    public void givenLitreUnit_shouldReturnLitreValue() {
        double value = Unit.LITRE.getConversionValue();
        assertEquals(1,value,0.0);
    }

    @Test
    public void givenGallonUnit_shouldReturnLitreValue() {
        double value = Unit.GALLON.getConversionValue();
        assertEquals(3.78,value,0.0);
    }

    @Test
    public void givenMilliLitreUnit_shouldReturnLitreValue() {
        double value = Unit.MILLILITRE.getConversionValue();
        assertEquals(0.001,value,0.0);
    }

}
