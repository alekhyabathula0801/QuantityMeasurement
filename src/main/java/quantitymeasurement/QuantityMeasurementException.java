package quantitymeasurement;

public class QuantityMeasurementException extends RuntimeException {

    enum ExceptionType {ENTERED_NULL, CANNOT_ADD_THESE_MEASUREMENTS}

    ExceptionType type;

    public QuantityMeasurementException(String message, ExceptionType type) {
        super(message);
        this.type = type;
    }

}
