package quantitymeasurement;

public enum Unit {

    FEET(304.8,"LENGTH"), INCH(25.4,"LENGTH"), YARD(914.4,"LENGTH"),CENTIMETRE(10.0,"LENGTH"), METRE(1000.0,"LENGTH"),
    KILOMETRE(1000000.0,"LENGTH"), MILLIMETRE(1.0,"LENGTH"), LITRE(1000.0,"VOLUME"), GALLON(3785.41,"VOLUME"),
    MILLILITRE(1.0,"VOLUME"), GRAM(1.0,"MASS"), KILOGRAM(1000.0,"MASS"),
    TONNE(1000000.0,"MASS");

    private final Double conversionValue;
    final String measurementType;

    Unit(Double conversionValue,String measurementType) {
        this.conversionValue = conversionValue;
        this.measurementType = measurementType;
    }

    public Double getConversionValue() {
        return conversionValue;
    }

}
