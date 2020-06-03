package quantitymeasurement;

public class QuantityMeasurement {

    Unit unit;
    Double value;

    public QuantityMeasurement(Double value, Unit unit) throws QuantityMeasurementException {
        try {
            this.unit = unit;
            this.value = value*unit.getInchConversionValue();
        } catch (NullPointerException e) {
            throw new QuantityMeasurementException("Entered Null", QuantityMeasurementException.ExceptionType.ENTERED_NULL);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuantityMeasurement quantityMeasurement = (QuantityMeasurement) o;
        return Double.compare(quantityMeasurement.value, value) == 0 ;
    }

}
