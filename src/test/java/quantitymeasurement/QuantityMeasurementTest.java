package quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
import static quantitymeasurement.QuantityMeasurementException.ExceptionType.ENTERED_NULL;

public class QuantityMeasurementTest {

    @Test
    public void givenTwoQuantitiesOfFeet_whenEqual_shouldReturnEqual() {
        try {
            QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(0.0, Unit.FEET);
            QuantityMeasurement quantityMeasurement2 = new QuantityMeasurement(0.0, Unit.FEET);
            assertEquals(quantityMeasurement1, quantityMeasurement2);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenSameReferenceOfFeet_whenEqual_shouldReturnEqual() {
        try {
            QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(1.0, Unit.FEET);
            assertEquals(quantityMeasurement1, quantityMeasurement1);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenNullQuantityOfFeet_shouldThrowException() {
        try {
            QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(0.0, Unit.FEET);
            QuantityMeasurement quantityMeasurement2 = new QuantityMeasurement(null, Unit.FEET);
        } catch (QuantityMeasurementException e) {
            assertEquals(ENTERED_NULL,e.type);
        }
    }

    @Test
    public void givenTwoQuantitiesOfFeet_whenNotEqual_shouldReturnNotEqual() {
        try {
            QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(0.0, Unit.FEET);
            QuantityMeasurement quantityMeasurement2 = new QuantityMeasurement(1.0, Unit.FEET);
            assertNotEquals(quantityMeasurement1, quantityMeasurement2);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenTwoQuantitiesOfInch_whenEqual_shouldReturnEqual() {
        try {
            QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(0.0, Unit.INCH);
            QuantityMeasurement quantityMeasurement2 = new QuantityMeasurement(0.0, Unit.INCH);
            assertEquals(quantityMeasurement1, quantityMeasurement2);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenNullQuantityOfInch_shouldThrowException() {
        try {
            QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(0.0, Unit.INCH);
            QuantityMeasurement quantityMeasurement2 = new QuantityMeasurement(null, Unit.INCH);
        } catch (QuantityMeasurementException e) {
            assertEquals(ENTERED_NULL,e.type);
        }
    }

    @Test
    public void givenTwoQuantitiesOfInch_whenNotEqual_shouldReturnNotEqual() {
        try {
            QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(0.0, Unit.INCH);
            QuantityMeasurement quantityMeasurement2 = new QuantityMeasurement(1.0, Unit.INCH);
            assertNotEquals(quantityMeasurement1, quantityMeasurement2);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenQuantities12InchAnd1Feet_whenEqual_shouldReturnTrue() {
        try {
            QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(12.0, Unit.INCH);
            QuantityMeasurement quantityMeasurement2 = new QuantityMeasurement(1.0, Unit.FEET);
            assertEquals(quantityMeasurement1,quantityMeasurement2);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void given1InchAnd1Feet_whenNotEqual_shouldReturnFalse() {
        try {
            QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(1.0, Unit.INCH);
            QuantityMeasurement quantityMeasurement2 = new QuantityMeasurement(1.0, Unit.FEET);
            assertNotEquals(quantityMeasurement1,quantityMeasurement2);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void given0InchAnd0Feet_whenEqual_shouldReturnTrue() {
        try {
            QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(0.0, Unit.INCH);
            QuantityMeasurement quantityMeasurement2 = new QuantityMeasurement(0.0, Unit.FEET);
            assertEquals(quantityMeasurement1,quantityMeasurement2);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenQuantities1InchAnd12Feet_whenNotEqual_shouldReturnTrue() {
        try {
            QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(1.0, Unit.INCH);
            QuantityMeasurement quantityMeasurement2 = new QuantityMeasurement(12.0, Unit.FEET);
            assertNotEquals(quantityMeasurement1,quantityMeasurement2);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void given1FeetAnd1Inch_whenNotEqual_shouldReturnFalse() {
        try {
            QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(1.0, Unit.FEET);
            QuantityMeasurement quantityMeasurement2 = new QuantityMeasurement(1.0, Unit.INCH);
            assertNotEquals(quantityMeasurement1,quantityMeasurement2);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void given3FeetAnd1Yard_whenEqual_shouldReturnFalse() {
        try {
            QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(3.0, Unit.FEET);
            QuantityMeasurement quantityMeasurement2 = new QuantityMeasurement(1.0, Unit.YARD);
            assertEquals(quantityMeasurement1,quantityMeasurement2);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenQuantities36InchAnd1Yard_whenEqual_shouldReturnTrue() {
        try {
            QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(36.0, Unit.INCH);
            QuantityMeasurement quantityMeasurement2 = new QuantityMeasurement(1.0, Unit.YARD);
            assertEquals(quantityMeasurement1,quantityMeasurement2);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void given1YardAnd3Feet_whenEqual_shouldReturnFalse() {
        try {
            QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(1.0, Unit.YARD);
            QuantityMeasurement quantityMeasurement2 = new QuantityMeasurement(3.0, Unit.FEET);
            assertEquals(quantityMeasurement1,quantityMeasurement2);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenQuantities1YardAnd36Inch_whenEqual_shouldReturnTrue() {
        try {
            QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(1.0, Unit.YARD);
            QuantityMeasurement quantityMeasurement2 = new QuantityMeasurement(36.0, Unit.INCH);
            assertEquals(quantityMeasurement1,quantityMeasurement2);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void given1YardAnd1Feet_whenNotEqual_shouldReturnFalse() {
        try {
            QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(1.0, Unit.YARD);
            QuantityMeasurement quantityMeasurement2 = new QuantityMeasurement(1.0, Unit.FEET);
            assertNotEquals(quantityMeasurement1,quantityMeasurement2);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenQuantities1InchAnd1Yard_whenNotEqual_shouldReturnFalse() {
        try {
            QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(1.0, Unit.INCH);
            QuantityMeasurement quantityMeasurement2 = new QuantityMeasurement(1.0, Unit.YARD);
            assertNotEquals(quantityMeasurement1,quantityMeasurement2);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenQuantities2InchAnd1Yard_whenNotEqual_shouldReturnFalse() {
        try {
            assertNotEquals(new QuantityMeasurement(2.0, Unit.INCH),new QuantityMeasurement(1.0, Unit.YARD));
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenQuantities1InchAnd1Centimetre_whenNotEqual_shouldReturnFalse() {
        try {
            assertNotEquals(new QuantityMeasurement(1.0, Unit.INCH),new QuantityMeasurement(1.0, Unit.CENTIMETRE));
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenQuantities2InchAnd5Centimetre_whenEqual_shouldReturnTrue() {
        try {
            assertEquals(new QuantityMeasurement(2.0, Unit.INCH),new QuantityMeasurement(5.08, Unit.CENTIMETRE));
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenQuantitiesYardAndCentimetreValues_whenEqual_shouldReturnTrue() {
        try {
            assertEquals(new QuantityMeasurement(0.01, Unit.YARD),new QuantityMeasurement(1.0, Unit.CENTIMETRE));
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenQuantitiesFootAndCentimetreValues_whenEqual_shouldReturnTrue() {
        try {
            assertEquals(new QuantityMeasurement(0.49, Unit.FEET),new QuantityMeasurement(15.0, Unit.CENTIMETRE));
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenQuantities5CentimetreAnd2Inch_whenEqual_shouldReturnTrue() {
        try {
            assertEquals(new QuantityMeasurement(5.08, Unit.CENTIMETRE),new QuantityMeasurement(2.0, Unit.INCH));
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenQuantities1CentimetreAnd2Inch_whenNotEqual_shouldReturnFalse() {
        try {
            assertNotEquals(new QuantityMeasurement(1.0, Unit.CENTIMETRE),new QuantityMeasurement(2.0, Unit.INCH));
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }


    @Test
    public void givenQuantities1CentimetreAnd2Feet_whenNotEqual_shouldReturnFalse() {
        try {
            assertNotEquals(new QuantityMeasurement(1.0, Unit.CENTIMETRE),new QuantityMeasurement(2.0, Unit.FEET));
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenQuantities1CentimetreAnd1Yard_whenNotEqual_shouldReturnFalse() {
        try {
            assertNotEquals(new QuantityMeasurement(1.0, Unit.CENTIMETRE),new QuantityMeasurement(1.0, Unit.YARD));
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenQuantities0CentimetreAnd0Inch_whenEqual_shouldReturnTrue() {
        try {
            assertEquals(new QuantityMeasurement(0.0, Unit.CENTIMETRE),new QuantityMeasurement(0.0, Unit.FEET));
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

}
