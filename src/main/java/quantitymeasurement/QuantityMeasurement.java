package quantitymeasurement;

public class QuantityMeasurement implements IQuantityMeasurement{

    double value;
    IUnit unit;

    public QuantityMeasurement(Double value, Unit unit) {
        if(value == null)
            throw new QuantityMeasurementException("Entered Null", QuantityMeasurementException.ExceptionType.ENTERED_NULL);
        this.unit = unit;
        this.value = unit.getConvertedValue(value,unit);
    }

    public QuantityMeasurement() {
    }

    public double add(QuantityMeasurement quantityMeasurement1, QuantityMeasurement quantityMeasurement2, Unit unit) {
        if(quantityMeasurement1.unit.getMeasurementType() != quantityMeasurement2.unit.getMeasurementType())
            throw new QuantityMeasurementException("Cannot add these measurements",
                                                   QuantityMeasurementException.ExceptionType.CANNOT_ADD_GIVEN_MEASUREMENTS);
        if(unit.getMeasurementType() != quantityMeasurement2.unit.getMeasurementType())
            throw new QuantityMeasurementException("Cannot convert to given Unit",
                                                   QuantityMeasurementException.ExceptionType.INVALID_CONVERSION);
        if(quantityMeasurement2.unit.getMeasurementType().equals("TEMPERATURE"))
            throw new QuantityMeasurementException("Cannot convert to given Unit",
                                                   QuantityMeasurementException.ExceptionType.CANNOT_ADD_TEMPERATURE_MEASUREMENTS);
        return (quantityMeasurement1.value + quantityMeasurement2.value)/unit.getConversionValue();
    }

    public double convert(double value, Unit unit1, Unit unit2) {
        if(unit1.getMeasurementType() != unit2.getMeasurementType())
            throw new QuantityMeasurementException("Invalid conversion",
                                                    QuantityMeasurementException.ExceptionType.INVALID_CONVERSION);
        if(unit1.getMeasurementType() != "TEMPERATURE")
            return unit1.getConvertedValue(value,unit1)/unit2.getConversionValue();
        double kelvinValue = unit1.getConvertedValue(value,unit1);
        if(unit2.equals(Unit.FAHRENHEIT))
            return TemperatureConversion.FAHRENHEIT.getConvertedValue(kelvinValue);
        if(unit2.equals(Unit.CELCIUS))
            return TemperatureConversion.CELCIUS.getConvertedValue(kelvinValue);
        return kelvinValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuantityMeasurement quantityMeasurement = (QuantityMeasurement) o;
        return Double.compare(Math.round(quantityMeasurement.value*1000000.0)/1000000.0,Math.round(value*1000000.0)/1000000.0) == 0 &&
               quantityMeasurement.unit.getMeasurementType() == unit.getMeasurementType();
    }

}
