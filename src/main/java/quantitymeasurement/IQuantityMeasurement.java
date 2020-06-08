package quantitymeasurement;

public interface IQuantityMeasurement {

    public double add(QuantityMeasurement quantityMeasurement1, QuantityMeasurement quantityMeasurement2, Unit unit);
    public boolean equals(Object o);
    public double convert(double value, Unit unit1, Unit unit2);

}
