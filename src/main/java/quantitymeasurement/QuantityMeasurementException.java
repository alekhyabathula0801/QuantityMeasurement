package quantitymeasurement;

public class QuantityMeasurementException extends RuntimeException {

    enum ExceptionType {ENTERED_NULL,CANT_COMPARE_THESE_UNITS}

    ExceptionType type;

    public QuantityMeasurementException(String message, ExceptionType type) {
        super(message);
        this.type = type;
    }

}
