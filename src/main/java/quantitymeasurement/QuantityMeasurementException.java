package quantitymeasurement;

public class QuantityMeasurementException extends RuntimeException {

    enum ExceptionType {CANNOT_ADD_GIVEN_MEASUREMENTS,CANNOT_CONVERT_TO_GIVEN_UNIT,CANNOT_ADD_TEMPERATURE_MEASUREMENTS,
                        ENTERED_NULL}

    ExceptionType type;

    public QuantityMeasurementException(String message, ExceptionType type) {
        super(message);
        this.type = type;
    }

}
