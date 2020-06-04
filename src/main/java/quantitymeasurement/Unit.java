package quantitymeasurement;

public enum Unit {

    FEET(12.0), INCH(1.0), YARD(36.0), CENTIMETRE(1.0/2.54);
    private final Double inchConversionValue;

    Unit(Double inchConversionValue) {
        this.inchConversionValue = inchConversionValue;
    }

    public Double getInchConversionValue() {
        return inchConversionValue;
    }

}
