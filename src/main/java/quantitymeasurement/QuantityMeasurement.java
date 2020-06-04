package quantitymeasurement;

public class QuantityMeasurement {

    double value;
    Unit unit;

    public QuantityMeasurement(Double value, Unit unit) {
        try {
            this.unit = unit;
            this.value = value*unit.getConversionValue();
        } catch (NullPointerException e) {
            throw new QuantityMeasurementException("Entered Null", QuantityMeasurementException.ExceptionType.ENTERED_NULL);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuantityMeasurement quantityMeasurement = (QuantityMeasurement) o;
        return Double.compare(Math.round(quantityMeasurement.value*100)/100, Math.round(100*value)/100) == 0 &&
                quantityMeasurement.unit.measurementType == unit.measurementType;
    }

}
