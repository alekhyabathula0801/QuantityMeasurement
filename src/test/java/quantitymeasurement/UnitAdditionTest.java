package quantitymeasurement;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UnitAdditionTest {

    UnitAddition unitAddition;

    @Before
    public void setUp() throws Exception {
        unitAddition = new UnitAddition();
    }

    @Test
    public void given2inchAnd2inch_whenAdded_shouldReturn4() {
        double result = unitAddition.add(new QuantityMeasurement(2.0,Unit.INCH),new QuantityMeasurement(2.0,Unit.INCH));
        assertEquals(4.0,result,0.0);
    }

    @Test
    public void given1FeetAnd2inch_whenAdded_shouldReturn14() {
        double result = unitAddition.add(new QuantityMeasurement(1.0,Unit.FEET),new QuantityMeasurement(2.0,Unit.INCH));
        assertEquals(14.0,result,0.0);
    }

    @Test
    public void given1FeetAnd1Feet_whenAdded_shouldReturn24() {
        double result = unitAddition.add(new QuantityMeasurement(1.0,Unit.FEET),new QuantityMeasurement(1.0,Unit.FEET));
        assertEquals(24.0,result,0.0);
    }

    @Test
    public void givenInchAndCentimetreValues_whenAdded_shouldReturnResults() {
        double result = unitAddition.add(new QuantityMeasurement(2.0,Unit.INCH),new QuantityMeasurement(2.5,Unit.CENTIMETRE));
        assertEquals(3,result,0.02);
    }

    @Test
    public void given1InchAnd2Yard_whenAdded_shouldReturn73() {
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(1.0,Unit.INCH);
        QuantityMeasurement quantityMeasurement2 = new QuantityMeasurement(2.0,Unit.YARD);
        double result = unitAddition.add(quantityMeasurement1,quantityMeasurement2);
        assertEquals(73,result,0.0);
    }

    @Test
    public void given1FeetAnd2Yard_whenAdded_shouldReturn84() {
        double result = unitAddition.add(new QuantityMeasurement(1.0,Unit.FEET),new QuantityMeasurement(2.0,Unit.YARD));
        assertEquals(84.0,result,0.0);
    }

}
