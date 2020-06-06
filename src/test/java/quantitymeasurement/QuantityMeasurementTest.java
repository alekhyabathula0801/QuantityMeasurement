package quantitymeasurement;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static quantitymeasurement.QuantityMeasurementException.ExceptionType.CANNOT_ADD_TEMPERATURE_MEASUREMENTS;
import static quantitymeasurement.QuantityMeasurementException.ExceptionType.ENTERED_NULL;

public class QuantityMeasurementTest {

    IQuantityMeasurement quantityMeasurement;

    @Before
    public void setUp() throws Exception {
        quantityMeasurement = new QuantityMeasurement();
    }

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
    public void givenQuantities1InchAnd12Feet_whenNotEqual_shouldReturnFalse() {
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
    public void given3FeetAnd1Yard_whenEqual_shouldReturnTrue() {
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
    public void given1YardAnd3Feet_whenEqual_shouldReturnTrue() {
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
            assertEquals(new QuantityMeasurement(0.01, Unit.YARD),new QuantityMeasurement(0.9144, Unit.CENTIMETRE));
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenQuantitiesFootAndCentimetreValues_whenEqual_shouldReturnTrue() {
        try {
            assertEquals(new QuantityMeasurement(0.49, Unit.FEET),new QuantityMeasurement(14.9352, Unit.CENTIMETRE));
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

    @Test
    public void givenQuantities100CentimetreAnd1Metre_whenEqual_shouldReturnTrue() {
        try {
            assertEquals(new QuantityMeasurement(100.0, Unit.CENTIMETRE),new QuantityMeasurement(1.0, Unit.METRE));
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenQuantities1KilometreAnd1000Metre_whenEqual_shouldReturnTrue() {
        try {
            assertEquals(new QuantityMeasurement(1.0, Unit.KILOMETRE),new QuantityMeasurement(1000.0, Unit.METRE));
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenQuantities0LitreAnd0Gallon_whenEqual_shouldReturnTrue() {
        try {
            assertEquals(new QuantityMeasurement(0.0, Unit.LITRE),new QuantityMeasurement(0.0, Unit.GALLON));
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenQuantities0LitreAnd0Inch_whenNotEqual_shouldReturnFalse() {
        try {
            assertNotEquals(new QuantityMeasurement(0.0, Unit.LITRE),new QuantityMeasurement(0.0, Unit.INCH));
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenQuantities1LitreAnd1Inch_whenNotEqual_shouldReturnFalse() {
        try {
            assertNotEquals(new QuantityMeasurement(1.0, Unit.LITRE),new QuantityMeasurement(1.0, Unit.INCH));
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenQuantitiesLitreAndGallon_whenEqual_shouldReturnTrue() {
        try {
            assertEquals(new QuantityMeasurement(3.78541, Unit.LITRE),new QuantityMeasurement(1.0, Unit.GALLON));
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenQuantities1LitreAnd1000Millilitre_whenEqual_shouldReturnTrue() {
        try {
            assertEquals(new QuantityMeasurement(1.0, Unit.LITRE),new QuantityMeasurement(1000.0, Unit.MILLILITRE));
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenQuantities1LitreAnd1Millilitre_whenNotEqual_shouldReturnFalse() {
        try {
            assertNotEquals(new QuantityMeasurement(1.0, Unit.LITRE),new QuantityMeasurement(1.0, Unit.MILLILITRE));
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenQuantitiesLitreAndMillilitre_whenEqual_shouldReturnTrue() {
        try {
            assertEquals(new QuantityMeasurement(0.001, Unit.LITRE),new QuantityMeasurement(1.0, Unit.MILLILITRE));
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void given2inchAnd2inch_whenAdded_shouldReturnResultsInInch() {
        double result = quantityMeasurement.add(new QuantityMeasurement(2.0,Unit.INCH),new QuantityMeasurement(2.0,Unit.INCH),Unit.INCH);
        assertEquals(4.0,result,0.001);
    }

    @Test
    public void given1FeetAnd2inch_whenAdded_shouldReturnResultsInInch() {
        double result = quantityMeasurement.add(new QuantityMeasurement(1.0,Unit.FEET),new QuantityMeasurement(2.0,Unit.INCH),Unit.INCH);
        assertEquals(14.0,result,0.001);
    }

    @Test
    public void given1FeetAnd1Feet_whenAdded_shouldReturnResultsInInch() {
        double result = quantityMeasurement.add(new QuantityMeasurement(1.0,Unit.FEET),new QuantityMeasurement(1.0,Unit.FEET),Unit.INCH);
        assertEquals(24.0,result,0.001);
    }

    @Test
    public void givenInchAndCentimetreValues_whenAdded_shouldReturnResultsInInch() {
        double result = quantityMeasurement.add(new QuantityMeasurement(2.0,Unit.INCH),new QuantityMeasurement(2.5,Unit.CENTIMETRE),Unit.INCH);
        assertEquals(2.9842,result,0.001);
    }

    @Test
    public void given1InchAnd2Yard_whenAdded_shouldReturnResultsInInch() {
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(1.0,Unit.INCH);
        QuantityMeasurement quantityMeasurement2 = new QuantityMeasurement(2.0,Unit.YARD);
        double result = quantityMeasurement.add(quantityMeasurement1,quantityMeasurement2,Unit.INCH);
        assertEquals(73,result,0.001);
    }

    @Test
    public void given1FeetAnd2Yard_whenAdded_shouldReturnResultsInInch() {
        double result = quantityMeasurement.add(new QuantityMeasurement(1.0,Unit.FEET),new QuantityMeasurement(2.0,Unit.YARD),Unit.INCH);
        assertEquals(84.0,result,0.001);
    }

    @Test
    public void given1FeetAnd2Yard_whenAdded_shouldReturnResultsInMillimetre() {
        double result = quantityMeasurement.add(new QuantityMeasurement(1.0,Unit.FEET),new QuantityMeasurement(2.0,Unit.YARD),Unit.MILLIMETRE);
        assertEquals(2133.6,result,0.001);
    }

    @Test
    public void given1FeetAnd1Litre_shouldThrowException() {
        try {
            quantityMeasurement.add(new QuantityMeasurement(1.0, Unit.FEET), new QuantityMeasurement(1.0, Unit.LITRE),Unit.INCH);
        } catch (QuantityMeasurementException e) {
            assertEquals(QuantityMeasurementException.ExceptionType.CANNOT_ADD_GIVEN_MEASUREMENTS,e.type);
        }
    }

    @Test
    public void given1Litre1LitreToAddAndConvertToInch_shouldThrowException() {
        try {
            quantityMeasurement.add(new QuantityMeasurement(1.0, Unit.LITRE), new QuantityMeasurement(1.0, Unit.LITRE),Unit.INCH);
        } catch (QuantityMeasurementException e) {
            assertEquals(QuantityMeasurementException.ExceptionType.CANNOT_CONVERT_TO_GIVEN_UNIT,e.type);
        }
    }

    @Test
    public void given1000MillilitreAnd1Litre_whenAdded_shouldReturnResultsInLitre() {
        double result = quantityMeasurement.add(new QuantityMeasurement(1000.0,Unit.MILLILITRE),new QuantityMeasurement(1.0,Unit.LITRE),Unit.LITRE);
        assertEquals(2.0,result,0.001);
    }

    @Test
    public void givenGallonAndLitre_whenAdded_shouldReturnResultsInLitre() {
        double result = quantityMeasurement.add(new QuantityMeasurement(1.0,Unit.GALLON),new QuantityMeasurement(3.78,Unit.LITRE),Unit.LITRE);
        assertEquals(7.56541,result,0.001);
    }

    @Test
    public void givenGallonAndLitre_whenAdded_shouldReturnResultsInMilliLitre() {
        double result = quantityMeasurement.add(new QuantityMeasurement(1.0,Unit.GALLON),new QuantityMeasurement(3.78,Unit.LITRE),Unit.MILLILITRE);
        assertEquals(7565.41,result,0.0);
    }

    @Test
    public void givenQuantities1000GramsAnd1Kilogram_whenEqual_shouldReturnTrue() {
        try {
            assertEquals(new QuantityMeasurement(1000.0, Unit.GRAM),new QuantityMeasurement(1.0, Unit.KILOGRAM));
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenQuantities1000KilogramAnd1Tonne_whenEqual_shouldReturnTrue() {
        try {
            assertEquals(new QuantityMeasurement(1000.0, Unit.KILOGRAM),new QuantityMeasurement(1.0, Unit.TONNE));
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenQuantities1000000GramAnd1Tonne_whenEqual_shouldReturnTrue() {
        try {
            assertEquals(new QuantityMeasurement(1000000.0, Unit.GRAM),new QuantityMeasurement(1.0, Unit.TONNE));
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenQuantities0KilogramAnd0Tonne_whenEqual_shouldReturnTrue() {
        try {
            assertEquals(new QuantityMeasurement(0.0, Unit.KILOGRAM),new QuantityMeasurement(0.0, Unit.TONNE));
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenQuantities1KilogramAnd1Tonne_whenNotEqual_shouldReturnFalse() {
        try {
            assertNotEquals(new QuantityMeasurement(1.0, Unit.KILOGRAM),new QuantityMeasurement(1.0, Unit.TONNE));
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenQuantities1GramAnd1Tonne_whenNotEqual_shouldReturnFalse() {
        try {
            assertNotEquals(new QuantityMeasurement(1.0, Unit.GRAM),new QuantityMeasurement(1.0, Unit.TONNE));
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenQuantities1GramAnd1Tonne_whenAdded_shouldReturnResultsInGram() {
        double result = quantityMeasurement.add(new QuantityMeasurement(1.0,Unit.GRAM),new QuantityMeasurement(1.0,Unit.TONNE),Unit.GRAM);
        assertEquals(1000001,result,0.0);
    }

    @Test
    public void givenQuantities1GramAnd1Tonne_whenAdded_shouldReturnResultsInTonne() {
        double result = quantityMeasurement.add(new QuantityMeasurement(1.0,Unit.GRAM),new QuantityMeasurement(1.0,Unit.TONNE),Unit.TONNE);
        assertEquals(1.000001,result,0.0);
    }

    @Test
    public void givenQuantities1000GramAnd1Tonne_whenAdded_shouldReturnResultsInKilogram() {
        double result = quantityMeasurement.add(new QuantityMeasurement(1000.0,Unit.GRAM),new QuantityMeasurement(1.0,Unit.TONNE),Unit.KILOGRAM);
        assertEquals(1001,result,0.0);
    }

    @Test
    public void givenQuantities1000GramAnd1Kilogram_whenAdded_shouldReturnResultsInKilogram() {
        double result = quantityMeasurement.add(new QuantityMeasurement(1000.0,Unit.GRAM),new QuantityMeasurement(1.0,Unit.KILOGRAM),Unit.KILOGRAM);
        assertEquals(2,result,0.0);
    }

    @Test
    public void givenQuantities0KelvinAnd0Kelvin_whenEqual_shouldReturnTrue() {
        try {
            assertEquals(new QuantityMeasurement(0.0, Unit.KELVIN),new QuantityMeasurement(0.0, Unit.KELVIN));
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenQuantities1KelvinAnd1Kelvin_whenEqual_shouldReturnTrue() {
        try {
            assertEquals(new QuantityMeasurement(1.0, Unit.KELVIN),new QuantityMeasurement(1.0, Unit.KELVIN));
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenQuantitiesOfKelvinAndCelcius_whenEqual_shouldReturnTrue() {
        try {
            assertEquals(new QuantityMeasurement(0.0, Unit.KELVIN),new QuantityMeasurement(-273.15, Unit.CELCIUS));
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenQuantitiesOfCelciusAndKelvin_whenEqual_shouldReturnTrue() {
        try {
            assertEquals(new QuantityMeasurement(0.0, Unit.CELCIUS),new QuantityMeasurement(273.15, Unit.KELVIN));
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void given1CelciusAndQuantityOfKelvin_whenEqual_shouldReturnTrue() {
        try {
            assertEquals(new QuantityMeasurement(1.0, Unit.CELCIUS),new QuantityMeasurement(274.15, Unit.KELVIN));
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenQuantitiesOfCelciusAndKelvin_whenNotEqual_shouldReturnFalse() {
        try {
            assertNotEquals(new QuantityMeasurement(1.0, Unit.CELCIUS),new QuantityMeasurement(1.0, Unit.KELVIN));
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenQuantitiesOfKelvinAndFahrenheit_whenEqual_shouldReturnTrue() {
        try {
            assertEquals(new QuantityMeasurement(0.0, Unit.KELVIN),new QuantityMeasurement(-459.67, Unit.FAHRENHEIT));
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenQuantitiesOfCelciusAndFahrenheit_whenEqual_shouldReturnTrue() {
        try {
            assertEquals(new QuantityMeasurement(0.0, Unit.CELCIUS),new QuantityMeasurement(32.0, Unit.FAHRENHEIT));
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenQuantitiesOfFahrenheitAndCelcius_whenEqual_shouldReturnTrue() {
        try {
            assertEquals(new QuantityMeasurement(100.0, Unit.CELCIUS),new QuantityMeasurement(212.0, Unit.FAHRENHEIT));
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenQuantitiesOf0FahrenheitAnd0Celcius_whenNotEqual_shouldReturnFalse() {
        try {
            assertNotEquals(new QuantityMeasurement(0.0, Unit.CELCIUS),new QuantityMeasurement(0.0, Unit.FAHRENHEIT));
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenQuantitiesOf0KelvinAnd0Celcius_whenNotEqual_shouldReturnFalse() {
        try {
            assertNotEquals(new QuantityMeasurement(0.0, Unit.KELVIN),new QuantityMeasurement(0.0, Unit.FAHRENHEIT));
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenQuantitiesOf0KelvinAnd0CelciusToAdd_shouldThrowException() {
        try {
            quantityMeasurement.add(new QuantityMeasurement(0.0, Unit.KELVIN),new QuantityMeasurement(0.0, Unit.FAHRENHEIT),Unit.KELVIN);
        } catch (QuantityMeasurementException e) {
            assertEquals(CANNOT_ADD_TEMPERATURE_MEASUREMENTS,e.type);
        }
    }

}
