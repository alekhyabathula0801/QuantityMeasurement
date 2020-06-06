package quantitymeasurement;

public interface IUnit {

    public double getConvertedValue(double value,Unit unit);
    public Double getConversionValue();
    public String getMeasurementType();

}
