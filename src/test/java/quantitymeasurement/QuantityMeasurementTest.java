package quantitymeasurement;

import org.junit.Test;

import static org.junit.Assert.*;
import static quantitymeasurement.QuantityMeasurementException.ExceptionType.ENTERED_NULL;

public class QuantityMeasurementTest {

    @Test
    public void givenTwoQuantitiesOfFeet_whenEqual_shouldReturnEqual() {
        try {
            Length length1 = new Length(0.0, Length.Unit.FEET);
            Length length2 = new Length(0.0, Length.Unit.FEET);
            assertEquals(length1, length2);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenNullQuantityOfFeet_shouldThrowException() {
        try {
            Length length1 = new Length(0.0, Length.Unit.FEET);
            Length length2 = new Length(null, Length.Unit.FEET);
        } catch (QuantityMeasurementException e) {
            assertEquals(ENTERED_NULL,e.type);
        }
    }

    @Test
    public void givenTwoQuantitiesOfFeet_whenNotEqual_shouldReturnNotEqual() {
        try {
            Length length1 = new Length(0.0, Length.Unit.FEET);
            Length length2 = new Length(1.0, Length.Unit.FEET);
            assertNotEquals(length1, length2);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenTwoQuantitiesOfInch_whenEqual_shouldReturnEqual() {
        try {
            Length length1 = new Length(0.0, Length.Unit.INCH);
            Length length2 = new Length(0.0, Length.Unit.INCH);
            assertEquals(length1, length2);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenNullQuantityOfInch_shouldThrowException() {
        try {
            Length length1 = new Length(0.0, Length.Unit.INCH);
            Length length2 = new Length(null, Length.Unit.INCH);
        } catch (QuantityMeasurementException e) {
            assertEquals(ENTERED_NULL,e.type);
        }
    }

    @Test
    public void givenTwoQuantitiesOfInch_whenNotEqual_shouldReturnNotEqual() {
        try {
            Length length1 = new Length(0.0, Length.Unit.INCH);
            Length length2 = new Length(1.0, Length.Unit.INCH);
            assertNotEquals(length1, length2);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

}
