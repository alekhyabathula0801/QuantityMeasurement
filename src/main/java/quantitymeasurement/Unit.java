package quantitymeasurement;

public enum Unit {

    FEET(304.8,"LENGTH"), INCH(25.4,"LENGTH"), YARD(914.4,"LENGTH"),CENTIMETRE(10.0,"LENGTH"), METRE(1000.0,"LENGTH"),
    KILOMETRE(1000000.0,"LENGTH"), MILLIMETRE(1.0,"LENGTH"), LITRE(1000.0,"VOLUME"), GALLON(3785.41,"VOLUME"),
    MILLILITRE(1.0,"VOLUME"), GRAM(1.0,"MASS"), KILOGRAM(1000.0,"MASS"),
    TONNE(1000000.0,"MASS"), KELVIN(1.0,"TEMPERATURE",0.0,0.0),
    CELCIUS(1.0,"TEMPERATURE",273.15,0.0), FAHRENHEIT(5.0/9.0,"TEMPERATURE",-32.0,273.15);

    private final Double conversionValue;
    final String measurementType;

    Unit(Double conversionValue,String measurementType) {
        this.conversionValue = conversionValue;
        this.measurementType = measurementType;
        temperatureConversion1 = null;
        temperatureConversion2 = null;
    }

    private final Double temperatureConversion1;
    private final Double temperatureConversion2;

    Unit(Double conversionValue, String measurementType, Double temperatureConversion1, Double temperatureConversion2) {
        this.conversionValue = conversionValue;
        this.measurementType = measurementType;
        this.temperatureConversion1 = temperatureConversion1;
        this.temperatureConversion2 = temperatureConversion2;
    }

    public double getConvertedValue(double value,Unit unit) {
        if(unit.measurementType != "TEMPERATURE")
            return conversionValue*value;
        return conversionValue*(value+ temperatureConversion1) + temperatureConversion2;
    }

    public Double getConversionValue() {
        return conversionValue;
    }

}
