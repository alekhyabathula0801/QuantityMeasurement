package quantitymeasurement;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EnumUnitTest {

    @Test
    public void givenFeetUnit_shouldReturnInMillimetreValue() {
        double value = Unit.FEET.getConversionValue();
        assertEquals(304.8,value,0.0);
    }

    @Test
    public void givenInchUnit_shouldReturnInMillimetreValue() {
        double value = Unit.INCH.getConversionValue();
        assertEquals(25.4,value,0.0);
    }

    @Test
    public void givenYardUnit_shouldReturnInMillimetreValue() {
        double value = Unit.YARD.getConversionValue();
        assertEquals(914.4,value,0.0);
    }

    @Test
    public void givenCentimetreUnit_shouldReturnInMillimetreValue() {
        double value = Unit.CENTIMETRE.getConversionValue();
        assertEquals(10.0,value,0.0);
    }

    @Test
    public void givenMetreUnit_shouldReturnInMillimetreValue() {
        double value = Unit.METRE.getConversionValue();
        assertEquals(1000.0,value,0.0);
    }

    @Test
    public void givenKilometreUnit_shouldReturnInMillimetreValue() {
        double value = Unit.KILOMETRE.getConversionValue();
        assertEquals(1000000.0,value,0.0);
    }

    @Test
    public void givenMillimetreUnit_shouldReturnInMillimetreValue() {
        double value = Unit.MILLIMETRE.getConversionValue();
        assertEquals(1.0,value,0.0);
    }

    @Test
    public void givenLitreUnit_shouldReturnMillilitreValue() {
        double value = Unit.LITRE.getConversionValue();
        assertEquals(1000,value,0.0);
    }

    @Test
    public void givenGallonUnit_shouldReturnMillilitreValue() {
        double value = Unit.GALLON.getConversionValue();
        assertEquals(3785.41,value,0.0);
    }

    @Test
    public void givenMilliLitreUnit_shouldReturnLitreValue() {
        double value = Unit.MILLILITRE.getConversionValue();
        assertEquals(1,value,0.0);
    }

    @Test
    public void givenGramUnit_shouldReturnGramValue() {
        double value = Unit.GRAM.getConversionValue();
        assertEquals(1,value,0.0);
    }

    @Test
    public void givenKilogramUnit_shouldReturnGramValue() {
        double value = Unit.KILOGRAM.getConversionValue();
        assertEquals(1000,value,0.0);
    }

    @Test
    public void givenTonneUnit_shouldReturnGramValue() {
        double value = Unit.TONNE.getConversionValue();
        assertEquals(1000000,value,0.0);
    }

    @Test
    public void givenFeetUnit_shouldReturnMeasurementType() {
        String measurementType = Unit.FEET.getMeasurementType();
        assertEquals("LENGTH",measurementType);
    }

    @Test
    public void givenGramUnit_shouldReturnMeasurementType() {
        String measurementType = Unit.GRAM.getMeasurementType();
        assertEquals("MASS",measurementType);
    }

    @Test
    public void givenLitreUnit_shouldReturnMeasurementType() {
        String measurementType = Unit.LITRE.getMeasurementType();
        assertEquals("VOLUME",measurementType);
    }

    @Test
    public void givenKelvinUnit_shouldReturnMeasurementType() {
        String measurementType = Unit.KELVIN.getMeasurementType();
        assertEquals("TEMPERATURE",measurementType);
    }

}
