package quantitymeasurement;

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
            QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
            QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(12.0, Unit.INCH);
            QuantityMeasurement quantityMeasurement2 = new QuantityMeasurement(1.0, Unit.FEET);
            boolean results = quantityMeasurement.compare(quantityMeasurement1, quantityMeasurement2);
            assertTrue(results);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void given1InchAnd1Feet_whenNotEqual_shouldReturnFalse() {
        try {
            QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
            QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(1.0, Unit.INCH);
            QuantityMeasurement quantityMeasurement2 = new QuantityMeasurement(1.0, Unit.FEET);
            boolean results = quantityMeasurement.compare(quantityMeasurement1, quantityMeasurement2);
            assertFalse(results);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenQuantities1InchAnd12Feet_whenNotEqual_shouldReturnTrue() {
        try {
            QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
            QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(1.0, Unit.INCH);
            QuantityMeasurement quantityMeasurement2 = new QuantityMeasurement(12.0, Unit.FEET);
            boolean results = quantityMeasurement.compare(quantityMeasurement1, quantityMeasurement2);
            assertFalse(results);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void given1FeetAnd1Inch_whenNotEqual_shouldReturnFalse() {
        try {
            QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
            QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(1.0, Unit.FEET);
            QuantityMeasurement quantityMeasurement2 = new QuantityMeasurement(1.0, Unit.INCH);
            boolean results = quantityMeasurement.compare(quantityMeasurement1, quantityMeasurement2);
            assertFalse(results);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

}
