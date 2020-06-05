package quantitymeasurement;

public class QuantityMeasurementException extends RuntimeException {

    enum ExceptionType {ENTERED_NULL, CANNOT_ADD_THESE_MEASUREMENTS,CANNOT_CONVERT_TO_GIVEN_UNIT
    }

    ExceptionType type;

    public QuantityMeasurementException(String message, ExceptionType type) {
        super(message);
        this.type = type;
    }

}
